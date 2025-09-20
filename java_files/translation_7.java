import java.util.*;

public class Translation7 {
    public POIFSFileSystem() {
    headerBlock = new HeaderBlock(bigBlockSize);
    _propertyTable = new PropertyTable(headerBlock);
    _dataTable = new DataTable(headerBlock);
    _propertyTable.setProperty( PropertyIDMap.PID_DOCS, new IntProperty(PropertyIDMap.PID_DOCS_VALUE) );
    _propertyTable.setProperty( PropertyIDMap.PID_METAFILE, new BoolProperty( false ) );
    _root = _propertyTable.getRoot();
    _dataTable.setCellDateFormatted(true);
    _workbook = new HSSFWorkbook(_root);
}
}