import java.util.*;

public class Translation790 {
    public void freeBefore(int pos) {
    assert pos >= 0;
    assert pos <= nextPos;
    final int newCount = nextPos - pos;
    assert newCount <= count : "newCount="+newCount+" count="+count;
    assert newCount <= buffer.length: "newCount="+newCount+" buf.length="+buffer.length;
    count = newCount;
    pos = nextPos;
}
}