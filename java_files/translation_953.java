import java.util.*;

public class Translation953 {
    public FRTInfoRecord(RecordInputStream in) {
    rt = in.readByte();
    grbitFrt = in.readUShort();
    verOriginator = in.readByte();
    verWriter = in.readByte();
    int cCFRTID = in.readUShort();
    rgCFRTID = new CFRTID[cCFRTID];
    for (int i=0;
    i<cCFRTID;
    i++) {
        rgCFRTID[i] = new CFRTID(in);
    }
}
}