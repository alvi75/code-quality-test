import java.util.*;

public class Translation43 {
    public void multiplyByPowerOfTen(int pow10) {
    TenPower tp = TenPower.getInstance(Math.abs(pow10));
    if (pow10 < 0) {
        mulShift(tp._divisor, tp._divisorShift);
    }
    else {
        mulShift(tp._multiplicand, tp._multiplierShift);
    }
}
}