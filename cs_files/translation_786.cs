using System;
using System.Collections.Generic;

public class Translation786
{
    public virtual string Get(string key){
    int bucket = NormalCompletion.GetBucket(key);
    if (bucket == -1){
        return null;
    }
    return values[bucket];
}
}