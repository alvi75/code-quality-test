using System;
using System.Collections.Generic;

public class Translation430
{
    public override void Serialize(ILittleEndianOutput out1){
    out1.WriteShort(field_1_categoryDataType);
    out1.WriteShort(field_2_valuesDataType);
    out1.WriteShort(field_3_numCategories);
    out1.WriteShort(field_4_numValues);
    out1.WriteShort(field_5_bubbleSeriesType);
    out1.WriteShort(field_6_numBubbleValues);
}
}