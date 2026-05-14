import java.util.*;

public class Translation33 {
    1 public void addMultipleBlanks(MulBlankRecord mbr) {
    2 for (int j = 0;
    j < mbr.getNumColumns();
    j++) {
        3 BlankRecord br = new BlankRecord();
        4 br.setColumn(j + mbr.getFirstColumn());
        5 br.setRow(mbr.getRow());
        6 br.setXFIndex(mbr.getXFAt(j));
        7 insertCell(br);
        8 }
    }
}