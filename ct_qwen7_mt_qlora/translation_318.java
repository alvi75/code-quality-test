import java.util.*;

public class Translation318 {
    1 public synchronized long skip(final long charCount) throws IOException {
    2 if (charCount < 0) {
        3 throw new IllegalArgumentException("charCount < 0: " + charCount);
        4 }
        56 try {
            7 checkNotClosed();
            89 if (charCount == 0) {
                10 return 0;
                11 }
                12 int availableFromBuffer = buf.length - pos;
                1314 if (availableFromBuffer > 0) {
                    15 // we have some data left over in our buffer16 long requiredFromIn = charCount - availableFromBuffer;
                    1718 if (requiredFromIn <= 0) {
                        19 // we can satisfy this request with what's left in the buffer20 pos += (int) charCount;
                        21 return charCount;
                        22 }
                        else {
                            23 // we need to read more than is left in the buffer24 pos += availableFromBuffer;
                            25 return availableFromBuffer + in.skip(requiredFromIn);
                            26 }
                            27 }
                            else {
                                28 // no data left in the buffer29 return in.skip(charCount);
                                30 }
                                31 }
                                catch (IOException e) {
                                    32 close();
                                    33 throw e;
                                    34 }
                                    finally {
                                        35 markLimit = -1;
                                        36 markPos = -1;
                                        37 }
                                        38 }
}