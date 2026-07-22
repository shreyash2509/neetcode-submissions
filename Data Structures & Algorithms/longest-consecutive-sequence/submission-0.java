class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> x = new HashSet<>();
        for (int num : nums) {
            x.add(num);
        }
        int longest = 0;
        for (int num : x) {
            if (!x.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (x.contains(current + 1)) {
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
