import java.util.*;

public class Translation587 {
    ublic static int main(String[] args) throws IOException {
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
    DirectoryTaxonomyReader r = getTaxonomyReader(path);
    printStats(r, System.out, printTree);
    r.close();
    return 0;
}
}