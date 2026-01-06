import java.util.*;

public class Generated_636767a41a6d9265ec018582 {
    /**Use ProtobufOutput and the LinkedBuffer to write the message into the given OutputStream out, and return the message size.**/ 
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
        try {
            Protos.Message.Builder builder = Protos.Message.newBuilder();
            Protos.FieldDescriptor fieldDescriptor = schema.getFieldDescriptor();
            for (Field field : fieldDescriptor.getFields()) {
                Object value = field.get(message);
                if (value != null) {
                    builder.set(field.getName(), value);
                }
            }
            Protos.Message response = builder.build();

            Protos.Output output = Protos.Output.newBuilder().setOutputId(new OutputId());
            Protos.Buffer buffer = new Protos.Buffer();
            buffer.setLength(response.toByteArray().length);
            buffer.write(buffer);

            Protos.Buffer buffer2 = Protos.Buffer.newBuilder().setLength(buffer.getLength()).write(buffer).build();
            Protos.Buffer buffer3 = Protos.Buffer.newBuilder().setLength(buffer2.getLength()).write(buffer2).build();
            Protos.Buffer buffer4 = Protos.Buffer.newBuilder().setLength(buffer3.getLength()).write(buffer3).build();
            Protos.Buffer buffer5 = Protos.Buffer.newBuilder().setLength(buffer4.getLength()).write(buffer4).build();
            Protos.Buffer buffer6 = Protos.Buffer.newBuilder().setLength(buffer5.getLength()).write(buffer5).build();
            Protos.Buffer buffer7 = Protos.Buffer.newBuilder().setLength(buffer6.getLength()).write(buffer6).build();
            Protos.Buffer buffer8 = Protos.Buffer.newBuilder().setLength(buffer7.getLength()).write(buffer7).build();
            Protos.Buffer buffer9 = Protos.Buffer.newBuilder().setLength(buffer8.getLength()).write(buffer8).build();
            Protos.Buffer buffer10 = Protos.Buffer.newBuilder().setLength(buffer9.getLength()).write(buffer9).build();
            Protos.Buffer buffer11 = Protos.Buffer.newBuilder().setLength(buffer10.getLength()).write(buffer10).build();
            Protos.Buffer buffer12 = Protos.Buffer.newBuilder().setLength(buffer11.getLength()).write(buffer11).build();
            Protos.Buffer buffer13 = Protos.Buffer.newBuilder().setLength(buffer12.getLength()).write(buffer12).build();
            Protos.Buffer buffer14 = Protos.Buffer.newBuilder().setLength(buffer13.getLength()).write(buffer13).build();
            Protos.Buffer buffer15 = Protos.Buffer.newBuilder().
}