using System;
using System.Collections.Generic;

public class Translation439
{
    public override String ToXml(String tab){
    StringBuilder builder = new StringBuilder();
    builder.Append(tab).Append("<").Append(RecordName).Append(">\n");
    for (IEnumerator iterator = EscherRecords.GetEnumerator();
    iterator.MoveNext();
    ){
        EscherRecord escherRecord = (EscherRecord)iterator.Current;
        builder.Append(escherRecord.ToXml());
    }
    builder.Append(tab).Append("</").Append(RecordName).Append(">\n");
    return builder.ToString();
}
}