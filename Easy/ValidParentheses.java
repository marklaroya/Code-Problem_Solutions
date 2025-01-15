import java.util.Stack;

// Problem: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // this loop will iterate through the string and check for the brackets
        // if the bracket is an opening bracket, it will be pushed to the stack
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Check for matching closing brackets in the stack
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("()")); // true
        System.out.println(vp.isValid("()[]{}")); // true
        System.out.println(vp.isValid("(]")); // false
        System.out.println(vp.isValid("([)]")); // false
        System.out.println(vp.isValid("{[]}")); // true
    }
}