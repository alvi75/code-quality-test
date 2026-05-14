import java.util.*;

public class Generated_636766f11a6d9265ec01764f {
    public Collection<Object> values() {
        List<Object> valueList = new ArrayList<Object>();
        for (Object key : this.keySet()) {
            if (!this.containsKey(key)) {
                continue;
            }
            Object itemValue = this.get(key);
            if (itemValue == null) {
                continue;
            }
            valueList.add(itemValue);
        }
        return Collections.unmodifiableCollection(valueList);
    }
}