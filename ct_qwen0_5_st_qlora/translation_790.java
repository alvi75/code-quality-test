import java.util.*;

public class Translation790 {
    public void freeBefore(int pos) {
    assert pos >= 0: "pos=" + pos;
    assert pos <= nextPos: "pos=" + pos;
    int newCount = nextPos - pos;
    assert newCount <= count: "newCount=" + newCount + " count=" + count;
    assert newCount <= buffer.length: "newCount=" + newCount + " buf.length=" + buffer.length;
    count = newCount;
}
}