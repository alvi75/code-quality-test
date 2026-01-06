import java.util.*;

public class Translation374 {
    public void clearConsumingCell(FormulaCellCacheEntry cce) {
    if (!consumingCells.remove(cce)) {
        throw new IllegalStateException("Specified formula cell is not consumed by this cell");
    }
}
}