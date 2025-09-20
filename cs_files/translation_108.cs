using System;
using System.Collections.Generic;

public class Translation108
{
    public HSSFColor GetColor(short index){
    if (index == HSSFColor.Predefined.AUTOMATIC){
        return HSSFColor.AUTOMATIC;
    }
    byte[] b = palette.GetColor(index);
    if (b == null){
        return null;
    }
    else{
        return new CustomColor(b);
    }
}
}