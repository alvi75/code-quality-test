import java.util.*;

public class Translationtranslation_43 {
    public void multiplyByPowerOfTen(int pow10) {
        final int MAX_POW10 = 39;
        final int MIN_POW10 = -39;
        if (pow10 < MIN_POW10) {
            pow10 = MIN_POW10;
        }
        else if (pow10 > MAX_POW10) {
            pow10 = MAX_POW10;
        }
        int x = pow10 / LOG_BASE_10_OF_2;
        int y = pow10 % LOG_BASE_10_OF_2;
        long rawBits = numberLongs[roundNumber & MAX_RATIONES-1];
        rawBits = rounder.round(rawBits, x, y);
        numberLongs[roundNumber & MAX_RATIONES-1] = rawBits;
    }
}