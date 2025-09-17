import java.util.*;

public class Translationtranslation_884 {
    public FeatRecord(RecordInputStream in) {
        futureHeader = new FtrHeader(in);
        isf_sharedFeatureType = in.readShort();
        reserved1 = in.readByte();
        reserved2 = in.readInt();
        final int cRef = in.readUShort();
        cbFeatData = in.readInt();
        reserved3 = in.readShort();
        if (cRef != 0) {
            cellRefs = new CellRangeAddress[cRef];
            for(int i=0;
            i<cRef;
            i++) {
                cellRefs[i] = new CellRangeAddress(in);
            }
        }
        switch(isf_sharedFeatureType) {
            case FeatHdrRecord.SHAREDFEATURES_ISFPROTECTION:sharedFeature = new FeatProtection(in);
            break;
            case FeatHdrRecord.SHAREDFEATURES_ISFFEC2:sharedFeature = new FeatFormulaErr2(in);
            break;
            case FeatHdrRecord.SHAREDFEATURES_ISFFACTOID:sharedFeature = new FeatSmartTag(in);
            break;
            default:logger.log( POILogger.ERROR, "Unknown Shared Feature " + Integer.toHexString(isf_sharedFeatureType) + " found!");
        }
    }
}