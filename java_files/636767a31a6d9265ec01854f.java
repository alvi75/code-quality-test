import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        //check if the field is packed
        if (this.isPacked) {
            //read the field
            this.read();
            //update the internal state
            this.isPacked = false;
        }
    }
}