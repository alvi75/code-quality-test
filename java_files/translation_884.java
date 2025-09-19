import java.util.*;

public class Translation884 {
    ublic FeatRecord(RecordInputStream in) {
    futureHeader = new FtrHeader(in);
    isf_sharedFeatureType = in.readShort();
    reserved1 = in.readByte();
    reserved2 = in.readInt();
    int cref = in.readUShort();
    cbFeatData = in.readInt();
    reserved3 = in.readShort();
    if (cref != NUM_CELL_REFS) {
        throw new RecordFormatException("Expected " + NUM_CELL_REFS + " cell refs but got " + cref);
    }
    switch (isf_sharedFeatureType) {
        case ISF_PROTECTION:sharedFeature = new FeatProtection(in);
        break;
        case ISF_FEC2:sharedFeature = new FeatFormulaErr2(in);
        break;
        case ISF_FACTOID:sharedFeature = new FeatSmartTag(in);
        break;
        default:logger.log( POILogger.ERROR, "Unknown Shared Feature " + isf_sharedFeatureType + " found!");
        break;
    }
}
}