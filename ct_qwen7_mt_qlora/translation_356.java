import java.util.*;

public class Translation356 {
    1 public RefEval getRef3DEval(Ref3DPtg rptg) {
    2 SheetRangeEvaluator sre = createExternSheetRefEvaluator(rptg.getExternSheetIndex());
    3 return new LazyRefEval(rptg.getRow(), rptg.getColumn(), sre);
}
}