import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
        ProtobufOutput output = new ProtobufOutput(out);
        int size = writeDelimitedTo(output,message,schema,buffer);
        output.flush();
        return size;
    }
}