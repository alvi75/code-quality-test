using System;
using System.Collections.Generic;

public class Translation331
{
    public virtual void AddIfNoOverlap(WeightedPhraseInfo wpi){
    IEnumerator<WeightedPhraseInfo> ite = GetIterator();
    if (!ite.MoveNext()){
        return;
    }
    WeightedPhraseInfo first = ite.Current;
    if (first.IsOffsetOverlap(wpi)){
        return;
    }
    foreach (WeightedPhraseInfo phrase in GetChildren()){
        if (phrase == first){
            continue;
        }
        if (phrase.IsOffsetOverlap(wpi)){
            return;
        }
        #if !PORTABLESystem.Console.Error.WriteLine("warning: useless phrase merge: " + phrase + " offset-oversize " + wpi);
        #endif}
    }
}