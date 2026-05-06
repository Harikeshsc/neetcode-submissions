class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> map = new HashMap<>();
    for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);

    // Min-Heap based on frequency
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(map::get));

    for (int key : map.keySet()) {
        pq.add(key);
        if (pq.size() > k) pq.poll(); // Keep only the top k
    }

    return pq.stream().mapToInt(i -> i).toArray();
    }
}
