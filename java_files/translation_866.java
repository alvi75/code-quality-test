import java.util.*;

public class Translation866 {
    0;
int relLastColIx = 0;
for (int i = 0;
i < _areaEval.Count;
i++){
    AreaRefEval areaRef = _areaEval[i];
    relFirstRowIx += areaRef.FirstRowIx;
    relLastRowIx += areaRef.LastRowIx;
    relFirstColIx += areaRef.FirstColIx;
    relLastColIx += areaRef.LastColIx;
}
return new AreaEval(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
}
}