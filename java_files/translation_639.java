import java.util.*;

public class Translation639 {
    public long valueFor(double elapsed) {
    double val;
    if (mModBy == 0)val = elapsed / mFactor;
    elseval = (elapsed / mFactor) % mModBy;
    if (mType == '0')return (long) Math.round(val);
    return (long) val;
}
}