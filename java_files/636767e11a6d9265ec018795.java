import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    public boolean isCompatible(DataTable dataset){
        if (dataset == null) {
            return false;
        }
        if (!this.name.equals(dataset.name)) {
            return false;
        }

        // Check the number of columns.
        if (this.numColumns != dataset.numColumns()) {
            return false;
        }

        // Check the column names.
        for (String colName : this.columnNames) {
            if (!dataset.colNames.contains(colName)) {
                return false;
            }
        }

        // Check the data types.
        for (int i = 0; i < numBuckets(); ++i) {
            String bucketKey = key(i);
            if (!isCompatible(bucketKey, dataset.key())) {
                return false;
            }
        }

        return true;
    }
}