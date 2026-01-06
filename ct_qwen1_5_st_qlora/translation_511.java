import java.util.*;

public class Translation511 {
    public final String toFormulaString(String[] operands) {
    if (space.isSet(options)) {
        return operands[0];
    }
    else if (optiIf.isSet(options)) {
        return toFormulaString()+ "("+operands[0]+")";
    }
    else if (optiSkip.isSet(options)) {
        return toFormulaString()+ operands[0];
    }
    else {
        return toFormulaString()+ "("+operands[0]+")";
    }
}
}