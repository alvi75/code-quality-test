import java.util.*;

public class Translation587 {
    public static int main(String[] args) throws IOException {
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
    try (Directory dir = FSDirectory.open(Paths.get(path))) {
        try (DirectoryTaxonomyReader r = new DirectoryTaxonomyReader(dir)) {
            printStats(r, System.out, printTree);
        }
    }
}
return 0;
}
}