import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    /**Check if the field should be packed,if so,read the field and update the internal state. It will throw an exception when the process of reading is wrong.**/
    private void checkIfPackedField() throws IOException {
        if (packedFields.size() == 0) {
            return;
        }
        FieldInfo fi = packedFields.get(0);
        int offset = fi.offset;
        int length = fi.length;
        byte[] data = new byte[length];
        try {
            this.input.readFully(data);
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            throw new IOException("Error while reading packed field " + fi.name + " at offset " + offset, e);
        }

        //check if the field is packed
        if (data[0] != 0) {
            throw new IOException("The field " + fi.name + " at offset " + offset + " is not packed");
        }

        //update the internal state
        packedFields.remove(0);
        packedFields.add(new FieldInfo(fi.name, fi.type, offset, length));
    }
}