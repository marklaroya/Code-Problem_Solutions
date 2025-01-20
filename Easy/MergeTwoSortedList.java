class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        // this technique is called the dummy node technique 
        // Create a dummy node to act as the starting point of the merged list
        // this dummy node will be used to build the merged list
        
        ListNode dummy = new ListNode(0);

        // Create a pointer to keep track of the current node in the merged list
        ListNode current = dummy;

        // Loop through the two lists until one of them reaches the end

        while (list1 != null && list2 != null) {
            // Compare the values of the two lists
            // Add the smaller value to the merged list
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            // Move the pointer to the next node in the merged list
            current = current.next;
        }

        // Add the remaining nodes from the non-empty list to the merged list
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the merged list starting from the next node of the dummy node
        
        return dummy.next;
    }

}

// The other solution is to use recursion
// This solution uses recursion to merge the two lists
// The recursion is used to merge the rest of the first list with the second list or the rest of the second list with the first list
// The time complexity of this solution is O(n + m) where n is the length of the first list and m is the length of the second list
// The space complexity of this solution is O(n + m) where n is the length of the first list and m is the length of the second list
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // If one of the lists is empty, return the other list
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        // If the value of the first list is smaller than the value of the second list
        // Set the next node of the first list to the result of merging the rest of the first list with the second list
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            // If the value of the second list is smaller or equal to the value of the first list
            // Set the next node of the second list to the result of merging the rest of the second list with the first list
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}

// this solution is the same as the first solution but with a different implementation
// the time complexity of this solution is O(n + m) where n is the length of the first list and m is the length of the second list
// the space complexity of this solution is O(1)
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Create a dummy node to act as the starting point of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        // Iterate through both lists until one of them is exhausted
        while (list1 != null && list2 != null) {
            // Compare the values of the current nodes of both lists
            if (list1.val < list2.val) {
                // If list1's value is smaller, add it to the merged list
                head.next = list1;
                list1 = list1.next;
            } else {
                // If list2's value is smaller or equal, add it to the merged list
                head.next = list2;
                list2 = list2.next;
            }
            // Move the head pointer to the next node in the merged list
            head = head.next;
        }

        // If there are remaining nodes in list1, add them to the merged list
        if (list1 != null) {
            head.next = list1;
        } else {
            // If there are remaining nodes in list2, add them to the merged list
            head.next = list2;
        }

        // Return the merged list, starting from the node after the dummy node
        return dummy.next;
    }
}