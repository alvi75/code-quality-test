import java.util.*;

public class Translationtranslation_7 {
    public POIFSFileSystem() {
        headerBlock = new HeaderBlock(bigBlockSize);
        _propertyTable = new PropertyTable(headerBlock);
        _dataTable = new DataTable(null, headerBlock.getNumberOfSheets());
        _externSheetRecord = new ExternSheetRecord();
    }
}