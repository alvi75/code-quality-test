using System;
using System.Collections.Generic;

public class Translation755
{
    public override bool Equals(object o){
    if (!(o is Property)){
        return false;
    }
    Property p = (Property)o;
    Object pValue = p.Value;
    long pId = p.ID;
    if (id != pId || (id != 0 && !TypesAreEqual(type, p.Type))){
        return false;
    }
    if (value == null && pValue == null){
        return true;
    }
    if (value == null || pValue == null){
        return false;
    }
    Type a = value.GetType();
    Type b = pValue.GetType();
    if (!a.Equals(b)){
        return false;
    }
    if (value is byte[]){
        byte[] thisVal = (byte[])value;
        byte[] otherVal = pValue;
        int len = UnpaddedLength(thisVal);
        if (len != UnpaddedLength(otherVal)){
            return false;
        }
        for (int i = 0;
        i < len;
        i++){
            if (thisVal[i] != otherVal[i]){
                return false;
            }
        }
        return true;
    }
    return value.Equals(pValue);
}
}