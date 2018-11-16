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

public class Monoalphabetic implements Cipher {

    @Override
    public String encrypt(String pt, Key k) {
        if (!(k instanceof MonoalphabeticKey)) {
            throw new IllegalArgumentException("Vstupom musí byť inštancia MonoalphabeticKey");
        }
        MonoalphabeticKey mk = (MonoalphabeticKey) k;

        StringBuilder ct = new StringBuilder();
        for (char c : pt.toCharArray()) {
            ct.append(mk.encPerm[c - 'a']);
        }
        return ct.toString();
    }

    @Override
    public String decrypt(String ct, Key k) {
        if (!(k instanceof MonoalphabeticKey)) {
            throw new IllegalArgumentException("Vstupom musí byť inštancia MonoalphabeticKey");
        }
        MonoalphabeticKey mk = (MonoalphabeticKey) k;

        StringBuilder pt = new StringBuilder();
        for (char c : ct.toCharArray()) {
            pt.append(mk.decPerm[c - 'a']);
        }
        return pt.toString();
    }
}