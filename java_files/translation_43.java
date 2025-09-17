import java.util.*;

public class Translationtranslation_43 {
    public void multiplyByPowerOfTen(int pow10) {
        final int ip = Integer.parseInt(Long.toString(_relativeDecimalExponent + pow10), RADIX);
        int fp = ip - 1;
        if (fp == 0) {
            return;
        }
        if (fp > 5) {
            throw new IllegalArgumentException("too many decimal places");
        }
        _relativeDecimalExponent += pow10;
        int sc = _scaler.get();
        if (sc == 0) {
            sc = 1;
        }
        if (sc > 10) {
            sc = 10;
        }
        else if ((sc & 0x0F) != 0) {
            sc++;
        }
        if (sc > 29 || sc < 26) {
            _scaler.set(sc);
        }
    }
}