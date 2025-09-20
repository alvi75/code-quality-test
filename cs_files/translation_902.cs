using System;
using System.Collections.Generic;

public class Translation902
{
    public virtual bool IsSaturated(FuzzySet bloomFilter, FieldInfo fieldInfo){
    return bloomFilter.GetSaturation() > 0.9f;
}
}