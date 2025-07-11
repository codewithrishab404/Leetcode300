// First we will do a brute force approach

// My Brute Force approach : 
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; //  Handle cases where k > nums.length
        int n=nums.length-k;
        int[] arr = new int[nums.length];
        int count =0;
        for(int i=n;i<arr.length;i++){
            if(count!=k){
                arr[count]=nums[i];
                count++;
            }
        }
        for(int i =0;i<n;i++){
            if(count!=arr.length){
                 arr[count]=nums[i];
                 count++;
            }
           
        }
        for(int i=0;i<nums.length;i++)
        nums[i]=arr[i];
       
    }
}
// Above Brute force approach , as it named brute force approach , its not optimized , it is not space efficient


// Optimized code :

class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length; // this line will handle the case when k > nums.length
       reverse(nums,0,nums.length-1); // Reverse the whole array
       reverse(nums,0,k-1);   // Reverse first k elements
       reverse(nums,k,nums.length-1);  // Reverse remaining n-k elements

    }
    public static void reverse(int[] arr ,int left, int right){
  
        while(left<right){
            int temp=arr[left];
            arr[left++]= arr[right];
            arr[right--]= temp;
        }
    }
}