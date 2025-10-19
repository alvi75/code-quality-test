import java.util.*;

public class Generated_6367670b1a6d9265ec0179fe {
    /**Write the given byte array b into the output stream that this class represents.**/
  @Override
  public void write(byte b[]) throws IOException {
    if (b == null) {
      throw new NullPointerException();
    }
    if (b.length == 0) {
      return;
    }
    int len = b.length;
    if (len > 0 && b[len - 1] < 0) {
      // If the last byte is negative, it's a sign of a negative number.
      // We need to convert it to positive before writing it out.
      b[len - 1] += 256;
    }
    if (len > 1 && b[len - 2] >= 0) {
      // If the second-to-last byte is positive, we can just write it out.
      // Otherwise, we need to convert it to negative.
      b[len - 2] -= 256;
    }
    if (len > 2 && b[len - 3] >= 0) {
      // If the third-to-last byte is positive, we can just write it out.
      // Otherwise, we need to convert it to negative.
      b[len - 3] -= 256;
    }
    if (len > 4 && b[len - 4] >= 0) {
      // If the fourth-to-last byte is positive, we can just write it out.
      // Otherwise, we need to convert it to negative.
      b[len - 4] -= 256;
    }
    if (len > 8 && b[len - 8] >= 0) {
      // If the fifth-to-last byte is positive, we can just write it out.
      // Otherwise, we need to convert it to negative.
      b[len - 8] -= 256;
    }
    if (len > 16 && b[len - 16] >= 0) {
      // If the sixth-to-last byte is positive, we can just write it out.
      // Otherwise, we need to convert it to negative.
      b[len - 16] -= 256;
    }
    if (len > 32 && b[len - 32] >= 0) {
      // If the seventh-to-last byte is positive, we can just write it out.
      // Otherwise, we need to convert it to negative.
      b[len -
}