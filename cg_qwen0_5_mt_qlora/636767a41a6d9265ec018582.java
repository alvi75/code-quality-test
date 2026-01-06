import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
        if (message == null) {
            throw new IllegalArgumentException("message must not be null");
        }
        if (schema == null) {
            throw new IllegalArgumentException("schema must not be null");
        }

        // Write the length of the message.
        int length = 0;
        try {
            // Write the length of the message.
            buffer.writeInt(message.size());
            // Write the message.
            buffer.write(message);
            // Get the current position in the buffer.
            int pos = buffer.position();
            // Write the length of the message again.
            buffer.writeInt(message.size());
            // Write the message again.
            buffer.write(message);
            // Get the current position in the buffer.
            length = buffer.position() - pos;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return length;
    }
}