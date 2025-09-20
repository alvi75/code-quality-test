using System;
using System.Collections.Generic;

public class Translation205
{
    public override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[DBCELL]\n");
    buffer.Append(" .rowoffset = ").Append(StringUtil.ToHexString(RowOffset)).Append("\n");
    for (int k = 0;
    k < field_2_cell_offsets.Length;
    k++){
        buffer.Append(" .cell_" + k + " = ").Append(StringUtil.ToHexString(CellOffsets[k])).Append("\n");
    }
    buffer.Append("[/DBCELL]\n");
    return buffer.ToString();
}
}