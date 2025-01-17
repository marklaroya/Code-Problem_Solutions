#include <iostream>
#include <vector>

using namespace std;  // this namespace std will be used in the code as a shorthand for std::cout and std::endl

int main() {
    // Define a vector of integers
    // the vector will contain the numbers 1, 2, 3, 4, and 5
    // we use the vector<int> because we are creating a vector of integers and the int are numbers.
    vector<int> nums = {1, 2, 3, 4, 5};
    
    // for example, we can create a vector of characters
    vector<char> chars = {'a', 'b', 'c', 'd', 'e'};

    // Iterate through the vector using a for loop
    for (int i = 0; i < nums.size(); i++) {
        // Print the current element
        cout << "Element at index " << i << " is " << nums[i] << std::endl;
    } 

    // Iterate through the vector of characters using a for loop
    // this will print the elements of the vector of characters.
    for (int i = 0; i < chars.size(); i++) {
        // Print the current element
        cout << "Element at index " << i << " is " << chars[i] << std::endl;
    }

    return 0;
}