import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    /**Check whether the existed buckets are the same as the buckets.**/
    public boolean isCompatible(DataTable dataset){
        if (dataset == null) {
            return false;
        }
        if (this.buckets.size() != dataset.buckets.size()) {
            return false;
        }
        for (int i = 0; i < this.buckets.size(); i++) {
            if (!this.buckets.get(i).isCompatible(dataset.buckets.get(i))) {
                return false;
            }
        }
        return true;
    }
}