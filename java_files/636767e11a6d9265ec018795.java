import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    public boolean isCompatible(DataTable dataset) {
        if (dataset == null || dataset.size() != this.size()) {
            return false;
        }
        for (int i = 0; i < this.size(); i++) {
            if (!this.get(i).isCompatible(dataset.get(i))) {
                return false;
            }
        }
        return true;
    }
}