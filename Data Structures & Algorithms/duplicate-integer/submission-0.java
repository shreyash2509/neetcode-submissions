class Solution {
    public boolean hasDuplicate(int[] nums) {
          Set<Integer> x = new HashSet<>();


        for (int num : nums) {
            x.add(num);
        }

        return x.size() != nums.length;
    }
}