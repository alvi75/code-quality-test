import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
    final int start = buffer.written();
    //write a 0-length message as -1
    if(message == null){
      buffer.putInt(-1);
      return buffer.written() - start;
    }
    final LinkedBuffer localBuffer = buffer;
    ProtobufOutput output = new ProtobufOutput(){
      @Override
      public LinkedBuffer getBuffer() {
        return localBuffer;
      }

      @Override
      public void resetBuffer() {
        throw new UnsupportedOperationException("This is not supported for this class");
      }
    };
    schema.writeTo(output,message);
    int len = buffer.written() - start;
    //write the length back
    buffer.writeInt(buffer.written()-4);
    buffer.flip();
    //write the whole thing to the stream
    out.write(buffer.array(),start,len);
    return len;
  }
}