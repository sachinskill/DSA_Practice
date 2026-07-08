import java.util.*;

class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        if (wall == null || wall.isEmpty()) {
            return 0;
        }
        int n = wall.size();
        Map<Long, Integer> edgeCount = new HashMap<>();
        
        for (List<Integer> row : wall) {
            long prefix = 0;
            // Skip the last brick to avoid the right edge of the wall
            for (int i = 0; i < row.size() - 1; i++) {
                prefix += row.get(i);
                edgeCount.put(prefix, edgeCount.getOrDefault(prefix, 0) + 1);
            }
        }
        
        int maxEdges = 0;
        for (int count : edgeCount.values()) {
            if (count > maxEdges) {
                maxEdges = count;
            }
        }
        
        return n - maxEdges;
    }
}