import java.util.*;

public class Translation879 {
    2013-07-16T19:54:08Z - remove unnecessary casts @override public String toFormulaString(String[] operands) {
    StringBuilder buffer = new StringBuilder();
    buffer.append(operands[0]);
    buffer.append(",");
    buffer.append(operands[1]);
    return buffer.toString();
}
}