import java.util.*;

public class Translation43 {
    public final void multiplyByPowerOfTen(int pow10) {
    final int div = pow10 / 3;
    final int mod = pow10 % 3;
    if (mod != 0 || div == 0) {
        throw new IllegalArgumentException("Illegal power of ten " + pow10 + ", must have power of three between 1 and 9");
    }
    int divisor = 1 << div;
    if (div > 32) {
        throw new IllegalArgumentException("Cannot multiply by power of ten " + pow10 + " with bits shift of " + div);
    }
    _significand *= divisor;
    _binaryExponent += mod;
}
}