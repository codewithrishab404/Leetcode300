// Solution :-

class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if( i < nums.length-1 && nums[i]==nums[i+1])
            continue;
            else if(i < nums.length-1 && nums[i]!= nums[i+1]){
                nums[count++]=nums[i];
            }
            // this else case is when i is pointing to last element , so we can not check i+1 element as it it will give out of bound error 
            else
            nums[count++] = nums[i];
        }
        
        return count;
    }
}