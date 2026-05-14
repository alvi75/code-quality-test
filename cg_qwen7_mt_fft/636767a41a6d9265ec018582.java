import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    public static <T> int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer)
    throws IOException {
        if (buffer.start != null) throw new IllegalArgumentException("Cannot reuse buffers that start with a non-null value");
        // Allocate enough space for the object's total length.
        final int expectedLength = computeDelimitedSize(message,schema);
        buffer.grow(expectedLength);

        try {
            // Write the bytes directly from the buffer to avoid needless copies.
            DataOutputView dos = ByteBufferBackedDataOutputView.wrap(buffer.b(),0,expectedLength,false);
            writeTo(dos,message,schema);
            assert dos.position() == expectedLength;
            out.write(buffer.b(), 0, expectedLength);
            return expectedLength;
        } finally {
            resetBuffer(buffer);
        }
    }
}