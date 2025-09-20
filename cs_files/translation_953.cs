using System;
using System.Collections.Generic;

public class Translation953
{
    public ChartFRTInfoRecord(RecordInputStream in1){
    rt = in1.ReadShort();
    grbitFrt = in1.ReadShort();
    verOriginator = in1.ReadByte();
    verWriter = in1.ReadByte();
    int cCFRTID = in1.ReadShort();
    rgCFRTID = new CFRTID[cCFRTID];
    for (int i = 0;
    i < cCFRTID;
    i++){
        rgCFRTID[i] = new CFRTID(in1);
    }
}
}