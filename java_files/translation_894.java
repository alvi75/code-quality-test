import java.util.*;

public class Translationtranslation_894 {
    public void clearFormatting() {
        if (cfHeaders.isEmpty()) {
            return;
        }
        HSSFWorkbook wb = _workbook.getStubWorkbook();
        for (CFRecordsAggregate cfraClone : cfHeaders) {
            wb.removeConditionalFormatting(cfraClone.getHeader());
        }
        cfHeaders.clear();
    }
}