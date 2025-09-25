import java.util.*;

public class Translation953 {
    public ChartFRTInfoRecord(RecordInputStream in) {
    rt = in.readShort();
    grbitFrt = in.readShort();
    verOriginator = in.readByte();
    verWriter = in.readByte();
    int cCFRTID = in.readShort();
    cfrtid = new CFRTRID(cCFRTID);
    for (int i = 0;
    i < cCFRTID;
    i++) {
        cfrtid[i] = new CFRTRID();
    }
}
}