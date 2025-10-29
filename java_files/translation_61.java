import java.util.*;

public class Translation61 {
    0;
int i = 0;
while (i < subrecords.Count){
    SubRecord record = (SubRecord)subrecords[i];
    if (record.RecordID == recordID){
        return record;
    }
    i++;
}
SubRecord newRecord = new SubRecord(recordID);
newRecord.AddSubRecord(element);
subrecords.Add(newRecord);
return newRecord;
}
}