import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        if (isPacked) {
            int packedSize = in.readUnsignedByte();
            if (packedSize == 0) {
                //the field is not packed.
                return;
            }
            byte[] packedBytes = new byte[packedSize];
            in.readFully(packedBytes);
            try {
                Object unpackedObject = Unpacker.unpack(packedBytes, this);
                if (!unpackedObject.getClass().equals(type)) {
                    throw new IOException("The type of unpacked object is not same as the declared type.");
                } else {
                    value = unpackedObject;
                }
            } catch (Exception e) {
                throw new IOException(e.getMessage());
            }
        }
    }
}