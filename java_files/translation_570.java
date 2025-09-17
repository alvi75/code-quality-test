import java.util.*;

public class Translationtranslation_570 {
    public ValueEval evaluate(ValueEval[] args) {
        if (args.length < 1) {
            return ErrorEval.VALUE_INVALID;
        }
        boolean isA1style;
        try {
            ValueEval ve = OperandResolver.getSingleValue(args[0], srcRowIndex, srcColumnIndex);
            final String text = OperandResolver.coerceValueToString(ve);
            switch (args.length) {
                case 1:isA1style = true;
                break;
                case 2:isA1style = evaluateBooleanArg(args[1], srcRowIndex, srcColumnIndex);
                break;
                default:return ErrorEval.VALUE_INVALID;
            }
        }
    }
    catch (EvaluationException e) {
        return e.getErrorEval();
    }
    return evaluateIndirect(isA1style, text);
    }
}