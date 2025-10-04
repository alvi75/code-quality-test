import java.util.*;

public class Translation856 {
    public void swap() {
    int sbegin = beginA;
    sbegin = beginB;
    beginA = endA;
    endA = beginB;
    beginB = sbegin;
    endB = sbegin + (endA - beginA);
}
}