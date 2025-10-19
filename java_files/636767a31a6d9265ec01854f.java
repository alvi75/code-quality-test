import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        //check if this field is a packed one.
        if (this.currentFieldDef.isPacked()) {
            int tag = read();
            if (tag != WritableUtils.READ_HEADER) {
                throw new IOException("Wrong header in packed field");
            }
            int length = readRawVarint32();
            this.packedLength += 4 + VarintUtils.varintSize(length);
            this.packedCount++;
            this.currentFieldPos = 0;
        }
    }
}