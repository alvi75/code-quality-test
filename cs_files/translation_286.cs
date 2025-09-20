using System;
using System.Collections.Generic;

public class Translation286
{
    public override bool Equals(Object obj){
    if (this == obj){
        return true;
    }
    if (obj == null){
        return false;
    }
    if (obj is HSSFCellStyle){
        HSSFCellStyle other = (HSSFCellStyle)obj;
        if (_format == null){
            if (other._format != null){
                return false;
            }
        }
        else if (!_format.Equals(other._format)){
            return false;
        }
        if (_index != other._index){
            return false;
        }
        return true;
    }
    return false;
}
}