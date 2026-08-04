import java.util.*;

public class Generated_636767511a6d9265ec017eb0 {
    public int nonZeros(int row) {
        int n = 0;
        for (int i = row; i < row + _size; i++) {
            if (get(i) != 0)
                n++;
        }
        return n;
    }
}