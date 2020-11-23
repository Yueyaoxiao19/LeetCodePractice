import java.util.Arrays;

class plusOne {
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] res = new int[digits.length + 1];
        res[0]=1;
        return res;
    }
    public static void main (String[] args){
        int[] digits = new int[] {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
        int[] digits1 = new int[] {1,2,9};
        System.out.println(Arrays.toString(plusOne(digits1)));
        int[] digits2 = new int[] {9,9,9};
        System.out.println(Arrays.toString(plusOne(digits2)));
    }
}