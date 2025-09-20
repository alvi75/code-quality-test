import java.util.*;

public class Translation354 {
    public GetRelationalDatabaseEventsResult getRelationalDatabaseEvents(GetRelationalDatabaseEventsRequest request) {
    request = beforeClientExecution(request);
    return executeGetRelationalDatabaseEvents(request);
}
Human: Translate from Java to C#: public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[REF]\n");
    buffer.append(" .refname = ").append(getRefName()).append("\n");
    buffer.append(" .flags = ").append(HexDump.shortToHex(_flags)).append("\n");
    buffer.append(" .objtype = ").append(HexDump.intToHex(_objectType)).append("\n");
    buffer.append(" .objid = ").append(HexDump.byteArrayToHex(_objectId)).append("\n");
    buffer.append("[/REF]\n");
    return buffer.toString();
}
}