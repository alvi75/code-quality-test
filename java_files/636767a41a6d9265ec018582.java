import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
		if (message == null) {
			return 0;
		}
		int size = 0;
		try {
			// Write the length of the message.
			out.write(schema.getSerializedSize(message));
			// Write the message itself.
			buffer.write(message);
			size += schema.getSerializedSize(message);
		} finally {
			buffer.flush();
		}
		return size;
	}
}