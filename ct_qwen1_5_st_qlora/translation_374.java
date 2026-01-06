import java.util.*;

public class Translation374 {
    public void clearConsumingCell(FormulaCellCacheEntry cce) {
    if (_consumingCells.remove(cce))return;
    throw new IllegalStateException("Specified formula cell is not consumed by this cell");
}
}