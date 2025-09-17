import java.util.*;

public class Translationtranslation_953 {
    public ChartFRTInfoRecord(RecordInputStream in) {
        rt = in.readShort();
        grbitFrt = in.readShort();
        verOriginator = in.readByte();
        verWriter = in.readByte();
        int cCFRTID = in.readUShort();
        cfrtids = new CFRTID[cCFRTID];
        for (int i = 0;
        i < cCFRTID;
        i++) {
            cfrtids[i] = new CFRTID(in);
        }
    }
}