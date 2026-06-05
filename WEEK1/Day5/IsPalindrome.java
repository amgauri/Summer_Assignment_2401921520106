package WEEK1.Day5;

public class IsPalindrome {

    public static boolean isPalindrome(String s) {

        // Convert to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        // Two pointer approach
        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        boolean ans = isPalindrome(s);

        System.out.println(ans);
    }
}
    

