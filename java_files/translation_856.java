import java.util.*;

public class Translationtranslation_856 {
    public void swap() {
        final int sBegin = beginA;
        sInts[sBegin] = endA;
        sInts[endA] = -1;
        if (sBegin < endB) {
            int sEnd = endB;
            endB = sEnd;
            beginEnd = new int[2];
            beginEnd[0] = sBegin;
            beginEnd[1] = endB;
        }
        else if (endB < sBegin) {
            int sMid = (endB + sBegin) / 2;
            int mStart = sMid * UAX29URLEmail.MIN_VALUE;
            mEnd = mStart + UAX29URLEmail.MAX_VALUE;
            mInts[mStart] = -1;
            mInts[mEnd] = -1;
            beginM = mStart;
            endM = mEnd;
        }
    }
}