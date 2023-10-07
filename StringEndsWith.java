public class StringEndsWith {
    public static boolean solution(String str, String ending) {
      String result = "";
      
      int j = ending.length();
      if (str.length() == 0 || ending.length() > str.length()) {
        return false;
      } else {
        for (int i = j; i != 0; i--) {
          result += str.charAt(str.length()-i);
        }
        return result.equals(ending);
      }
    }
  }
