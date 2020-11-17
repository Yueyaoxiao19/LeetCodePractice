package Nov16;
//Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

//If the fractional part is repeating, enclose the repeating part in parentheses.

//If multiple answers are possible, return any of them.

//It is guaranteed that the length of the answer string is less than 104 for all the given inputs.

//LeetCode#166-Fraction to Recurring Decimal
import java.util.HashMap;
import java.util.Map;

//Input: numerator = 1, denominator = 2
//Output: "0.5"
//Input: numerator = 2, denominator = 1
//Output: "2"
public class Medium {
    public static String fractiontoDecimal(int numerator, int denominator){
        if(denominator == 0){
            return "invalid";
        }
        if (numerator == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        if(numerator < 0 && denominator > 0 || numerator > 0 && denominator < 0){
            result.append("-");
        }
        long numerator2 = Math.abs((long)numerator);
        long denominator2 = Math.abs((long)denominator);
        long num = numerator2/denominator2;
        long remainder = numerator2%denominator2;
        result.append(num);

        if (remainder == 0){
            return result.toString();
        }
        result.append(".");
        Map<Long,Integer> map = new HashMap<>();

        while(remainder != 0){
            if(map.containsKey(remainder)){
                result.insert(map.get(remainder), "(");
                result.append(")");
                break;
            }
            map.put(remainder,result.length());
            remainder *=10;
            result.append(remainder/denominator2);
            remainder %= denominator2;
        }
        return result.toString();
    }

    public static void main(String[] args){
        System.out.println(fractiontoDecimal(1,2));
        System.out.println(fractiontoDecimal(2,1));
        System.out.println(fractiontoDecimal(2,3));
        System.out.println(fractiontoDecimal(4,333));
        System.out.println(fractiontoDecimal(-98,5));
        System.out.println(fractiontoDecimal(86,7));
        System.out.println(fractiontoDecimal(-88,3));

    }
}
