import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        //check if it's a packed field.
        int currentBit = bitStream.readerIndex() % 8;
        if (currentBit != 0) {
            //not byte aligned!
            Integer sym = integerToSymbol.get(1 << currentBit);
            HuffmanCode code = huffmanCodeMap.get(sym);
            readHuffmanCode(code);
        }
    }
}