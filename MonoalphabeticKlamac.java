package zadanie.Substitucie;

import java.util.Random;

public class MonoalphabeticKlamac {
    public static String Klamac(String Text,int number)
    {
        StringBuilder TextWithKlamac = new StringBuilder(Text);
        int len = Text.length();
       
        Random r = new Random();
        char c;    

        for(int i = number; i<len; i += number)
        {
            c = (char)(r.nextInt(26) + 'a');
            TextWithKlamac.insert(i, c);
        }
        return TextWithKlamac.toString();
    }
}
