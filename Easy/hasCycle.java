
// the problem is to detect if there is a cycle in the linked list
// the cycle are the nodes that are connected to each other which will form a cycle
// for example 
// 1->2->3->4->5->NULL
// if we connect the last node to the first node then it will form a cycle


// we will use  a method called Floyd's Tortoise and Hare (Cycle Detection)
// which is a pointer algorithm that uses two pointers, which move at different speeds
// the slow pointer moves one step at a time while the fast pointer moves two steps at a time
// if there is a cycle in the linked list the two pointers will meet at some point
// if there is no cycle the fast pointer will reach the end of the linked list

class Solution {
    public boolean hasCycle(ListNode head) {

        // first we will check if the linked list is empty or has only one node
        if (head == null || head.next == null) {
            return false;
        }

        // we will use two pointers to detect the cycle
        // the slow pointer will move one step at a time
        // the fast pointer will move two steps at a time
        ListNode slow = head;
        ListNode fast = head.next;

        // while the slow pointer is not equal to the fast pointer
        // if the fast pointer is null or the next node of the fast pointer is null
        // then we will return false since there is no cycle
        // this means the fast pointer has reached the end of the linked list
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }


            slow = slow.next;
            fast = fast.next.next;
        }

        // if the slow pointer is equal to the fast pointer then there is a cycle
        return true;
    }
}