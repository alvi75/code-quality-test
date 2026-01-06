import java.util.*;

public class Translation884 {
    public FeatRecord(RecordInputStream in1) {
    futureHeader=new FtrHeader(in1);
    isf_sharedFeatureType=in1.readShort();
    reserved1=(byte)in1.readByte();
    reserved2=in1.readInt();
    int cref=in1.readUShort();
    cbFeatData=in1.readInt();
    reserved3=in1.readShort();
    cellRefs=new CellRangeAddress[cref];
    for(int i=0;
    i<cellRefs.length;
    i++) {
        cellRefs[i]=new CellRangeAddress(in1);
    }
    switch(isf_sharedFeatureType) {
        case FeatHdrRecord.SHAREDFEATURES_ISFPROTECTION:sharedFeature=new FeatProtection(in1);
        break;
        case FeatHdrRecord.SHAREDFEATURES_ISFFEC2:sharedFeature=new FeatFormulaErr2(in1);
        break;
        case FeatHdrRecord.SHAREDFEATURES_ISFFACTOID:sharedFeature=new FeatSmartTag(in1);
        break;
        default:logger.log(POILogger.ERROR,"Unknown Shared Feature "+isf_sharedFeatureType+" found!");
        break;
    }
}
}