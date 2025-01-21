// An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true

// Example 2:
// Input: s = "rat", t = "car"
// Output: false


class Solution {
    public boolean isAnagram(String s, String t) {
        // First we will check if the length of the two strings are equal or not
        // If the length of the two strings are not equal then we will return false
        if (s.length() != t.length()) {
            return false;
        }

        // We will use a hashmap to store the characters of the first string
        HashMap<Character, Integer> counter = new HashMap<>();

        // Iterate through the first string and store the characters in the hashmap
        for (int i = 0; i < s.length(); i++) {
            // which the char c will store the characters of the first string
            char c = s.charAt(i);
            // if the character is already present in the hashmap, we will increment the value of the character

            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        // Iterate through the second string and update the hashmap
        // this will check if the character is present in the hashmap or not
        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            // if the character is present in the hashmap, we will decrement the value of the character
            // if the value of the character is 0 then we will remove the character from the hashmap
            if (counter.containsKey(c)) {
                counter.put(c, counter.get(c) - 1);
                if (counter.get(c) == 0) {
                    counter.remove(c);
                }
            } else {
                return false;
            }
        }

        // If the hashmap is empty, the strings are anagrams
        return counter.isEmpty();
    }
}

// An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true

// Example 2:
// Input: s = "rat", t = "car"
// Output: false


// this solution is similar to the previous solution but we will use an array to store the characters of the first string
// and we will compare the characters of the second string with the characters of the first string
class Solution {
    public boolean isAnagram(String s, String t) {
        // If the lengths of the strings are not equal, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create an array to count the occurrences of each character
        // we use int[26] because we have 26 alphabets from a-z
        int[] count = new int[26];

        // Count the characters in the first string
        // this loop will count the characters of the first string
        for (int i = 0; i < s.length(); i++) {
            // Increment the count of the character s.charAt(i) in the array
            // which this means it counts the occurrence of each character in the first string s
            count[s.charAt(i) - 'a']++;
        }

        // Subtract the counts using the second string
        // this loop will subtract the counts of the characters of the second string from the first string
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        // if the count of the characters is not equal to 0 then we will return false
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}