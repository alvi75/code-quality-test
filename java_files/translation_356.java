import java.util.*;

public class Translation356 {
    public ValueEval getRef3DEval(Ref3DPtg rptg) {
    SheetRangeEvaluator sre = createExternSheetRefEvaluator(rptg.getSheetName(), rptg.getLastSheetName(),rptg.getExternalWorkbookNumber());
    return new LazyRefEval(rptg.getRow(), rptg.getColumn(), sre);
}
}