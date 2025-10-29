import java.util.*;

public class Generated_636767dd1a6d9265ec0186f3 {
    public void overrideName(String oldName, String newName) {
        for (int i = 0; i < _values.length; i++) {
            if (_values[i].name.equals(oldName)) {
                _values[i] = new ColumnValue(newName);
            }
        }
    }
}