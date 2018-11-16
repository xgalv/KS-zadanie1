package zadanie;
/**
 *
 * @author viktorgal
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import zadanie.Substitucie.MonoalphabeticKey;
import zadanie.Substitucie.Monoalphabetic;
import zadanie.Substitucie.MonoalphabeticKlamac;
import zadanie.Substitucie.Homofon;
import zadanie.Crypto.Cipher;
import zadanie.Substitucie.Caesar;
import zadanie.Substitucie.CaesarKey;
import zadanie.Crypto.Key;
import static zadanie.Substitucie.Vigenere.encodeString;
import zadanie.helpers.Permutations;

public class Main {

    public static void main(String[] args) {
       
        String ZT;
        String OT;
        
        Character abc[] = new Character[26];
        for (int i = 0; i < abc.length; i++) {
            abc[i] = (char) (i + 'a');
        }
  
        // MONOALPHABET
        Monoalphabetic mc = new Monoalphabetic();
        OT = "sifrovaniepomocoumonoalfabetickejsubstitucie";
        System.out.println("OT: " + OT);   
        
        Permutations.rndPerm(abc);
        MonoalphabeticKey mkey = new MonoalphabeticKey(abc);
         
        ZT = mc.encrypt(OT, mkey);
        System.out.println("ZT: " + ZT);
        OT = mc.decrypt(ZT, mkey);
        System.out.println("OT: " + OT);
        
        // VIGENERE
        String kluc = "kluc";
        System.out.println("ZT: " + ZT); 
        ZT = encodeString(OT, kluc);
        System.out.println("OT: " + OT); 
        
        /*
        //MONOALPHABET + KLAMAC
        ZT = MonoalphabeticKlamac.Klamac(OT, 5);
        System.out.println("ZT: " + ZT);
        OT = mc.decrypt(ZT, mkey);
        System.out.println("OT: " + OT);
        */
        
        //HOMOFON
        Homofon hc = new Homofon();
        ZT = Homofon.HomofonnaSubsSamohlasky(OT, "Slovak");
        System.out.println("ZT: " + ZT);
        System.out.println("OT: " + OT);
        
        double []frek = new double[26];
        ZT = Homofon.HomofonnaSubs(OT, frek, 3);
        System.out.println("ZT: " + ZT);
    }
    
}
