class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        long count = 0;

        for (int[] interval : intervals) {
            int start = interval[0];

            // Remove intervals that ended before current interval starts
            while (!minHeap.isEmpty() && minHeap.peek() < start) {
                minHeap.poll();
            }

            count += minHeap.size();

            // Add current interval's end
            minHeap.offer(interval[1]);
        }

        return (int) count;
    }
}