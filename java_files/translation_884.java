import java.util.*;

public class Translation884 {
    ublic FeatRecord(RecordInputStream in1){
    FutureHeader = new FtrHeader(in1);
    isf_sharedFeatureType = in1.ReadShort();
    reserved1 = (byte)in1.ReadByte();
    reserved2 = in1.ReadInt();
    int cref = in1.ReadUShort();
    cbFeatData = in1.ReadInt();
    reserved3 = in1.ReadShort();
    cellRefs = new CellRangeAddress[cref];
    for (int i = 0;
    i < cellRefs.Length;
    i++){
        cellRefs[i] = new CellRangeAddress(in1);
    }
    switch (isf_sharedFeatureType){
        case FeatHdrRecord.SHAREDFEATURES_ISFPROTECTION:sharedFeature = new FeatProtection(in1);
        break;
        case FeatHdrRecord.SHAREDFEATURES_ISFFEC2:sharedFeature = new FeatFormulaErr2(in1);
        break;
        case FeatHdrRecord.SHAREDFEATURES_ISFFACTOID:sharedFeature = new FeatSmartTag(in1);
        break;
        default:logger.log(POILogger.ERROR, "Unknown Shared Feature " + isf_sharedFeatureType + " found!");
        break;
    }
}
}