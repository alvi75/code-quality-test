import java.util.*;

public class Translation884 {
    public FeatRecord(RecordInputStream in) {
    futureHeader = new FtrHeader(in);
    isf_sharedFeatureType = in.readShort();
    reserved1 = (byte) in.readByte();
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
        case FeatHdrRecord.SHAREDFEATURES_ISFPROTECTION:sharedFeature = new FeatProtection(in);
        break;
        case FeatHdrRecord.SHAREDFEATURES_ISFFEC2:sharedFeature = new FeatFormulaErr2(in);
        break;
        case FeatHdrRecord.SHAREDFEATURES_ISFFACTOID:sharedFeature = new FeatSmartTag(in);
        break;
        default:logger.log( POILogger.ERROR, "Unknown Shared Feature "+ isf_sharedFeatureType +" found!");
        break;
    }
}
}