import java.util.Arrays;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String digits[];
    String s = "";
    
    String strNum = Integer.toString(num);
    
    digits = strNum.split("");
    Arrays.sort(digits);
    
    for (int i = digits.length-1; i >= 0; i--) {
      s += digits[i];
    }
    
    int result = Integer.parseInt(s);
    
    return result;
  }
}
