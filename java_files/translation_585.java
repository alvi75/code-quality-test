public boolean processMatch(ValueEval eval) {
    if (eval instanceof NumericValueEval) {
        NumericValueEval ne = (NumericValueEval) eval;
        double value = ne.getNumberValue();
        if (value < _minimumValue) {
            _result = ErrorEval.NUM_ERROR;
            return false;
        }
        if (value > _maximumValue) {
            _result = ErrorEval.NUM_ERROR;
            return false;
        }
    }
    return true;
}