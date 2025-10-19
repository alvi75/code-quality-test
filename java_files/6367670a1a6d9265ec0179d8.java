import java.util.*;

public class Generated_6367670a1a6d9265ec0179d8 {
    @Override
  public void write(final byte[] b) throws IOException {
    if (this.buffer.position() + b.length > this.buffer.capacity()) {
      throw new BufferOverflowException();
    }
    for (final byte aB : b) {
      this.buffer.put(aB);
    }
  }
}