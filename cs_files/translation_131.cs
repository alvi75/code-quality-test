using System;
using System.Collections.Generic;

public class Translation131
{
    public IDataValidationConstraint CreateTimeConstraint(int operatorType, String formula1, String formula2){
    return DVConstraint.CreateTimeConstraint(operatorType, formula1, formula2);
}
}