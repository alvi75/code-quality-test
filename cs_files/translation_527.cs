using System;
using System.Collections.Generic;

public class Translation527
{
    public NGit.Diff.Edit After(NGit.Diff.Edit cut){
    return new NGit.Diff.Edit(beginA, cut.beginA, beginB, cut.beginB);
}
}