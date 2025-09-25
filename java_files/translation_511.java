import java.util.*;

public class Translation511 {
    public String toFormulaString(String[] operands) {
    if (space.isSet(field_1_options)) {
        return operands[0];
    }
    else if (opti_if.isSet(field_1_options)) {
        return toFormulaString() + "(" + operands[0] + ")";
    }
    else if (opti_skip.isSet(field_1_options)) {
        return toFormulaString() + operands[0];
    }
    else {
        return toFormulaString() + "(" + operands[0] + ")";
    }
}
}