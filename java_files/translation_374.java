import java.util.*;

public class Translation374 {
    ublic void clearConsumingCell(FormulaCellCacheEntry cce) {
    if (!consumedCells.remove(cce)) {
        throw new IllegalStateException("Specified formula cell is not consumed by this cell");
    }
}
}