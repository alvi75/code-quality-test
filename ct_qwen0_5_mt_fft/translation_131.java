import java.util.*;

public class Translation131 {
    public HSSFDataValidationConstraint createTimeConstraint(int operatorType, String formula1, String formula2) {
    return createDataValidationConstraint(HSSFDataValidationConstraint.createTimeConstraint(operatorType, formula1, formula2));
}
}