import java.util.*;

public class Translation587 {
    ublic static int main(String[] args) {
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
    try (Directory directory = Files.newDirectoryStream(Paths.get(path))) {
        TaxonomyReader reader = new TaxonomyReader(directory);
        PrintStats(reader, System.out, printTree);
    }
    finally {
        directory.close();
    }
    return 0;
}
}