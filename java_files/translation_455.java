import java.util.*;

public class Translation455 {
    public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1, ValueEval arg2) {
    double result;
    try {
        ValueEval ve = OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
        result = OperandResolver.coerceValueToDouble(ve);
    }
    catch (EvaluationException e) {
        return e.getErrorEval();
    }
    if (Double.isNaN(result)) {
        return ErrorEval.NUM_ERROR;
    }
    int nColumns = getNumberOfColumns(arg2);
    if (nColumns < 1 || nColumns > 256) {
        return ErrorEval.NUM_ERROR;
    }
    String formulaText = TextFunction.getText(arg2);
    FormulaRecord fr = new FormulaRecord(FormulaType.NAMEDRANGE, formulaText);
    fr.setNumVars(nColumns);
    return new AreaOrRefEval(fr);
}
}