class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>());
        return ans;
    }

    private void backtrack(int[] nums, int start, List<Integer> curr) {

        if (curr.size() == 3) {
            int sum = curr.get(0) + curr.get(1) + curr.get(2);

            if (sum == 0) {
                ans.add(new ArrayList<>(curr));
            }
            return;
        }

        for (int i = start; i < nums.length; i++) {

            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1])
                continue;

            curr.add(nums[i]);
            backtrack(nums, i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }
}