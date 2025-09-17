import java.util.*;

public class Translationtranslation_372 {
    public int sumTokenSizes(int fromIx, int ToIx) {
        int result = 0;
        for (int i=fromIx;
        i<ToIx;
        i++) {
            result += _ptgs[i].getSize();
        }
        return result;
    }
}