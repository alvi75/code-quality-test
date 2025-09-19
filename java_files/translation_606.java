import java.util.*;

public class Translation606 {
    public void writeUnshared(Object object) throws IOException {
    writeObject(object);
    if (object instanceof SharedFormulaRecord) {
        SharedFormulaRecord sfr = (SharedFormulaRecord) object;
        int nConsumingCells = sfr.getNumberOfConsumingCells();
        for(int i=0;
        i<nConsumingCells;
        i++) {
            CellReference cr = sfr.getCellReferenceAt(i);
            _writeCache.notifyFormulaChanging(cr);
        }
    }
}
}