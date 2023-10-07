import java.util.ArrayList;

public class RgbToHexConversion {

    public static String rgb(int r, int g, int b) {
        ArrayList <String> colors = new ArrayList<>();
      
      colors.add(Integer.toString(r));
      colors.add(Integer.toString(g));
      colors.add(Integer.toString(b));
      
      for (int i = 0; i < colors.size(); i++) {
        if (colors.get(i).length() == 1) {
          colors.set(i, "0" + colors.get(i));
        } else if (Integer.parseInt(colors.get(i)) > 255) {
          colors.set(i, "FF");
        } else if (Integer.parseInt(colors.get(i)) < 0) {
          colors.set(i, "00");
        } else {
          colors.set(i, Integer.toHexString(Integer.parseInt(colors.get(i))).toUpperCase());
        }
      }
      
      String result = "";
      
      for (String element : colors) {
        result += element;
      }
      
      return result;
    }
}