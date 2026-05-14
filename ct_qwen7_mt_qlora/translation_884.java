import java.util.*;

public class Translation884 {
    1 public FeatRecord(RecordInputStream in1) {
    2 futureHeader = new FtrHeader(in1);
    3 isf_sharedFeatureType = in1.readShort();
    4 reserved1 = (byte) in1.readByte();
    5 reserved2 = in1.readInt();
    6 int cref = in1.readUShort();
    7 cbFeatData = in1.readInt();
    8 reserved3 = in1.readShort();
    9 cellRefs = new CellRangeAddress[cref];
    10 for (int i = 0;
    i < cellRefs.length;
    i++) {
        11 cellRefs[i] = new CellRangeAddress(in1);
        12 }
        13 switch (isf_sharedFeatureType) {
            14 case FeatHdrRecord.SHAREDFEATURES_ISFPROTECTION :15 sharedFeature = new FeatProtection(in1);
            16 break;
            17 case FeatHdrRecord.SHAREDFEATURES_ISFFEC2 :18 sharedFeature = new FeatFormulaErr2(in1);
            19 break;
            20 case FeatHdrRecord.SHAREDFEATURES_ISFFACTOID :21 sharedFeature = new FeatSmartTag(in1);
            22 break;
            23 default :24 logger.log( POILogger . ERROR , "Unknown Shared Feature " + isf_sharedFeatureType + " found!" );
            25 break;
            26 }
        }
}