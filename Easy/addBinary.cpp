#include <iostream>
#include <string>

using namespace std;

// this problem is to add two binary strings.
// we will solve this problem by converting the binary strings to integers.
// then we will add the integers and convert the sum back to a binary string.
// this solution has to manual input the binary strings.
class Solution {
public:
    string addBinary(string a, string b) {
        int n = max(a.size(), b.size());
        string result(n, '0');
        int carry = 0;

        for (int i = 0; i < n; ++i) {
            int bitA = i < a.size() ? a[a.size() - 1 - i] - '0' : 0;
            int bitB = i < b.size() ? b[b.size() - 1 - i] - '0' : 0;

            int sum = bitA + bitB + carry;
            result[n - 1 - i] = (sum % 2) + '0';
            carry = sum / 2;
        }

        if (carry) {
            result.insert(result.begin(), '1');
        }

        return result;
    }
};

int main() {
    Solution solution;
    string a = "1010";
    string b = "1011";
    cout << "Sum: " << solution.addBinary(a, b) << endl;
    return 0;
}

// the other solution without converting the binary strings to integers.
// this solution has no manual input.

class Solution {
public:
    string addBinary(string a, string b) {

        // this solution is to add two binary strings.
        // we will solve this problem without converting the binary strings to integers.
        // we will add the binary strings from right to left.


        string result;
        int i = a.size() - 1;
        int j = b.size() - 1;
        int carry = 0;

        // add the binary strings from right to left.
        // this loop will run until we reach the end of both strings.
        // or until we have no carry.

        // while i >= 0 or j >= 0 or carry is true.
        // we will add the bits from a and b.
        while (i >= 0 || j >= 0 || carry) {
            int sum = carry;

            // if i >= 0, add the bit from a.
            // decrement i. which means move to the next bit in a.
            if (i >= 0) {
                sum += a[i--] - '0';
            }
            // if j >= 0, add the bit from b.
            // decrement j. which means move to the next bit in b.
            // this decrement is done after the addition which means we are moving from right to left.
            if (j >= 0) {
                sum += b[j--] - '0';
            }
            // add the sum % 2 to the result.
            // we will use the sum % 2 to get the bit we need to add to the result.
            // we will use the sum / 2 to get the carry.
            result = to_string(sum % 2) + result;
            carry = sum / 2;
        }

        return result;
    }
};