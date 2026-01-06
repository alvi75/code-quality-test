import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
        try (CodedOutputStream output = CodedOutputStream.newInstance(out,buffer)) {
            writeDelimitedTo(output,message,schema);
            return buffer.size;
        }
    }
}