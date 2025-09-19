import java.util.*;

public class Translation374 {
    public void clearConsumingCell(FormulaCellCacheEntry cce) {
    if(!_consumingCells.contains(cce)) {
        throw new IllegalStateException("cell "+cce+" was not previously added");
    }
    _consumingCells.remove(cce);
}
}