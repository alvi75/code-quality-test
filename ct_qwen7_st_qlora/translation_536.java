import java.util.*;

public class Translation536 {
    public boolean contains(final int row, final int col) {
    if (_isSingleCell) {
        return _firstRow == row && _firstCol == col;
    }
    return _firstRow <= row && _lastRow >= row&& _firstCol <= col && _lastCol >= col;
}
}