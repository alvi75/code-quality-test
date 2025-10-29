import java.util.*;

public class Translation801 {
    0;
int sid = in1.ReadUShort();
if (sid == 0x0000) {
    return new BoundSheetRecord(in1);
}
}
else if (sid == 0x0002) {
    return new BookProtectionRecord(in1);
}
else if (sid == 0x0003) {
    return new FileRecoveryRecord(in1);
}
else if (sid == 0x0004) {
    return new WorkbookGlobalsRecord(in1);
}
else if (sid == 0x0005) {
    return new WorksheetRecord(in1);
}
else if (sid == 0x0006) {
    return new SheetNamesRecord(in1);
}
else if (sid == 0x0007) {
    return new SheetListNamesRecord(in1);
}
else if (sid == 0x0008) {
    return new SheetCalculationRecord(in1);
}
else if (sid == 0x0009) {
    return new SheetViewsRecord(in1);
}
else if (sid == 0x000A) {
    return new SheetFormatRecords(in1);
}
else if (sid == 0x000B) {
    return new SheetDataRecords(in1);
}
else if (sid == 0x000C) {
    return new SheetObjectsRecord(in1);
}
else if (sid == 0x000D) {
    return new SheetDrawingRecord(in1);
}
else if (sid == 0x000E) {
    return new SheetDrawingProtectRecord(in1);
}
else if (sid == 0x000F) {
    return new SheetExternalLinkRecord(in1);
}
else if (sid == 0x0010) {
    return new SheetExternalLinkMetadataRecord(in1);
}
else if (sid == 0x0011) {
    return new SheetExternalReferenceRecord(in1);
}
else if (sid == 0x0012) {
    return new SheetExternalReferenceMetadataRecord(in1);
}
else if (sid == 0x0013) {
    return new SheetExternalBookRecord(in1);
}
else if (sid == 0x0014) {
    return new SheetExternalBookMetadataRecord(in1);
}
else if (sid == 0x0015) {
    return new SheetExternalLinkRecord(in1);
}
else if (sid == 0x0016) {
    return new SheetExternalLinkMetadataRecord(in1);
}
else if
}