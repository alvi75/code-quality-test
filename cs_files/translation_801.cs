using System;
using System.Collections.Generic;

public class Translation801
{
    public static Record CreateSingleRecord(RecordInputStream in1){
    I_RecordCreator constructor;
    if (in1.Sid == CustomRecord.sid){
        constructor = _recordCreators[CustomRecord.sid];
    }
    else{
        constructor = _recordCreators[(int)CustomRecord.GetTypeCode(in1.Sid)];
    }
    if (constructor == null){
        return new UnknownRecord(in1);
    }
    return constructor.Create(in1);
}
}