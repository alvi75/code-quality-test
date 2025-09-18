public String toFormulaString(String[] operands) {
    if(space.isSet(field_1_options)) {
        return operands[0];
    }
    else if(optiIf.isSet(field_1_options)) {
        return "IF(" + operands[0] + ")";
    }
    else if(optiSkip.isSet(field_1_options)) {
        return "";
    }
    else if(optiSum.isSet(field_1_options)) {
        return "+";
    }
    else if(optiSub.isSet(field_1_options)) {
        return "-";
    }
    else {
        return "(" + operands[0] + ")";
    }
}