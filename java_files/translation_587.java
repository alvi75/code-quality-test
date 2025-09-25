import java.util.*;

public class Translation587 {
    public static void main(String[] args) {
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
        System.err.println("Usage: java -cp " + Taxonomy.class.getPackage().getName() + " Taxonomy PrintStats [path]");
        return 1;
    }
    try (Directory directory = Directory.open(new File(path))) {
        TaxonomyReader reader = new DirectoryTaxonomyReader(directory);
        PrintStats(reader, System.out, printTree);
    }
    catch (IOException e) {
        e.printStackTrace(System.err);
    }
}
}