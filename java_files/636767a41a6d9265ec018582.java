import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer)
    throws IOException {
    if (message == null) {
      throw new NullPointerException("message");
    }
    if (schema == null) {
      throw new NullPointerException("schema");
    }
    if (buffer == null) {
      throw new NullPointerException("buffer");
    }
    int size = 0;
    try {
      // Write the length of the message.
      byte[] lengthBytes = ByteBuffer.allocate(4).putInt(schema.getMessageSize()).array();
      out.write(lengthBytes);
      size += lengthBytes.length;

      // Write the message type.
      byte[] messageTypeBytes = ByteBuffer.allocate(1).put((byte) MessageTypes.DELIMITED_MESSAGE_TYPE).array();
      out.write(messageTypeBytes);
      size += messageTypeBytes.length;

      // Write the message ID.
      byte[] messageIDBytes = ByteBuffer.allocate(4).putInt(message.getId()).array();
      out.write(messageIDBytes);
      size += messageIDBytes.length;

      // Write the message data.
      byte[] messageDataBytes = ByteBuffer.allocate(buffer.capacity()).order(ByteOrder.LITTLE_ENDIAN).put(message.getData()).array();
      out.write(messageDataBytes);
      size += messageDataBytes.length;
    } finally {
      buffer.clear();
    }
    return size;
  }
}