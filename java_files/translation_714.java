import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_714 {
    public ListDirectoryDirectories(RecordStream rs) {
        _super(rs);
        while (rs.peekNextSid() == HeaderFooterRecord.sid) {
            removeFirstDirectoryEntry();
        }
        if (!eof()) {
            final int nRemainingBytes = rs.getAvailable();
            if (nRemainingBytes > 0) {
                logger.log(POILogger.WARN, "Found " + nRemainingBytes+ " bytes in directory but no space left. Ignoring remaining data.");
            }
        }
}