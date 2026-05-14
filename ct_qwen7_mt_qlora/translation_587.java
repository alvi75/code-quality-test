import java.util.*;

public class Translation587 {
    1 public static void main(String[] args) {
    2 boolean printTree = false;
    3 String path = null;
    4 for (int i = 0;
    i < args.length;
    i++) {
        5 if ("-printTree".equals(args[i])) {
            6 printTree = true;
            7 }
            else {
                8 path = args[i];
                9 }
                10 }
                11 if (args.length != (printTree ? 2 : 1)) {
                    12 throw new IllegalArgumentException();
                    13 }
                    14 try {
                        15 Directory dir = FSDirectory.open(Paths.get(path));
                        16 try {
                            17 DirectoryTaxonomyReader r = new DirectoryTaxonomyReader(dir);
                            18 try {
                                19 printStats(r, System.out, printTree);
                                20 }
                                finally {
                                    21 r.close();
                                    22 }
                                    23 }
                                    finally {
                                        24 dir.close();
                                        25 }
                                        26 }
                                        catch (IOException e) {
                                            27 e.printStackTrace(System.err);
                                            28 }
                                            System.exit(0);
                                        }
}