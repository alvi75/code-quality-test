import java.util.*;

public class Translation240 {
    0;
int ruleCount = getRuleCount();
if (ruleCount == 0){
    throw new InvalidOperationException("No rules defined");
}
IConditionalFormattingRule rule = getRule(ruleIndex - 1);
if (rule is HSSFConditionalFormattingRule){
    ((HSSFConditionalFormattingRule)rule).SetFormula1(formula1);
    ((HSSFConditionalFormattingRule)rule).SetFormula2(formula2);
}
else{
    throw new InvalidOperationException("Invalid rule type");
}
}
}