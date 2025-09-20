using System;
using System.Collections.Generic;

public class Translation588
{
    public virtual void SetByteValue(byte value){
    if (!(FieldsData is byte)){
        throw new System.ArgumentException("cannot change value type from " + FieldsData.GetType().Name + " to byte");
    }
    FieldsData = value;
}
}