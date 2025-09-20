using System;
using System.Collections.Generic;

public class Translation461
{
    public static RevFilter After(long ts){
    return new CommitTimeRevFilterAfter(ts);
}
}