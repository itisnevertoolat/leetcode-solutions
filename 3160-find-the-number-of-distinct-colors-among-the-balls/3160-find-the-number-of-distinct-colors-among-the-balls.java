class Solution {
    public int[] queryResults(int limit, int[][] queries) {
    int m = queries.length;
    int[] ans = new int[m];
    Map<Integer, Integer> balls = new HashMap<>();
    Map<Integer, Integer> colors = new HashMap<>();
    for (int i = 0;i < m; i++) {
      int ball = queries[i][0];
      int color = queries[i][1];
      int ballCount = balls.getOrDefault(ball, 0);
      if (ballCount != 0) {
        int colorCount = colors.get(ballCount);
        if (colorCount == 1) {
          colors.remove(ballCount);
        } else {
          colors.put(ballCount, colorCount-1);
        }
      }
      balls.put(ball, color);
      colors.put(color, colors.getOrDefault(color, 0) + 1);
      ans[i] = colors.size();
    }
    return ans;
    }
}