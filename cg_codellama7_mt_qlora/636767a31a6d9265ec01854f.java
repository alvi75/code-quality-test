import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    public void checkIfPackedField() throws IOException {
    if (isPackedField) {
      if (packedFieldSize == 0) {
        throw new IOException("Packed field size is 0");
      }
      if (packedFieldSize == 1) {
        packedFieldSize = in.readVInt();
      }
      if (packedFieldSize == 0) {
        throw new IOException("Packed field size is 0");
      }
      if (packedFieldSize < 0) {
        throw new IOException("Packed field size is negative");
      }
      if (packedFieldSize > maxDoc) {
        throw new IOException("Packed field size is larger than maxDoc");
      }
      if (packedFieldSize > Integer.MAX_VALUE) {
        throw new IOException("Packed field size is larger than Integer.MAX_VALUE");
      }
      if (packedFieldSize > currentFieldSize) {
        throw new IOException("Packed field size is larger than current field size");
      }
      if (packedFieldSize > currentFieldSize) {
        throw new IOException("Packed field size is larger than current field size");
      }
      if (packedFieldSize > currentFieldSize) {
        throw new IOException("Packed field size is larger than current field size");
      }
      if (packedFieldSize > currentFieldSize) {
        throw new IOException("Packed field size is larger than current field size");
      }
      if (packedFieldSize > currentFieldSize) {
        throw new IOException("Packed field size is larger than current field size");
      }
      if (packedFieldSize > currentFieldSize) {
        throw new IOException("Packed field size is larger than current field size");
      }
      if (packedFieldSize > currentFieldSize) {
        throw new IOException("Packed field size is larger than current field size");
      }
      if (packedFieldSize > currentFieldSize) {
        throw new IOException("Packed field size is larger than current field size");
      }
      if (packedFieldSize > currentFieldSize) {
        throw new IOException("Packed field size is larger than current field size");
}