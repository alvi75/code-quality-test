ublic ValueEval getRef3DEval(Ref3DPtg rptg) {
    SheetRangeEvaluator sre = createExternSheetRefEvaluator(rptg.getExternSheetIndex());
    return new LazyRefEval(rptg.getRow(), rptg.getColumn(), sre);
}