class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        // Outer loop: Har box i ke liye calculate karo
        for (int i = 0; i < n; i++) {
            int operations = 0;

            // Inner loop: Check karo baki saare boxes j ko
            for (int j = 0; j < n; j++) {
                if (boxes.charAt(j) == '1') {
                    // Distance = abs(i - j)
                    operations += Math.abs(i - j);
                }
            }
            answer[i] = operations;
        }

        return answer;
    }
}