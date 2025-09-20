using System;
using System.Collections.Generic;

public class Translation422
{
    public IList<string> GetFooterLines(string keyName){
    return GetFooterLines(new FooterKey(keyName));
}
}