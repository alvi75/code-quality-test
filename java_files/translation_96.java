import java.util.*;

public class Translation96 {
    0;
i++) {
    if (i != 0) {
        sb.Append(", ");
    }
    sb.Append(((ICharStream)InputStream).GetText(Interval.Of(i, i)));
}
sb.Append(')');
return sb.ToString();
}
}