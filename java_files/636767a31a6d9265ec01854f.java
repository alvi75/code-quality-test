import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        if (packedFlag == 0) {
            return;
        }
        int bitSize = 1 << packedBitNumber;
        int readBits = 0;
        for (int i = 0; i < packedBitNumber; i++) {
            readBits |= getBit(readBits, i);
        }
        switch (packedType) {
            case INT:
                value = readBits & Integer.MAX_VALUE;
                break;
            case SHORT:
                value = (short) readBits;
                break;
            default:
                throw new IllegalStateException("Unknown type");
        }
    }
}