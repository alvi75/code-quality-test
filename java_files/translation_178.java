import java.util.*;

public class Translation178 {
    107 public void close() throws IOException {
    if (isOpen) {
        isOpen = false;
        try {
            dump();
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