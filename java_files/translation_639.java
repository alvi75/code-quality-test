import java.util.*;

public class Translationtranslation_639 {
    public long valueFor(double elapsed) {
        double val;
        if (mModBy == 0)val = elapsed / mFactor;
        elseval = (elapsed / mFactor) % mModBy;
        if (mType == TYPE_MINUTES) {
            return (long) val;
        }
        else if (mType == TYPE_SECONDS) {
            return (long) (val * 60);
        }
        else if (mType == TYPE_MILLISECONDS) {
            return (long) (val * 1000 * 1000);
        }
        return (long) val;
    }
}