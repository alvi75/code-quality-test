import java.util.*;

public class Translation765 {
    0;
i++) {
    String value = escaper.escape(pathElements[i].value);
    if (i == 0) {
        sb.append("/" + value);
    }
    else {
        sb.append("/\"" + value + "\"");
    }
}
return sb.toString();
}
}