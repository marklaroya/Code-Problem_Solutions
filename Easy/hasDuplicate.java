
// this problem is to check if the given array has duplicate elements or not. If it has duplicate elements then return true else return false.
// example: [1,2,3,4,5,6,7,8,9,10] => false
// example: [1,2,3,4,5,6,7,8,9,10,1] => true

class Solution{
    public boolean hasDuplicate(int[] nums){

    // now we will use a hashset, a hashset is a data structure that stores unique elements only.
    // the hashset will store the elements of the array 
    // and if the element is already present in the hashset then we will return true.

    // first we need to create a hashset
    HashSet<Integer> set = new HashSet<>();

    // second we will iterate through the array and check if the element is already present in the hashset or not
    for(int i=0; i < nums.length; i++){

        // If the element is already present in the HashSet, return true
        // This means we have found a duplicate element in the array
        if(set.contains(nums[i])){
            return true;
        }
        set.add(nums[i]);
        // this will add the element to the hashset
        // if the element is already present in the hashset then it will return false
        }
        return false;

    }
}

// Time complexity: O(n) where n is the length of the input array
// Space complexity: O(n) where n is the length of the input array


// Another way to solve the problem is by using the following code
// we will use  a nested loop to check for duplicates

public class hasDuplicate {
    public static void main(String[] args) {
        // Initialize an array with duplicate elements
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 12, 100, 9};

        // Initialize a boolean variable to store the result
        boolean hasDuplicate = false;

        // Loop through the array to check for duplicates
        for (int i = 0; i < nums.length; i++) {

            // for j are the elements after i in the array and we will compare the elements
            // if the elements are equal then we will return true
            for (int j = i + 1; j < nums.length; j++) {
                // If a duplicate element is found, set the hasDuplicate variable to true
                if (nums[i] == nums[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
            // If a duplicate element is found, break out of the loop
            if (hasDuplicate) {
                break;
            }
        }

        // Print the result
        System.out.println(hasDuplicate);
    }
}