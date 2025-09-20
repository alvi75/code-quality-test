using System;
using System.Collections.Generic;

public class Translation999
{
    public virtual string GetClassArg(){
    if (null != originalArgs){
        string className = originalArgs[CLASS_NAME];
        if (null != className){
            return className;
        }
    }
    return GetType().FullName;
}
}