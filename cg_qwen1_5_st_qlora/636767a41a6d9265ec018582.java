import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer)
      throws IOException {
    if (buffer == null) {
      throw new NullPointerException("buffer");
    }
    if (schema == null) {
      throw new NullPointerException("schema");
    }

    // Write the message header.
    int size = schema.size(message);
    byte[] bytes = new byte[size];
    schema.encode(message,bytes,0);

    // Write the message body.
    int length = buffer.write(bytes,0,size);

    // Write the message footer.
    out.write(buffer.getBuffer(),length,4);
    out.flush();
    return size;
  }
}