using System;
using System.Collections.Generic;

public class Translation356
{
    public ValueEval GetRef3DEval(Ref3DPxg rptg){
    SheetRangeEvaluator sre = CreateExternSheetRefEvaluator(rptg.SheetName, rptg.LastSheetName, rptg.ExternalWorkbookNumber);
    return new LazyRefEval(rptg.Row, rptg.Column, sre);
}
}