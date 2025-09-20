using System;
using System.Collections.Generic;

public class Translation629
{
    public virtual Entry GetEntry(string name){
    Entry result;
    directory.GetEntry(name, out result);
    return result;
}
}