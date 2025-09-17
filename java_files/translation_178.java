import java.util.*;

public class Translationtranslation_178 {
    public void close() throws IOException {
        if (isOpen) {
            try {
                flush();
            }
            finally {
                if (!isClosed()) {
                    try {
                        channel.close();
                    }
                    finally {
                        if (!isClosed()) {
                            setError();
                        }
                    }
                }
            }
}