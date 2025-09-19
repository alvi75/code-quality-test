import java.util.*;

public class Translation893 {
    public Ptg[] getTokens( int sheetIndex ){
    int size = _ptgs.size();
    if (sheetIndex < 0 || sheetIndex >= size) {
        throw new IllegalArgumentException("Specified sheet index (" + sheetIndex+ ") is outside the allowed range (0.." + size + ").
}