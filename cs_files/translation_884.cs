using System;
using System.Collections.Generic;

public class Translation884
{
    public FeatRecord(RecordInputStream in1){
    futureHeader = new FtrHeader(in1);
    isf_sharedFeatureType = in1.ReadShort();
    reserved1 = (byte)in1.ReadByte();
    reserved2 = in1.ReadInt();
    int cref = in1.ReadUShort();
    cbFeatData = in1.ReadInt();
    reserved3 = in1.ReadShort();
    cellRefs = new CellRangeAddress[cref];
    for (int i = 0;
    i < cellRefs.Length;
    i++){
        cellRefs[i] = new CellRangeAddress(in1);
    }
}
}