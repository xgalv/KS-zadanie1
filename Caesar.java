/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie.Substitucie;

/**
 *
 * @author vikto
 */
import zadanie.Crypto.Cipher;
import zadanie.Crypto.Key;

public class Caesar implements Cipher {

   @Override
   public String encrypt(String pt, Key k) {
       if (!(k instanceof CaesarKey)) {
           throw new IllegalArgumentException("Vstupom musí byť inštancia CaesarKey");
       }
       StringBuilder ct = new StringBuilder();
       CaesarKey ck = (CaesarKey) k;
       for (char c : pt.toCharArray()) {
           int inNum = (c - 'a');
           inNum += ck.offset;
           inNum %= ck.modulo;
           char inChar = (char) (inNum + 'a');
           ct.append(inChar);
       }
       return ct.toString();
   }

   @Override
   public String decrypt(String ct, Key k) {
       if (!(k instanceof CaesarKey)) {
           throw new IllegalArgumentException("Vstupom musí byť inštancia CaesarKey");
       }
       StringBuilder pt = new StringBuilder();
       CaesarKey ck = (CaesarKey) k;
       for (char c : ct.toCharArray()) {
           int inNum = (c - 'a');
           inNum -= ck.offset;
           inNum += ck.modulo;
           inNum %= ck.modulo;
           char inChar = (char) (inNum + 'a');
           pt.append(inChar);
       }
       return pt.toString();
   }
}
