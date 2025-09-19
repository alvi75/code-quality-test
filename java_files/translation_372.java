import java.util.*;

public class Translation372 {
    public int sumSizedTokens( int fromIx, int toIx ){
    int result = 0;
    for (int i=fromIx;
    i<toIx;
    i++) {
        result += _ptgs[i].getSize();
    }
    return result;
}
}