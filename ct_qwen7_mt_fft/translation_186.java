import java.util.*;

public class Translation186 {
    public void traverse(CellHandler handler) {
    final int firstRow=_range.getFirstRow();
    final int lastRow=_range.getLastRow();
    final int firstCol=_range.getFirstColumn();
    final int lastCol=_range.getLastColumn();
    final int width=lastCol-firstCol+1;
    CellWalkContext ctx=new CellWalkContext();
    _sheet.getRow(firstRow).iterator().next();
    // skip dummy cell at A1 for( int rowIx=firstRow;
    rowIx<=lastRow;
    rowIx++ ){
        Iterator<Cell> colIter=_sheet.getRow(rowIx).cellIterator();
        while( !colIter.hasNext() ) {
            rowIx++;
            colIter=_sheet.getRow(rowIx).cellIterator();
        }
        for( ;
        colIter.hasNext();
        ){
            Cell c=colIter.next();
            if(c==null || isEmpty(c)) {
                continue;
            }
            ctx.set(rowIx, c.getSheet(), c.getColumnIndex());
            handler.onCell(c, ctx);
        }
    }
}