import java.util.*;

public class Translation43 {
    public void multiplyByPowerOfTen( int pow10 ) {
    final TenPower tenPow = TEN_POWERS[pow10];
    if (pow10 < 0) {
        divide(tenPow.divisor,tenPow.shift);
    }
    else {
        multiply(tenPow.multiplicand,tenPow.shift);
    }
}
}