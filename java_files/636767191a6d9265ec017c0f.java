import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    private void enlarge(final int size){
    if(size > this.data.length){
      final byte[] newdata = new byte[this.data.length * 2];
      System.arraycopy(this.data, 0, newdata, 0, this.data.length);
      this.data = newdata;
    }
  }
}