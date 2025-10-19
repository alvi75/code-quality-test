import java.util.*;

public class Generated_6367670b1a6d9265ec0179fe {
    @Override
  public void write(byte b[]) throws IOException {
    if (closed) {
      throw new IOException("Stream closed");
    }
    out.write(b);
  }
}