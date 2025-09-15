import java.util.*;

public class Translationtranslation_587 {
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
            usage();
            System.exit(1);
        }
        final Directory dir = FSDirectory.open(Paths.get(path));
        final TaxonomyReader r = new DirectoryTaxonomyReader(dir);
        final PrintStream out = new PrintStream(System.out);
        r.printStats(out, printTree);
        out.close();
        r.decRef();
        if (!refCount.isZero()) {
            throw new IllegalStateException("TaxonomyReader instances remain active: " + refCount);
        }
    }
}