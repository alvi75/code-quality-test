import java.util.*;

public class Translation587 {
    public static void main(String[] args) throws Exception {
    boolean printTree = false;
    String path = null;
    for (int i = 0;
    i < args.length;
    i++) {
        if (args[i].equals("-printTree")) {
            printTree = true;
        }
        else {
            path = args[i];
        }
    }
    if (args.length != (printTree ? 2 : 1)) {
        throw new IllegalArgumentException();
    }
    Directory dir = FSDirectory.open(new Path(path));
    TaxoReader reader = new TaxoReader(dir);
    PrintStats(reader, System.out, printTree);
}
}