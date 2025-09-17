import java.util.*;

public class Translationtranslation_814 {
    public ValueFiller getValueFiller() {
        return new ValueFiller() {
            private final MutableValueBool mval = new MutableValueBoolean();
            @Override @Override public void fillSlice(ValueSource vs, int fromIndex, int toIndex) {
                for (int i = fromIndex;
                i < toIndex;
                i++) {
                    MutableValueBool mval = new MutableValueBoolean();
                    if (vs.isEqual(i, _predicate)) {
                        mval.set(true);
                    }
                    else {
                        mval.set(false);
                    }
                    fillSlice(mvals, 0, mval.size(), mval.toArray(new MutableValueBool[0]));
                }
}