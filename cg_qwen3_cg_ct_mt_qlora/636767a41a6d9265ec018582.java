import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
        if (message == null) throw new NullPointerException("message");
        if (schema == null) throw new NullPointerException("schema");
        if (buffer == null) throw new NullPointerException("buffer");

        // Write the message.
        int size = schema.writeDelimitedTo(out,message);
        return size;
    }
}