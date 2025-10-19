import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    public boolean isCompatible(DataTable dataset) {
        if (dataset.getColumns().size() != this.getColumns().size()) {
            return false;
        }

        for(int i = 0; i < getColumns().size(); i++) {
            Column<?> c1 = this.getColumns().get(i);
            Column<?> c2 = dataset.getColumns().get(i);

            if (!c1.getName().equals(c2.getName())) {
                return false;
            }
            if (!c1.getType().equals(c2.getType())) {
                return false;
            }
            if (!c1.isPrimaryKey() && !c2.isPrimaryKey()) {
                if (!c1.isNullable() || !c2.isNullable()) {
                    return false;
                }
            }
        }
        return true;
    }
}