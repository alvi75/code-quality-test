import java.util.*;

public class Translation43 {
    2013-07-15T16:48:09+02:00 @overrideprotected void multiplyByPowerOfTen(int pow10) {
    TenPower tp = TenPower.getInstance(Math.abs(pow10));
    if (pow10 < 0) {
        mulShift(tp.divisor, tp.divisorShift);
    }
    else {
        mulShift(tp.multiplicand, tp.multiplierShift);
    }
}
}