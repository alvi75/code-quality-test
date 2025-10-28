import java.util.*;

public class Generated_636767511a6d9265ec017eb0 {
    public int nonZeros(int row) {
        int count = 0;
        for (int i = 0; i < this.rows.length; i++) {
            if (this.rows[i] == row)
                count += this.cols[i].nonZeros();
        }
        return count;
    }
}