using System;
using System.Collections.Generic;

public class Translation887
{
    public Record GetNext(){
    if (!HasNext()){
        throw new InvalidOperationException("Attempt to read past end of stream");
    }
    Record returnRecord = _list[_nextIndex];
    _countRead++;
    returnRecord.Read(_reader);
    return returnRecord;
}
}