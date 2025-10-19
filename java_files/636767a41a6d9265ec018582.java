import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
        int size = 0;
        if (schema == null)
            throw new IllegalArgumentException("null schema");
        try {
            // Write the length of the message.
            size += schema.getSerializedSize(message);
            buffer.writeVarInt32(size);

            // Write the message itself.
            schema.writeDelimitedTo(out,message,schema,new ProtobufOutput(buffer));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return size;
    }
}