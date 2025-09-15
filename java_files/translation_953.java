import java.util.*;

public class Translationtranslation_953 {
    public ChartFRTInfoRecord(RecordInputStream in) {
        rt = in.readShort();
        grbitFrt = in.readShort();
        verOriginator = in.readByte();
        verWriter = in.readByte();
        int cCFRTID = in.readShort();
        rgCFRTID = new CFRTID[ccfRTID];
        for (int i = 0;
        i < rgCFRTID.length;
        i++) {
            rgCFRTID[i] = new CFRTID(in);
        }
    }
}