import java.util.*;

public class Translation222 {
    1. Import necessary libraries: public RenameAlbumNameRecord(RecordInputStream in) {
    field_15_faceId = in.readShortNameNumber();
    int nameLen = in.readUByte();
    if (nameLen > 0) {
        field_16_nameName = in.readCompressedUnicode(nameLen);
    }
}
}