import java.util.*;

public class Translationtranslation_372 {
    public int sumTokenSizes(int fromIx, int toIx) {
        int result = 0;
        for (int i=fromIx;
        i<toIx;
        i++) {
            result += _ptgs[i].getSize();
        }
        return result;
    }
}