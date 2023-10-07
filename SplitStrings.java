import java.util.ArrayList;

public class SplitStrings {
    public static String[] solution(String s) {
      ArrayList <String> result = new ArrayList<>();
      StringBuilder sb = new StringBuilder();
      
      if (s.length() == 0) {
        result.clear();
      } else {
        int i = 0;
        for (int j = 1; j < s.length(); j += 2) {
          sb.append(s.charAt(i));
          sb.append(s.charAt(j));
          String pair = sb.toString();
          result.add(pair);
          sb.setLength(0);
          i += 2;
        }
      
        char lastElement = s.charAt(s.length() - 1);
      
        if (s.length() % 2 != 0) {
          sb.append(lastElement);
          sb.append('_');
          String replace = sb.toString();
          result.add(replace);
        }
      }
      
      String[] outcome = new String[result.size()];
      for (int n = 0; n < result.size(); n++) {
        outcome[n] = result.get(n);
      }
      
      return outcome;
  }
}
