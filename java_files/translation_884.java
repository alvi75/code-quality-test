import java.util.*;

public class Translation884 {
    ublic FeatRecord(RecordInputStream in) {
    futureHeader = new FtrHeader(in);
    isfSharedFeatureType = in.readShort();
    reserved1 = (byte)in.readByte();
    reserved2 = in.readInt();
    int cref = in.readShort();
    cbFeatData = in.readInt();
    reserved3 = in.readShort();
    cellRefs = new CellRangeAddress[cref];
    for (int i = 0;
    i < cellRefs.length;
    i++) {
        cellRefs[i] = new CellRangeAddress(in);
    }
    switch (isfSharedFeatureType) {
        case FeatHdrRecord.SHAREDFEATURES_ISFPROTECTION: sharedFeature = new FeatProtection(in);
        break;
        case FeatHdrRecord.SHAREDFEATURES_ISFFEC2: sharedFeature = new FeatFormulaErr2(in);
        break;
        case FeatHdrRecord.SHAREDFEATURES_ISFFACTOID: sharedFeature = new FeatSmartTag(in);
        break;
        default: logger.log(POILogger.ERROR, "Unknown Shared Feature " + isfSharedFeatureType + " found!");
        break;
    }
}
}