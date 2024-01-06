class Solution {
    class Job {
        int start;
        int end;
        int profit;

        public Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = profit.length;
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }

        Arrays.sort(jobs, (j1, j2) -> Integer.compare(j1.end, j2.end));
        List<Integer> dpEndTime = new ArrayList<>();
        List<Integer> dpProfit = new ArrayList<>();
        dpEndTime.add(0);
        dpProfit.add(0);

        for (Job job : jobs) {
            int prevIdx = largestSmaller(dpEndTime, job.start + 1);
            int case2Profit = dpProfit.get(prevIdx) + job.profit;
            int case1Profit = dpProfit.get(dpProfit.size() - 1);
            
            if (case2Profit > case1Profit) {
                dpEndTime.add(job.end);
                dpProfit.add(case2Profit);
            }
        }

        return dpProfit.get(dpProfit.size() - 1);
    }

    private int largestSmaller(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) < target) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return list.get(right) < target ? right : left;
    }
}