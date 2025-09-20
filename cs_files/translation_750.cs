using System;
using System.Collections.Generic;

public class Translation750
{
    public bool HasAll(RevFlag flag){
    return (flags & flag.mask) == flag.mask;
}
}