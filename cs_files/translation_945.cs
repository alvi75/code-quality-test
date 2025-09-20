using System;
using System.Collections.Generic;

public class Translation945
{
    public virtual E pollFirst(){
    return (_size == 0) ? default(E) : removeFirstImpl();
}
}