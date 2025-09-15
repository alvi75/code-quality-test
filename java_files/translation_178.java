import java.util.*;

public class Translationtranslation_178 {
    public void close() throws IOException {
        if (isOpen) {
            isOpen = false;
            try {
                dump();
            }
            finally {
                try {
                    channel.close();
                }
                finally {
                    try {
                        fis.close();
                    }
                    finally {
                        if (out != null) {
                            out.close();
                        }
                        else if (in != null) {
                            in.close();
                        }
                    }
                }
            }
        }
}