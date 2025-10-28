import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
        if (message == null)
            throw new NullPointerException("writeDelimitedTo called with a null message");
        int size = 0;
        try {
            ProtobufOutput output = new ProtobufOutput(out);
            size = schema.writeDelimitedTo(output,message,schema.getSchema());
            buffer.add(output.toByteArray());
        } catch (IOException e) {
            throw e;
        }
        return size;
    }
}