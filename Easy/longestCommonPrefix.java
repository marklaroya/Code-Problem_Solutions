
// Problem: Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".
// All given inputs are in lowercase letters a-z.
// the output is based on the given test cases 
class Solution {
    public String longestCommonPrefix(String[] strs) {

        // If the array is empty, return empty string
        if (strs.length == 0) {
            return "";
        }

        // Set the first string as prefix
        // This will be the prefix to be checked with the rest of the strings
        String prefix = strs[0];

        // this loop will check the prefix of the first string with the rest of the
        // strings
        // if the prefix is not found in the rest of the strings, it will remove the
        // last character from the prefix
        // and repeat the process until the prefix is found in all strings
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;

    }
}


// Another solution with the same logic but different implementation 
// which this solution we can run with no test cases and we will input the test cases in the main function
class TwoSolution {
    public String longestCommonPrefix(String[] strs) {
        // If the input array is empty, return an empty string
        if (strs.length == 0) {
            return "";
        }

        // Initialize the prefix as the first string in the array
        String prefix = strs[0];

        // Iterate through the remaining strings in the array
        for (int i = 1; i < strs.length; i++) {
            // While the current string does not start with the prefix
            while (!strs[i].startsWith(prefix)) {
                // Shorten the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);

                // If the prefix becomes empty, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        // Return the longest common prefix
        return prefix;
    }

    public static void main(String[] args) {
        TwoSolution solution = new TwoSolution();

        // Hardcoded test cases
        String[] test1 = { "flower", "flow", "flight" };
        String[] test2 = { "dog", "racecar", "car" };
        String[] test3 = { "interview", "internet", "internal" };

        // Print results for each test case
        System.out.println("Longest Common Prefix (test1): " + solution.longestCommonPrefix(test1));
        System.out.println("Longest Common Prefix (test2): " + solution.longestCommonPrefix(test2));
        System.out.println("Longest Common Prefix (test3): " + solution.longestCommonPrefix(test3));
    }
}