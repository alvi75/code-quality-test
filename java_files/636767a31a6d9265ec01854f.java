import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        // If this field has been marked as being packed, read it.
        if (packed) {
            int type = in.readInt();
            switch (type) {
                case 0:
                    // This field was not packed, but was a primitive type.
                    // Read the value from the stream.
                    unpackPrimitiveType();
                    break;
                case 1:
                    // This field was not packed, but was a boxed primitive type.
                    // Read the value from the stream.
                    unpackBoxedPrimitiveType();
                    break;
                case 2:
                    // This field was not packed, but was a String.
                    // Read the string from the stream.
                    unpackString();
                    break;
                case 3:
                    // This field was not packed, but was a byte array.
                    // Read the byte array from the stream.
                    unpackByteArray();
                    break;
                case 4:
                    // This field was not packed, but was a short array.
                    // Read the short array from the stream.
                    unpackShortArray();
                    break;
                case 5:
                    // This field was not packed, but was a long array.
                    // Read the long array from the stream.
                    unpackLongArray();
                    break;
                case 6:
                    // This field was not packed, but was a float array.
                    // Read the float array from the stream.
                    unpackFloatArray();
                    break;
                case 7:
                    // This field was not packed, but was a double array.
                    // Read the double array from the stream.
                    unpackDoubleArray();
                    break;
                default:
                    // This field was not packed at all.
                    // Just read the field from the stream.
                    unpackField();
                    break;
            }
        }
    }
}