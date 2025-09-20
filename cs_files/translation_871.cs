using System;
using System.Collections.Generic;

public class Translation871
{
    public ColumnInfoRecord(RecordInputStream in1){
    _first_col = in1.ReadUShort();
    _last_col = in1.ReadUShort();
    _col_width = in1.ReadUShort();
    _xf_index = in1.ReadUShort();
    _options = in1.ReadUShort();
    switch (in1.Remaining)
}