import java.util.*;

public class Translation550 {
    ublic String toString() {
    return "spans(" + term.toString() + ")@" + (doc==-1?"START":(doc==Integer.MAX_VALUE?"END":doc+ "-" + position));
}
}