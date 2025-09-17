import java.util.*;

public class Translationtranslation_684 {
    public static BufferSize automatic() {
        final long max;
        final long total;
        final long free;
        final FileDescriptor fd;
        try {
            max = fd.getFiles().length*FileDescriptor.DEFAULT_MAX_BYTES_FILE;
            total = fd.getFiles().length*FileDescriptor.DEFAULT_MAX_BYTES_OBJECT_REF;
            free = max - total + freeBlocks.size() * BlockFileDescriptor.BYTES;
            fd = fd.openFile();
            bufferSize = new BufferSize(max, total, free);
        }
        finally {
            IOUtils.close(fd);
        }
    }
}