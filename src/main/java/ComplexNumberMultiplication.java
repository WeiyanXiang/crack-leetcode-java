/**
 * 
 */

/**
 * @author weiyan.xiang
 *
 */
public class ComplexNumberMultiplication {
    /**
     * https://leetcode.com/problems/complex-number-multiplication/#/description
     * 
     * @param a
     * @param b
     * @return
     */
    public String complexNumberMultiply(String a, String b) {
        String[] splitedA = a.split("\\+");
        String[] splitedB = b.split("\\+");
        int x = Integer.parseInt(splitedA[0]);
        int y = Integer.parseInt(splitedA[1].split("i")[0]);
        int p = Integer.parseInt(splitedB[0]);
        int q = Integer.parseInt(splitedB[1].split("i")[0]);
        return String.valueOf(x * p - y * q) + "+" + String.valueOf(x * q + p * y) + "i";
    }

    public static void main(String[] args) {
        System.out.println(new ComplexNumberMultiplication().complexNumberMultiply("1+-1i", "1+-1i"));

    }
}
