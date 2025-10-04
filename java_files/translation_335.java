import java.util.*;

public class Translation335 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[CFRULE]\n");
    buffer.append(" .ruletype = ").append(HexDump.shortToHex(getRuleType())).append('\n');
    buffer.append(" .cfoperator = ").append(HexDump.byteToHex(getCfOperator())).append('\n');
    buffer.append(" .conditionalfmt = ").append(HexDump.byteToHex(getConditionalFmt())).append('\n');
    buffer.append(" .uniquecolor = ").append(HexDump.byteToHex(getUniqueColor())).append('\n');
    buffer.append(" .formula1 = ").append(Formula.format(getField_1_formula1())).append('\n');
    buffer.append(" .formula2 = ").append(Formula.format(getField_2_formula2())).append('\n');
    buffer.append("[/CFRULE]\n");
    return buffer.toString();
}
}