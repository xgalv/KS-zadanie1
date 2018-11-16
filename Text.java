package zadanie.helpers;

import java.text.Normalizer;

public class Text {
    
    public static String convertToTSA(String in, boolean keepSpace)
    {
        in=in.toLowerCase();
        in=Normalizer.normalize(in,Normalizer.Form.NFD);
        in=in.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        if(!keepSpace)
        {
            in=in.replaceAll("[^a-z]","");
        }
        else
        {
            in=in.replaceAll("[^a-z]", " ");
        }
        return in;
    }
}
