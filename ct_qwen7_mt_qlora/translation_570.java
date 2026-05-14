import java.util.*;

public class Translation570 {
    1 public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
    2 if (args.length < 1) {
        3 return ErrorEval.VALUE_INVALID;
        4 }
        5 boolean isA1style;
        6 String text;
        7 try {
            8 ValueEval ve = OperandResolver.getSingleValue(args[0], ec.getRowIndex(), ec.getColumnIndex());
            9 text = OperandResolver.coerceValueToString(ve);
            10 switch (args.length) {
                11 case 1 :12 isA1style = true;
                13 break;
                14 case 2 :15 isA1style = evaluateBooleanArg(args[1], ec);
                16 break;
                17 default :18 return ErrorEval.VALUE_INVALID;
                19 }
                20 }
                catch (EvaluationException e) {
                    21 return e.getErrorEval();
                    22 }
                    23 return evaluateIndirect(ec, text, isA1style);
                }
}