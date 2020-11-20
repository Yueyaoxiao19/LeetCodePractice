package Nov16;

//Determine whether an integer is a palindrome.
//An integer is a palindrome when it reads the same backward as forward.

//Input: x = 121
//Output: true

//Input: x = -121
//Output: false

public class Palindrome {
    public static boolean isPalindrome(int x) {
        String input = (Integer.toString(x));
        System.out.println(input);
        int i = 0;
        int j = input.length()-1;
        while (i <= ((input.length() / 2)) && j >= (input.length() / 2)) {
            System.out.println(input.charAt(i));
            System.out.println(input.charAt(j));
            if (input.charAt(i) == input.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }
}

