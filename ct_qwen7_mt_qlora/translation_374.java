import java.util.*;

public class Translation374 {
    1 public void clearConsumingCell(FormulaCellCacheEntry cce) {
    2 if (!_consumingCells.remove(cce))3 throw new IllegalStateException("Specified formula cell is not consumed by this cell");
}
}