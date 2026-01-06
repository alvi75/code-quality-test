import java.util.*;

public class Translation639 {
    1 public long valueFor(double elapsed) {
    double val;
    if (modBy == 0)val = elapsed / factor;
    elseval = elapsed / factor % modBy;
    if (type == '0')return (long)Math.round(val);
    elsereturn (long)val;
}
}