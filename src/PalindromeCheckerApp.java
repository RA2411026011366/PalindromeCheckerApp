import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

    public class PalindromeCheckerApp {

        public static void main(String[] args) {

            String word = "radar";  // Hardcoded string

            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();

            // Enqueue and push characters
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                queue.add(c);   // Enqueue
                stack.push(c);  // Push
            }

            boolean isPalindrome = true;

            // Compare dequeue vs pop
            while (!queue.isEmpty()) {
                char fromQueue = queue.remove();  // Dequeue
                char fromStack = stack.pop();     // Pop

                if (fromQueue != fromStack) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println(word + " is a Palindrome");
            } else {
                System.out.println(word + " is NOT a Palindrome");
            }
        }
    }