import java.util.Arrays;

public class JadenCasingStrings {

	public String toJadenCase(String phrase) {
		String result = "";
    
    if (phrase == null) {
      return null;
    } else if (phrase.length() == 0) {
      return null;
    } else {
      String split[] = phrase.split(" ");
      for (int i = 0; i < split.length; i++) {
        String wordSplit[] = split[i].split("");
        wordSplit[0] = wordSplit[0].toUpperCase();
        for (String element : wordSplit) {
          result += element;
        }
        result += " ";
        Arrays.fill(wordSplit, null);
      }
    }
    result = result.trim();
    return result;
	}

}
