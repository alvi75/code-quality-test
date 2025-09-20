using System;
using System.Collections.Generic;

public class Translation332
{
    public override Merger NewMerger(Repository db){
    return new InCoreMerger(db);
}
}