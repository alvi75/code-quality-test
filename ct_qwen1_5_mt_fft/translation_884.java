import java.util.*;

public class Translation884 {
    public FeatRecord(RecordInputStream in) {
    futureHeader = new FtrHeader(in);
    isf_sharedFeatureType = in.readShort();
    reserved1 = (byte)in.readByte();
    reserved2 = in.readInt();
    int cref = in.readUShort();
    cbFeatData = in.readInt();
    reserved3 = in.readShort();
    cellRefs = new CellRangeAddress[cref];
    for(int i=0;
    i<cellRefs.length;
    i++) {
        cellRefs[i] = new CellRangeAddress(in);
    }
    switch(isf_sharedFeatureType) {
        case FEAT_PROTECTION:sharedFeature = new FeatProtection(in);
        break;
        case FEAT_FORMULAERR2:sharedFeature = new FeatFormulaErr2(in);
        break;
        case FEAT_SMARTTAG:sharedFeature = new FeatSmartTag(in);
        break;
        default:throw new IllegalStateException("Unknown Shared Feature " + isf_sharedFeatureType + " found!");
    }
}
}