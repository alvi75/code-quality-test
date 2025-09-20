using System;
using System.Collections.Generic;

public class Translation815
{
    public override void Serialize(ILittleEndianOutput out1){
    out1.WriteByte(Pane);
    out1.WriteShort(ActiveCellRow);
    out1.WriteShort(ActiveCellCol);
    out1.WriteShort(ActiveCellRef);
    int nRefs = field_6_refs.Length;
    out1.WriteShort(nRefs);
    for (int i = 0;
    i < nRefs;
    i++){
        field_6_refs[i].Serialize(out1);
    }
}
}