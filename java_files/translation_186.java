import java.util.*;

public class Translation186 {
    0;
i < width;
++i) {
    currentCell = currentRow.getCell(i);
    if (currentCell == null) {
        continue;
    }
    if (isEmpty(currentCell) && !traverseEmptyCells) {
        continue;
    }
    ctx.ordinalNumber = (ctx.rowNumber - firstRow) * width + (i - firstColumn + 1);
    handler.onCell(currentCell, ctx);
}
}
}