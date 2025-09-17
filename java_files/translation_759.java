import java.util.*;

public class Translationtranslation_759 {
    public void close() throws IOException {
        if (isOpen && !isClone()) {
            try {
                channel.close();
            }
            finally {
                if (!isClone()) {
                    fis.close();
                }
            }
        }
}