
// this problem is about reversing a linked list
// example: 1->2->3->4->5->NULL should be reversed to 5->4->3->2->1->NULL   
// we will use a while loop to reverse the linked list

class Solution{
public ListNode reverseList(ListNode head) {    

    // we will use two pointers to reverse the linked list
    // the prev pointer will be null which will be the last node of the linked list to be reversed
    ListNode prev = null;

    // this loop will reverse the linked list
    // while the head is not null we will reverse the linked list by changing the next node of the head to the prev node
    while(head != null){
        // we will store the next node of the head in the next variable
        ListNode next = head.next;

        // we will change the next node of the head to the prev node
        head.next = prev;

        // which this means the prev node will be the head node
        prev = head;
        head = next;

    }
    return prev;
    }
}

// Time complexity: O(n) where n is the number of nodes in the linked list
// Space complexity: O(1) since we are using constant space
// the output is based on the given test cases
