import java.util.*;

public class Translation953 {
    public ChartFRTInfoRecord(RecordInputStream in) {
    rt = in.readShort();
    grbitFrt = in.readShort();
    verOriginator = (byte)in.readByte();
    verWriter = (byte)in.readByte();
    int cCFRTID = in.readShort();
    rgCFRTID = new CFRTID[cCFRTID];
    for(int i=0;
    i<rgCFRTID.length;
    i++) {
        rgCFRTID[i] = new CFRTID(in);
    }
}
}