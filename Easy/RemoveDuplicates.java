class Solution {
    public int RemoveDuplicates(int[] nums) {
        // if the array is empty, we will return 0
        // first we need to check if the array has duplicates
        // if the array has no duplicates, we will return the length of the array
        // if the array has duplicates, we will remove the duplicates and return the
        // length of the array
        // we will use two pointers to check for duplicates

        // now we have a solution if the array is empty
        if (nums.length == 0) {
            return 0;
        }

        // next we will check if the array has duplicates
        // we will use two pointers to check for duplicates

        // This int k = 0 will start at 0 which the starting point of the array is 0
        int k = 0;

        // this loop will check for duplicates which the i < nums.length will check if
        // the array has duplicates
        for (int i = 1; i < nums.length; i++) {
            // if the array has duplicates, we will remove the duplicates
            // the nums i which the i is the index of the array will be compared with the
            // nums k which the k is the index of the array
            // if the nums i is not equal to the nums k, we will increment the k and assign
            // the nums i to the nums k
            if (nums[i] != nums[k]) {
                k++;

                // this code will remove the duplicates
                // which the nums k will be assigned to the nums i and if the next number is not
                // equal to the previous number, the k will be incremented
                nums[k] = nums[i];
            }
        }
        return k + 1;

    }

}