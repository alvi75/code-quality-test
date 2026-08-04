import java.util.*;

public class Translation814 {
    public ValueFiller getValueFiller() {
    return new ValueFiller() {
        public void fillValue(int doc, BytesRefBuilder spare) {
            spare.copyChars(value);
        }
    }
    ;
}
}