import java.util.*;

public class Translation587 {
    public static int main(String[] args) {
    boolean printTree = false;
    String path = null;
    for (int i=0;
    i<args.length;
    i++) {
        if ("-printTree".equals(args[i])) {
            printTree = true;
        }
        else if ("-path".equals(args[i])) {
            path = args[++i];
        }
        else {
            throw new IllegalArgumentException("Unknown argument " + args[i]);
        }
    }
    if (args.length != (printTree ? 2 : 1)) {
        throw new IllegalArgumentException();
    }
    try (Directory dir = FSDirectory.open(new File(path))) {
        try (DirectoryTaxonomyReader r = new DirectoryTaxonomyReader(dir)) {
            printStats(r, System.out, printTree);
        }
    }
    return 0;
}
}