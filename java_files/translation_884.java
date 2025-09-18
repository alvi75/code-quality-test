import java.util.*;

public class Translation884 {
    public FeatRecord(RecordInputStream in) {
    futureHeader = new FtrHeader(in);
    isf_sharedFeatureType = in.readShort();
    reserved1 = in.readByte();
    reserved2 = in.readInt();
    int cref = in.readUShort();
    cbFeatData = in.readInt();
    reserved3 = in.readShort();
    cellRefs = new CellRangeAddress[cref];
    for (int i = 0;
    i < cellRefs.length;
    i++) {
        cellRefs[i] = new CellRangeAddress(in);
    }
}
}