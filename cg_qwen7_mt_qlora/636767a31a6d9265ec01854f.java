import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        //check if it's a packed field.
        if (isPacked()) {
            //read the packed field.
            int packed = in.read();
            if (packed == -1) {
                throw new EOFException("Unexpected end of file while reading packed field.");
            }
            //update the internal state.
            this.packed = true;
            this.packedValue = packed;
        } else {
            this.packed = false;
        }
    }
}