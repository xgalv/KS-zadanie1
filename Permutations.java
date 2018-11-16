/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author vikto
 */
public class Permutations {
    private static Random rnd = new Random(System.currentTimeMillis());
    
  public static void rndPerm(Object input[]) {
        int size = input.length;
        for (int i = 0; i < (size - 1); i++) {
            int j = rnd.nextInt(size - i) + i;
            // swap
            Object tmp = input[i];
            input[i] = input[j];
            input[j] = tmp;
        }
    }

    public static List allPerm(Object input[]) {
        List<Object[]> retVal = new ArrayList(Math.factorial(input.length));
        allPerm(0, input, retVal);
        return retVal;
    }

    private static void allPerm(int fixed, Object input[], List output) {
        Object in[] = input.clone();
        if (fixed == input.length) {
            output.add(input);
        } else {
            for (int i = fixed; i < input.length; i++) {
                // swap
                Object tmp = in[i];
                in[i] = in[fixed];
                in[fixed] = tmp;
                // recursion
                allPerm(fixed + 1, in, output);
            }
        }
    }

    /* Vstup: M = {a, .... z}, reprezentovane s char*/
    public static Character[] inverse(Character[] perm) {
        Character[] inv = new Character[perm.length];
        for (int i = 0; i < perm.length; i++) {
            inv[perm[i] - 'a'] = (char) (i + 'a');
        }
        return inv;
    }

     /* Vstup: M = {1, .... m}*/
     public static Integer[] inverse(Integer[] perm) {
        Integer[] inv = new Integer[perm.length];
        for (int i = 0; i < perm.length; i++) {
            inv[perm[i]-1] = i+1;
        }
        return inv;
    }
     
     public static Integer[] inverse(Object[] perm){
         List sorted = Arrays.asList(perm.clone()); // kopia do zoznamu
         Collections.sort(sorted); // zoradime
         
         Integer[] tmp = new Integer[perm.length];
         for(int i=0; i < perm.length; i++){
             tmp[i] = sorted.indexOf(perm[i])+1;
	     // poradie prvku zo vstupu pri zakladnom usporiadani vstupnej mn.
         }
         return inverse(tmp);
     }
     
     public static int poradove(Object[] perm)
     {
         int pos = 0;
         int index = 0;
         int faktor = 0;
         
         List sorted = new ArrayList<>( Arrays.asList(perm.clone())); 
         Collections.sort(sorted);
         
         for(int i = 0; i < perm.length; i++)
         {
           index = sorted.indexOf(perm[i]);
           faktor = Math.factorial(sorted.size() - 1);
           
           pos += ( index * faktor );
           
           sorted.remove(new Integer((int) perm[i]));
           
         }
         return pos;
     }
     public static Object[] permPoradie(Object[] perm, int poradie)
      {
        int pocet = 0;
        Object[] p = perm;  
        List retVal = Permutations.allPerm(perm);
        do{
            
            pocet++;
        }while(pocet == poradie);
        
        return null;
          
      }
}
