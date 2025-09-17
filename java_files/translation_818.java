import java.util.*;

public class Translationtranslation_818 {
    public void preSerialize() {
        if (records.get( records.getTabpos() ) instanceof TabIdRecord) {
            return;
        }
        int count = boundsheets.size();
        short[] tabids = new short[count];
        for (int i=0;
        i<count;
        i++) {
            SheetRange srange = boundsheets.get(i);
            if (srange.isExternalReferences()) {
                throw new RuntimeException("Can't serialize tabids for external references");
            }
            else if (srange.isInternalReferences()) {
                tabids[i] = (short)srange.getFirstSheetNumber();
            }
            else {
                throw new RuntimeException("Invalid sheet range " + srange);
            }
            if (i>0) {
                buffer.append(", ");
            }
            buffer.append("tabid=").append(HexDump.shortToHex(tabids[i]));
        }
        buffer.append("]");
    }
    }
}