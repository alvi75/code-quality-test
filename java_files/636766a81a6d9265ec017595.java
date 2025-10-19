import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    final ByteVector put11(final int byteValue1,final int byteValue2){
    final ByteVector v = this;
    if(v.size() < 2) {
      v.resize(2);
    }
    v.setByte(0,byteValue1);
    v.setByte(1,byteValue2);
    return v;
  }
}