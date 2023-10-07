import java.lang.StringBuilder;
class ToCamelCase {

  static String toCamelCase(String s){
    String result = "";
    
    String chars[] = s.split("");
    
    for (int i = 0; i < chars.length; i++) {
      if (chars[i].equals("-") == true || chars[i].equals("_") == true) {
        chars[i+1] = chars[i+1].toUpperCase();
        chars[i] = "";
      }
    }
    
    StringBuilder sb = new StringBuilder();
    
    for (String element : chars) {
      sb.append(element);
    }
    
    result = sb.toString();
    
    return result;
  }
}