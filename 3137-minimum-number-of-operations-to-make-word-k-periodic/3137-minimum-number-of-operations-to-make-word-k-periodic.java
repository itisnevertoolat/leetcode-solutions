class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
            int maxOfAllFrequencies = 0;
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < word.length(); i += k) {
                String sub = word.substring(i, Math.min(i + k, word.length()));
                map.put(sub, map.getOrDefault(sub, 0) + 1);
                maxOfAllFrequencies = maxOfAllFrequencies > map.get(sub) ? maxOfAllFrequencies : map.get(sub);
            }

            return word.length() / k - maxOfAllFrequencies;
        }
}