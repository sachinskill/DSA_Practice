class Solution {
    public int jump(int[] nums) {
            // Agar array mein 1 hi element hai, toh 0 jump chahiye
        if (nums.length <= 1) return 0; 
        
        int jumps = 0;
        int current_end = 0;   // Is jump mein hum kaha tak ja sakte hain
        int farthest = 0;      // Agli jump ke liye sabse door ka rasta kaunsa hai

        // Hum aakhri element se ek pehle tak hi loop chalayenge
        for (int i = 0; i < nums.length - 1; i++) {
            // Har point par check karo ki sabse door kaha pahonch sakte hain
            farthest = Math.max(farthest, i + nums[i]);

            // Jab hum pichli jump ki aakhri limit tak pahonch jayein
            if (i == current_end) {
                jumps++;            // Ek jump badhao
                current_end = farthest; // Agli limit set karo
                
                // Agar hum aakhri element tak ya usse aage pahonch gaye, toh ruk jao
                if (current_end >= nums.length - 1) {
                    break;
                }
            }
        }
        return jumps;

    }
}