import java.util.*;

public class Translation814 {
    ublic ValueFiller getValueFiller() {
    return new ValueFiller() {
        @Override public void fillValues(List<BytesRef> values) {
            for (int i = 0;
            i < values.size();
            ++i) {
                values.set(i, new BytesRef(terms[i]));
            }
        }
    }
}
}