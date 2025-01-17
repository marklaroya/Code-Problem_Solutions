#include <vector>
#include <unordered_map>
using namespace std;


// the problem is to find two numbers in the array that add up to a specific target number.
// which we will solve using the brute force approach.
// The brute force approach is simple. Loop through each element x and find if there is another value that equals to target - x.
// As we can see, the brute force approach is simple but not very efficient.
// We can see that the time complexity is O(n^2) because we have two nested loops.
// The space complexity is O(1) because we are not using any extra space.

// we will use a one-pass hash table to improve the time complexity of the brute force approach.
// The idea is to store each element's value and its index in the table.
// Then, we check if the target - nums[i] exists in the table.
// If it does, we have found a solution and return immediately.
// The time complexity is O(n) because we are looping through the array only once.

// example: nums = [2, 7, 11, 15], target = 9 
// we will store the value and index of each element in the table.
// table = {2: 0, 7: 1, 11: 2, 15: 3}
// we will loop through the array and check if the target - nums[i] exists in the table.
// nums[0] = 2, target - nums[0] = 9 - 2 = 7, 7 exists in the table, so we return the indices of 2 and 7.

// this solution is the brute force approach.
class Solution {
public:
    // first we will create a function that takes a vector of integers and an integer as input.
    // the function will return a vector of integers.
    vector<int> twoSum(vector<int> &nums, int target) {

        // this loop will iterate through the array.
        // the int i will be the index of the first number.
        // then the nums.size() will be the length of the array.
        // the i will be incremented by 1.
        for (int i = 0; i < nums.size(); i++) {

            // the int j will be the index of the second number.
            // the j will be incremented by 1 which will be the next number after the first number.
            for (int j = i + 1; j < nums.size(); j++) {

                // if the second number is equal to the target number minus the first number.
                // then we will return the indices of the first and second numbers.
                // then we have found a solution.
                if (nums[j] == target - nums[i]) {
                    return {i, j};
                }
            }
        }
        // Return an empty vector if no solution is found
        return {};
    }
};


// the other approach is to use a one-pass hash table.
class Solution {
public:
    vector<int> twoSum(vector<int> &nums, int target) {
        // create a hash table to store the value and index of each element.
        unordered_map<int, int> table;

        // this int i will be the index of the first number.
        // and this will iterate through the array.
        for (int i = 0; i < nums.size(); i++) {

            // check if the target - nums[i] exists in the table.
            // if it does, return the indices of the two numbers.
            if (table.find(target - nums[i]) != table.end()) {
                return {table[target - nums[i]], i};
            }

            // store the value and index of each element in the table.
            table[nums[i]] = i;
        }
        // Return an empty vector if no solution is found
        return {};
    }
};