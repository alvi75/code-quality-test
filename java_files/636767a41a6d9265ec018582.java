import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer)
    throws IOException {
        Protos.BufferWriter writer = new Protos.BufferWriter(out);
        Protos.Message msg = Protos.Message.newBuilder().setType(Protos.Message.Type.MESSAGE).setPayload(message).build();
        Protos.BufferWriterProto.writeDelimited(writer,msg);
        int size = writer.size();
        if(buffer != null){
            buffer.add(size,writer.buffer());
        }
        return size;
    }
}