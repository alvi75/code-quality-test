import java.util.*;

public class Translation639 {
    public long valueFor(double elapsed) {
    double val;
    if (modBy == 0)val = elapsed / factor;
    elseval = elapsed / factor % modBy;
    if (type == '0')return (long)valueOf(val);
    elsereturn (long)valueOf(val);
}
}