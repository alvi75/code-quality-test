import java.util.*;

public class Translation2 {
    ublic void writeByte(int b) {
    if (outerInstance.upTo == outerInstance.blockSize) {
        if (outerInstance.currentBlock != null) {
            outerInstance.blocks.add(outerInstance.currentBlock);
            outerInstance.blockEnd.add(outerInstance.upto);
        }
        outerInstance.currentBlock = new byte[outerInstance.blockSize];
        outerInstance.upto = 0;
    }
    outerInstance.currentBlock[outerInstance.upto++] = (byte) b;
}
}