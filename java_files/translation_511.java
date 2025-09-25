import java.util.*;

public class Translation511 {
    public final String toFormulaString(final String[] operands) {
    if ( space.isSet( options ) ) {
        return operands[0];
    }
    else if ( optiIf.isSet( options )) {
        return formula.toString() + "(" + operands[0] + ")";
    }
    else if ( optiSkip.isSet( options )) {
        return formula.toString() + operands[0];
    }
    else {
        return formula.toString() + "(" + operands[0] + ")";
    }
}
}