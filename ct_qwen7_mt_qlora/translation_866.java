import java.util.*;

public class Translation866 {
    1 public AreaEval offset(int relFirstRowIx, int relLastRowIx,int relFirstColIx, int relLastColIx) {
    2 if (this._refEval == null) {
        3 return this._areaEval.offset(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
        4 }
        5 return this._refEval.offset(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
        6 }
}