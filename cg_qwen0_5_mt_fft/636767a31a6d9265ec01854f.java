import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        //check if the field is packed
        int pos = 0;
        while (pos < this.fieldSize) {
            byte b = readByte();
            if ((b & 0x80) != 0) {
                return; //field is not packed
            }
            pos++;
        }
    }
}