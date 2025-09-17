import java.util.*;

public class Translationtranslation_755 {
    public boolean equals(final Object o) {
        if (!(o instanceof Property)) {
            return false;
        }
        final Property p = (Property) o;
        final int pId = p.getID();
        final byte[] pValue = p.getValue();
        final int ourId = id;
        p.equals(ourId,pValue.length == 0 ? null : Util.toHex(pValue));
        return p.getOptions() == getOptions() && p.getType() == getType()&& p.getValue().equals(getValue());
    }
}