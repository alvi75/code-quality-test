import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
        byte[] messageBytes = schema.writeDelimitedTo(buffer,message);
        out.write(messageBytes);
        return messageBytes.length;
    }
}