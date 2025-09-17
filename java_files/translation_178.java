import java.util.*;

public class Translationtranslation_178 {
    public void close() throws IOException {
        if (isOpen) {
            isOpen = false;
            try {
                flush();
            }
            finally {
                try {
                    channel.truncate(fileLength);
                }
                finally {
                    try {
                        channel.close();
                    }
                    finally {
                        fos.close();
                    }
                }
            }
        }
    }
}