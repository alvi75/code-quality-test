import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    /**Use ProtobufOutput and the LinkedBuffer to write the message into the given OutputStream out, and return the message size.**/
  public static <T>
      int writeDelimitedTo(OutputStream out,
                          T message,
                          Schema<T> schema,
                          LinkedBuffer buffer)
          throws IOException {
    if (buffer.start != buffer.pos) {
      throw new IllegalStateException("Cannot call writeDelimitedTo() after a non-empty buffer");
    }
    // Compute the message size without actually serializing it.
    int messageSize = computeRawMessageSize(message, schema);
    // Write the size of the message first.
    buffer = writeVarint32(out, messageSize, buffer);
    // Then write the message itself.
    return writeTo(out, message, schema, buffer);
  }
}