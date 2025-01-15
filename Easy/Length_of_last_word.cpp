#include <iostream>
#include <string>


// Given a string s consists of some words separated by spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.
// Example 1:
// Input: s = "Hello World"
// Output: 5

class Solution {
public:
    int lengthOfLastWord(const std::string& s) {
        int length = 0;
        int i = s.size() - 1;

        // this loop will skip the spaces at the end of the string
        // so this will get the last word of the string
        while (i >= 0 && s[i] == ' ') {
            i--;
        }

        // where the last word starts, count the length of the last word
        while (i >= 0 && s[i] != ' ') {
            length++;
            i--;
        }

        return length;
    }
};

// this main function is used to test the solution 
// and to see the output of the solution class
int main() {
    Solution solution;
    std::string s = "Mark Lester     Laroya        ";
    std::cout << "Length of last word: " << solution.lengthOfLastWord(s) << std::endl;
    return 0;
}