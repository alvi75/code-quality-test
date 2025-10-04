import java.util.*;

public class Translation374 {
    public final void clearConsumingCell(FormulaCellCacheEntry cce) {
    if (!_consumingCells.remove(cce)) {
        throw new IllegalStateException("cell " + cce + " was not consuming cell " + this);
    }
}
}