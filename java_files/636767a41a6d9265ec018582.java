import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    /**Use ProtobufOutput and the LinkedBuffer to write the message into the given OutputStream out, and return the message size.**/
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
        ProtobufOutput protout = new ProtobufOutput(out);
        int size = 0;
        try {
            if (schema != null) {
                protout.writeDelimited(schema,message);
            } else {
                protout.writeDelimited(message);
            }
            size = protout.size();
        } finally {
            protout.close();
        }
        return size;
    }
}