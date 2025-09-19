import java.util.*;

public class Translation374 {
    ublic void clearConsumingCell(FormulaCellCacheEntry cce) {
    if (_consumingCells.remove(cce)) {
        cce.setNumConsumers(cce.getNumConsumers()-1);
    }
}
}