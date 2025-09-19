import java.util.*;

public class Translation551 {
    public boolean canAppend() {
    for (Head h : heads)if (h != LastHeadImpl.INSTANCE) return true;
    return false;
}
}