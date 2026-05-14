import java.util.*;

public class Translation884 {
    public FeatRecord(RecordInputStream in) {
    futureHeader = new FtrHeader(in);
    isf_sharedFeatureType = in.readShort();
    reserved1 = in.readByte();
    reserved2 = in.readInt();
    final int cref = in.readUShort();
    cbFeatData = in.readInt();
    reserved3 = in.readShort();
    CellRangeAddress[] crls = new CellRangeAddress[cref];
    for(int i=0;
    i<crls.length;
    i++)crls[i] = new CellRangeAddress(in);
    switch(isf_sharedFeatureType) {
        case SHAREDFEATURES_ISFPROTECTION:sharedFeature = new FeatProtection(in);
        break;
        case SHAREDFEATURES_ISFFEC2:sharedFeature = new FeatFormulaErr2(in);
        break;
        case SHAREDFEATURES_ISFFACTOID:sharedFeature = new FeatSmartTag(in);
        break;
        default:log.log( POILogger.ERROR,"Unknown Shared Feature "+isf_sharedFeatureType+" found!");
        break;
    }
}
}