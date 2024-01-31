import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParse {

    public static int countWords(String message)
    {
        int len = message.length();


        StringTokenizer st = new StringTokenizer(message);

        int c = 0;

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            int wordLen = word.length();
            if (isVowel(word.charAt(0))
                    && isVowel(word.charAt(wordLen - 1))) {
                c++;
            }

        }

        return c;
    }

    public static boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        boolean ret = false;
        if (ch == 'A'
                || ch == 'E'
                || ch == 'I'
                || ch == 'O'
                || ch == 'U')
            ret = true;

        return ret;
    }


}
