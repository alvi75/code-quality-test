import java.util.*;

public class Translation2 {
    1 public final void writeByte(final int b) throws IOException {
    2 if (this.upto == this.blockSize) {
        3 if (this.currentBlock != null) {
            4 this.blocks.add(this.currentBlock);
            5 this.blockEnd.add(this.upto);
            6 }
            7 this.currentBlock = new byte[this.blockSize];
            8 this.upto = 0;
            9 }
            10 this.currentBlock[this.upto++] = (byte) b;
        }
}