class Solution {
    public int removeElement(int[] nums, int val){
        // first we need to check if the array is empty
        // if the array is empty, we will return 0
         if (nums.length == 0) {
             return 0;
         }

         // next we will check if the array has duplicates and remove the occurrences of the value
        // which the integer nums and integer val will be compared
        // so if the occurrence of the value is found, it will be removed

        // first assign the value of k to 0 which is the starting point of the array
          int k = 0;

          // Next, we will check for the occurrence of the value in the array.
          // To check for the occurrence of the value in the array, we will use a loop.
          // The loop will iterate through the array and check each element.
           for (int i = 0; i < nums.length; i++) {

                // If the current element is not equal to the value to be removed,
                // we will update the element at the position indicated by k
                // and increment k.
                if (nums[i] != val) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            // Return the length of the array without the specified value.
            return k;
    }
}