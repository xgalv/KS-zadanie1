package zadanie.Substitucie;

/**
 *
 * @author vikto
 */
import zadanie.helpers.Permutations;
import zadanie.Crypto.Key;

public class MonoalphabeticKey implements Key {

    Character encPerm[];
    Character decPerm[];

    public MonoalphabeticKey(Character[] encPerm) {
        this.encPerm = encPerm;
        this.decPerm = Permutations.inverse(encPerm);
    }

    public Character[] getEncPerm() {
        return encPerm;
    }

    public Character[] getDecPerm() {
        return decPerm;
    }
}
