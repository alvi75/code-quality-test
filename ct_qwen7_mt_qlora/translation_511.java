import java.util.*;

public class Translation511 {
    245 public String toFormulaString(String[] operands) {
    if (field_1_options.isSpace()) {
        return operands[0];
    }
    else if (field_1_options.isOptiIf()) {
        return toFormulaString() + "(" + operands[0] + ")";
    }
    else if (field_1_options.isOptiSkip()) {
        return toFormulaString() + operands[0];
    }
    else {
        return toFormulaString() + "(" + operands[0] + ")";
    }
}
}