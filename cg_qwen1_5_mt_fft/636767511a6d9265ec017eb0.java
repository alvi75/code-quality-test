import java.util.*;

public class Generated_636767511a6d9265ec017eb0 {
    public int nonZeros(int row) {
        if (row >= nRows || row < 0)
            throw new IllegalArgumentException("Specified row is out of range");
        int nz = 0;
        for (int col = 0; col < nCols; ++col)
            if (isNonZero(row, col))
                ++nz;
        return nz;
    }
}