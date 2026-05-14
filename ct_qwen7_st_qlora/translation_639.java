import java.util.*;

public class Translation639 {
    public long valueFor(double elapsed) {
    final double val;
    if (mModBy == 0)val = elapsed / mFactor;
    elseval = elapsed / mFactor % mModBy;
    if (mType == '0')return Math.round(val);
    elsereturn (long) val;
}
}