import java.util.*;

public class Translationtranslation_790 {
    public final void freeBefore(int pos) {
        assert pos >= 0;
        assert pos <= nextPos;
        final int newCount = nextPos - pos;
        assert newCount <= count : "newCount="+newCount+" vs count="+count;
        assert newCount <= buffer.length:"newCount="+newCount+" vs buffer.length="+buffer.length;
        count = newCount;
        pos = nextPos;
    }
}