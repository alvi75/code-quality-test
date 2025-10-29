import java.util.*;

public class Translation186 {
    public void traverse(CellHandler handler ) {
    int firstRow = range . getFirstRow ( ) ;
    int lastRow = range . getLastRow ( ) ;
    int firstColumn = range . getFirstColumn ( ) ;
    int lastColumn = range . getLastColumn ( ) ;
    int width = lastColumn - firstColumn + 1 ;
    RowWalkContext ctx = new RowWalkContext ( ) ;
    Row currentRow = sheet . getRow ( ctx . rowNumber ) ;
    if ( currentRow == null ) {
        return ;
    }
    for ( int col = firstColumn ;
    col <= lastColumn ;
    col ++ ) {
        Cell cell = currentRow . getCell ( col ) ;
        if ( isEmpty ( cell ) && ! traverseEmptyCells ) {
            continue ;
        }
        ctx . ordinalNumber = ( ctx . rowNumber - firstRow ) * width + ( col - firstColumn + 1 ) ;
        handler . onCell ( cell , ctx ) ;
    }
}
}