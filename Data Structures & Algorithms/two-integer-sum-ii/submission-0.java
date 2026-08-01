class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int l=0, r=numbers.length-1;
        while(l<r){
            if(numbers[l]+numbers[r] == target){
                return new int[]{l+1,r+1};
            }else if(numbers[l]+numbers[r]<target){
                l++;
            }else if(numbers[l]+numbers[r]>target){
                r--;
            }
        }
        return new int[0];
    }
}
