class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class PalindromeCheckerApp {

    // Pointer that moves from start
    static ListNode left;

    public static boolean isPalindrome(ListNode head) {
        left = head;
        return checkPalindrome(head);
    }

    private static boolean checkPalindrome(ListNode right) {

        // Base case
        if (right == null)
            return true;

        // Recursively go to end
        boolean result = checkPalindrome(right.next);

        // If already false, stop checking
        if (!result)
            return false;

        // Compare left and right
        if (left.val != right.val)
            return false;

        // Move left forward
        left = left.next;

        return true;
    }

    public static void main(String[] args) {

        // Creating linked list: 1 → 2 → 3 → 2 → 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        boolean result = isPalindrome(head);
        System.out.println("Is Palindrome? " + result);
    }
}