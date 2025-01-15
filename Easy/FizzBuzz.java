import java.util.ArrayList;
import java.util.List;


// Description of the problem
// Given an integer n, return a string array answer (1-indexed) where:
// answer[i] = "Fizz" if i is divisible by 3
// answer[i] = "Buzz" if i is divisible by 5
// answer[i] = "FizzBuzz" if i is divisible by 3 and 5
// answer[i] = i if none of the above conditions are true

class Solution {
    public List<String> fizzBuzz(int n) {
        // Create a list to store the answer
        List<String> ans = new ArrayList<>();

        // Loop through the numbers from 1 to n
        for (int i = 1; i <=n; i++) {

            // Check if the number is divisible by 3 and 5
            if ( i % 3 == 0 && i % 5 == 0){
                ans.add("FizzBuzz");
                
                // Check if the number is divisible by 3
            } else if ( i % 3 == 0){
                ans.add("Fizz");

                // Check if the number is divisible by 5
            } else if (i % 5 == 0){
                ans.add("Buzz");
            }  else {

                // If the number is not divisible by 3 or 5, add the number to the list
                ans.add(Integer.toString(i));
            }
           
        }
        // Return the list
        return ans;
    }
}

// Time complexity: O(n) where n is the input number 
// Space complexity: O(n) where n is the input number 


// Another way to solve the problem is by using the following code
// if you want to specify the range of numbers, you can use the following code

public class FizzBuzz {
    public static void main(String[] args) {
        // Loop through the numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            String result = "";

            // Check if the number is divisible by 3
            if (i % 3 == 0) {
                result += "Fizz";
            }

            // Check if the number is divisible by 5
            if (i % 5 == 0) {
                result += "Buzz";
            }

            // If the number is not divisible by 3 or 5, add the number to the list
            if (result.isEmpty()) {
                result = Integer.toString(i);
            }
            
            // Print the result to the console
            System.out.println(result);
        }
    }
}
