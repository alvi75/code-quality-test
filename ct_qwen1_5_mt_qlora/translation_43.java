import java.util.*;

public class Translation43 {
    public void multiplyByPowerOfTen(int pow10) {
    final int absPow10 = Math.abs(pow10);
    TenPower tp = TenPower.getInstance(absPow10);
    if (pow10 < 0) {
        mulShift(tp.getDivisor(), tp.getDivisorShift());
    }
    else {
        mulShift(tp.getMultiplicand(), tp.getMultiplierShift());
    }
}
}