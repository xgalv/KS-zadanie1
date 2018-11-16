package zadanie.helpers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author viktorgal
 */
public class Math {
    public static List allPerm(Object input[]) {
        List<Object[]> retVal = new ArrayList(factorial(input.length));
        allPerm(0, input, retVal);
        return retVal;
    }

    public static void allPerm(int fixed, Object input[], List output) {
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
     public static int factorial(int n) {
        int retVal = 1;
        for (int i = 2; i <= n; i++) {
            retVal *= i;
        }
        return retVal;
    }
}
