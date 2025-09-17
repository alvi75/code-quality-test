import java.util.*;

public class Translationtranslation_841 {
    public String toString() {
        StringBuilder buffer = new StringBuilder("[Array Formula or Shared Formula]\n");
        buffer.append(" .range = ").append(getRange()).append("\n");
        buffer.append(" .nSheets = ").append(field_2_number_of_sheets).append("\n");
        for (int i = 0;
        i < field_3_sheet_names.length;
        i++) {
            String sheetname = field_3_sheet_names[i];
            if (sheetname == null) {
                continue;
            }
            buffer.append(" .sheetname").append(i).append(" = ").append(sheetname).append("\n");
        }
        buffer.append("[/Array Formula or Shared Formula]\n");
        return buffer.toString();
    }
}