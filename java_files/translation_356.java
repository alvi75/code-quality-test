import java.util.*;

public class Translationtranslation_356 {
    public ValueEval getRef3DEval(Ref3DPtg rptg) {
        SheetRangeEvaluator sre = createExternSheetRefEvaluator(rptg.getExternSheetIndex());
        return new LazyRefEval(rptg.getRow(), rptg.getColumn(), sre);
    }
}