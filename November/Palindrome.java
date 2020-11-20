package Nov16;

//LeetCode question 9

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

//this was the first solution I had in mind.
//Although I'm not sure if its cheating for me to convert the int to string. 
//Here is another solution I saw online by someone, really smart solution in my opion, 
//however, I think my code is easier to understand and thereby saving the readers sometime. 

public boolean isPalindrome(int x) {
    if (x<0 || (x!=0 && x%10==0)) return false;
    int rev = 0;
    while (x>rev){
    	rev = rev*10 + x%10;
    	x = x/10;
    }
    return (x==rev || x==rev/10);
}





