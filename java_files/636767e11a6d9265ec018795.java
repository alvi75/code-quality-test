import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    /**Check whether the existed buckets are the same as the buckets.**/
    public boolean isCompatible(DataTable dataset){
        if (dataset == null) {
            return false;
        }
        int size = dataset.getRowCount();
        if (size != this.rows.length) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!this.rows[i].equals(dataset.getRow(i))) {
                return false;
            }
        }
        return true;
    }
}