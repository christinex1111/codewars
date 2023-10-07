import java.util.ArrayList;
import java.util.Collections;

public class SquareEveryDigit {

  public int squareDigits(int n) {
    ArrayList <Integer> digits = new ArrayList<>();
    String result = "";
    
    if (n == 0) {
      digits.add(0);
    } else {
      while (n > 0) {
        digits.add(n % 10);
        n /= 10;
      }
      Collections.reverse(digits);
    }
    
    for (int i = 0; i < digits.size(); i++) {
      digits.set(i, digits.get(i) * digits.get(i));
    }
    
    for (int element : digits) {
      result += element;
    }
    
    int intResult = Integer.parseInt(result);
    return intResult;
  }

}