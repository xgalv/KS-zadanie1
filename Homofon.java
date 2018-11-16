package zadanie.Substitucie;

import java.util.Objects;
import java.util.Random;

public class Homofon 
{
    public static String HomofonnaSubsSamohlasky(String Text, String lang)
    {
        String language = new String(lang);
        
        if(language.equals(new String("Slovak")))
        {
            char []randomChars = new char[12];
            for(int j = 0; j < 12;j++)
            {
                Random r = new Random();
                randomChars[j] = (char)(r.nextInt(26) + 'a');
            }
            
            int len = Text.length();
            char c;
            
            StringBuilder Ptext = new StringBuilder(Text);
            

            for(int i = 0; i < len; i++)
            {
                c = Text.charAt(i);
                if(c == 'a') 
                    Ptext.setCharAt(i, randomChars[1]);
                if(c == 'e')
                    Ptext.setCharAt(i, randomChars[2]);
                if(c == 'i')
                    Ptext.setCharAt(i, randomChars[3]);
                if(c == 'o')
                    Ptext.setCharAt(i, randomChars[4]);
                if(c == 'u')
                    Ptext.setCharAt(i, randomChars[5]);
                
                if(c == 'á') 
                    Ptext.setCharAt(i, randomChars[6]);
                if(c == 'é') 
                    Ptext.setCharAt(i, randomChars[7]);
                if(c == 'í') 
                    Ptext.setCharAt(i, randomChars[8]);
                if(c == 'ó') 
                    Ptext.setCharAt(i, randomChars[9]);
                if(c == 'ú') 
                    Ptext.setCharAt(i, randomChars[10]);
                if(c == 'ä') 
                    Ptext.setCharAt(i, randomChars[11]);
                if(c == 'ô') 
                    Ptext.setCharAt(i, randomChars[12]);
            }
            return Ptext.toString(); 
        }
        else
        {
            char []randomChars = new char[5];
            for(int j = 0; j < 5;j++)
            {
                Random r = new Random();
                randomChars[j] = (char)(r.nextInt(26) + 'a');
            }
            
            int len = Text.length();
            char c;
            
            StringBuilder Ptext = new StringBuilder(Text);
            

            for(int i = 0; i < len; i++)
            {
                c = Text.charAt(i);
                if(c == 'a') 
                    Ptext.setCharAt(i, randomChars[1]);
                if(c == 'e')
                    Ptext.setCharAt(i, randomChars[2]);
                if(c == 'i')
                    Ptext.setCharAt(i, randomChars[3]);
                if(c == 'o')
                    Ptext.setCharAt(i, randomChars[4]);
                if(c == 'u')
                    Ptext.setCharAt(i, randomChars[5]);    
            }
            
            return Ptext.toString(); 
        }
    }
    
    public static String HomofonnaSubs(String Text, double []frek,int kolkoFrekv)
    {
            char []randomChars = new char[kolkoFrekv];
            for(int j = 0; j < kolkoFrekv;j++)
            {
                Random r = new Random();
                randomChars[j] = (char)(r.nextInt(26) + 'a');
            }

            Character abc[] = new Character[26];
            for (int i = 0; i < abc.length; i++) {abc[i] = (char)(i + 'a');}
            
            bubbleSortFA(frek, abc);
            
            char c;
            
            StringBuilder Ptext = new StringBuilder(Text);
             
            for(int i = 0; i < Text.length(); i++)
            {
                for(int j = 0; j < kolkoFrekv; j++)
                {
                    c = Text.charAt(i);
                    if(abc[j] == c)
                        Ptext.setCharAt(i, randomChars[j]);    
                }
            }

            return Ptext.toString();
           
    }
    private static void bubbleSortFA(double []arr, Character []abc ) {  
        int n = arr.length;  
        double temp = 0;  
        char tempabc;
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] < arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];
                                 tempabc = abc[j-1];
                                 
                                 arr[j-1] = arr[j];
                                 abc[j-1] = abc[j];
                                
                                 abc[j] = tempabc;
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
    }
    


}
