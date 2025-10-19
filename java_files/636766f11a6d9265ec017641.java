import java.util.*;

public class Generated_636766f11a6d9265ec017641 {
    /**Check the available space of this InputStream according to the index.**/
  @Override
  public int available() throws IOException {
    if (index < 0) {
      throw new IOException("Invalid index: " + index);
    }
    return Math.min(available(), index);
  }
}