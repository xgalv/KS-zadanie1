package zadanie.helpers;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TextStatistics {
    public static double IndexOfCoincidence(Double stat[], double n)
    {
        double ic=0;
       // n=n-1;
        double pocetMoznychDvojic=n*(n-1);
        for (int i=0; i<stat.length;i++)
        {
            ic= ic+(stat[i]*(stat[i]-1));
        }
        ic=ic/pocetMoznychDvojic;
         return ic;
    }
    public static HashMap readNgram(String txt, int n, boolean relativeFr)
    {
        HashMap<String,Double> frek=new HashMap<String,Double>();
        for (int i=0; i<txt.length();i++)
        {
            String subTxt=(String) txt.subSequence(i, i+n);
            if(frek.get(subTxt)==null)
            {
                frek.put(subTxt,1.0);
            }
            else{
                frek.put(subTxt,frek.get(subTxt)+1.0);
            }
        }
         return frek;
    }
    
    
}
