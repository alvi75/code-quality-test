import java.util.*;

public class Translationtranslation_867 {
    public ShortBuffer put(short[] src, int srcOffset, int shortCount) {
        byteBuffer.limit(limit * SizeOf.SHORT);
        byteBuffer.position(position * SizeOf.SHORT);
        if (byteBuffer instanceof ReadWriteDirectByteBuffer) {
            ((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, shortCount);
        }
        src, srcOffset, shortCount);
    }
    else {
        ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, shortCount);
    }
    src, srcOffset, shortCount);
    }
    src, srcOffset, shortCount);
    }
    src, srcOffset, shortCount);
    }
    src, srcOffset, shortCount;
    }
    this.position += shortCount;
    return this;
    }
}