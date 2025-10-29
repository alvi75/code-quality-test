import java.util.*;

public class Translation312 {
    1) {
    if (arg0 == null) return ErrorEval.NUM_ERROR;
    NumberEval numArg0 = OperandResolver.GetSingleValue(arg0, srcRowIndex, srcColumnIndex);
    if (numArg0.IsNaN()) return ErrorEval.NUM_ERROR;
    if (numArg0.IsInfinity()) return ErrorEval.NUM_ERROR;
    return ErrorEval.VALUE_INVALID;
}
2) {
    String strArg0 = OperandResolver.CoerceValueToString(arg0);
    if (strArg0.Length == 0) return ErrorEval.NUM_ERROR;
    try{
        return Double.valueOf(strArg0);
    }
    catch (NumberFormatException e){
        return ErrorEval.NUM_ERROR;
    }
}
3) {
    return ErrorEval.NUM_ERROR;
}
}