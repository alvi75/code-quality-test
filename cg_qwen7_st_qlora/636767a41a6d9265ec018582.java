import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    public static <T>
    int writeDelimitedTo(OutputStream out,
                         T message,
                         Schema<T> schema,
                         LinkedBuffer buffer)
        throws IOException {
        if (buffer.start != 0 || buffer.offset > 0) {
            throw new IllegalStateException("Called with non-empty buffer");
        }
        // Write the length.
        final int start = buffer.offset;
        buffer = writeRawVarint32(buffer, computeMessageSizeNoTag(message,schema));
        // Write the message.
        writeTo(out,message,schema,buffer);
        // Write the length again.
        final byte[] bytes = buffer.buf;
        final int oldOffset = buffer.offset;
        buffer.offset = start;
        writeRawVarint32(buffer,oldOffset - start - 5);
        buffer.offset = oldOffset;
        return oldOffset;
    }
}