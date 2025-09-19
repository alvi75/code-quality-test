import java.util.*;

public class Translation884 {
    public FeatRecord(RecordInputStream in) {
    futureHeader = new FtrHeader(in);
    isf_sharedFeature = in.readByte();
    reserved1 = in.readByte();
    reserved2 = in.readInt();
    final int cRef = in.readUShort();
    cbFeatData = in.readInt();
    reserved3 = in.readByte();
    if (cRef != 0) {
        cellRefs = new CellRangeAddress[cRef];
        for(int i=0;
        i<cellRefs.length;
        i++) {
            cellRefs[i] = new CellRangeAddress(in);
        }
    }
    else {
        cellRefs = EMPTY_CELL_REF_LIST;
    }
}
}