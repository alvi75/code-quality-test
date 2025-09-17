import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_511 {
    public String toFormulaString(String[] operands) {
        if (space.isSet(_options)) {
            return operands[0];
        }
        else if (ifFunc.isSet(_options)) {
            return toFormulaString() + "(" + operands[0] + ")";
        }
        else if (skip.isSet(_options)) {
            return toFormulaString() + operands[0];
        }
        else {
            return toFormulaString() + "(" + operands[0] + ")";
        }
    }
}