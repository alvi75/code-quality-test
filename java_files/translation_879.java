import java.util.*;

public class Translationtranslation_879 {
    public String toFormulaString(String[] operands) {
        StringBuilder buffer = new StringBuilder();
        buffer.append(operands[ 0 ]);
        buffer.append(",");
        buffer.append(operands[ 1 ]);
        return buffer.toString();
    }
}