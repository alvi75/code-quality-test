ublic AreaEval offset(int relFirstRowIx, int relLastRowIx,int relFirstColIx, int relLastColIx) {
    if (refEval == null) {
        return areaEval.offset(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
    }
    return refEval.offset(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
}