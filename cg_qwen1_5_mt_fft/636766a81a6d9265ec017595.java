import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    final ByteVector put11(final int byteValue1,final int byteValue2){
		if (this.currV == null) {this.currV = this.vec.get(this.currK++);if (this.currV == null)this.currV = new Vector(); }
		this.currV.add(new Integer(byteValue1));
		this.currV.add(new Integer(byteValue2));
		return this;
	}
}