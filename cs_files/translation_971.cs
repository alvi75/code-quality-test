using System;
using System.Collections.Generic;

public class Translation971
{
    public virtual bool IsSuccessful(){
    if (mergeResult != null){
        if (mergeResult.IsSuccessful()){
            return true;
        }
    }
    else{
        if (rebaseResult != null){
            if (rebaseResult.IsSuccessful()){
                return true;
            }
        }
    }
}
return false;
}
}