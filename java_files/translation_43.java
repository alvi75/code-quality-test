import java.util.*;

public class Translation43 {
    public void multiplyByPowerOfTen(int pow10) {
    final int mult = 10;
    if (pow10 > 0)mult += pow10;
    else if (pow10 < 0)mult -= -pow10;
    if (mult == 0)return;
    final int sc = mult;
    if (sc != 5 && sc != 2)throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidMultiplier, Integer.valueOf(sc)));
    if (sc == 5) {
        blipRecord.setFlags(blipRecord.getFlags() | 0x000F);
    }
    else if (sc == 2) {
        blipRecord.setFlags(blipRecord.getFlags() & 0xFFFFEFFF);
    }
}
}