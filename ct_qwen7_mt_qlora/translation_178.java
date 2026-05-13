import java.util.*;

public class Translation178 {
    1 public void close() throws IOException {
    2 if (isOpen) {
        3 isOpen = false;
        4 try {
            5 dump();
            6 }
            finally {
                7 try {
                    8 channel.truncate(fileLength);
                    9 }
                    finally {
                        10 try {
                            11 channel.close();
                            12 }
                            finally {
                                13 fos.close();
                                14 }
                                15 }
                                16 }
                                17 }
                            }
}