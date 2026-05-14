import java.util.*;

public class Translation639 {
    public final long valueFor( double elapsed ) {
    final double val;
    if (modBy==0) {
        val=elapsed/factor;
    }
    else {
        val=(elapsed/factor)%modBy;
    }
    switch(type) {
        case '0': return Math.round(val);
        case '1': default: return (long)val;
    }
}
}