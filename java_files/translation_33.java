import java.util.*;

public class Translationtranslation_33 {
    public void addMultipleBlanks(MulBlankRecord mbr) {
        for(int k = 0;
        k < mbr.getNumColumns();
        k++) {
            BlankRecord br = new BlankRecord();
            br.setColumn((short)(k + mbr.getFirstColumn()));
            br.setRow(mbr.getRow());
            if (mbr.getXFAt(k) != null) {
                br.setXFIndex(mbr.getXFAt(k));
            }
            addCell(br);
        }
    }
    }
}