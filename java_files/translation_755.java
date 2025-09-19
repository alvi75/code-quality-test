import java.util.*;

public class Translation755 {
    public boolean equals(final Object o) {
    if (!(o instanceof Property)) {
        return false;
    }
    final Property p = (Property) o;
    final int pId = p.getID();
    final int id = getID();
    return id == pId|| (id != 0 && id == p.getSID());
}
else {
    return _value.equals(p._value);
}
}
}
}