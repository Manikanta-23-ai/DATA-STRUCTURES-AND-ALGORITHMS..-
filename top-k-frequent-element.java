import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums)
            count.put(n, count.getOrDefault(n, 0) + 1);

        Queue<Integer> heap = new PriorityQueue<>((a, b) -> count.get(a) - count.get(b));
        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }

        int[] answer = new int[k];
        for (int i = k - 1; i >= 0; i--)
            answer[i] = heap.poll();
        return answer;
    }
}
