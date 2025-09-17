import java.util.*;

public class Translationtranslation_587 {
    public static int main(String[] args) throws Exception {
        boolean printTree = false;
        String path = null;
        int taxoDim = -1;
        for (int i = 0;
        i < args.length;
        i++) {
            if (args[i].equals("-printTree")) {
                printTree = true;
            }
            else if (args[i].equals("-2D")) {
                taxoDim = 2;
            }
            else if (args[i].equals("-3D")) {
                taxoDim = 3;
            }
            else{
                path = args[i];
            }
        }
        if (args.length != (printTree ? 2 : 1)) {
            System.err.println("Usage: java TaxonomyReaderMain -printTree <taxonomy-dir>");
            System.exit(1);
        }
        DirectoryTaxonomyReader r = null;
        try {
            r = new DirectoryTaxonomyReader(FSDirectory.open(Paths.get(path)), taxoDim);
            TaxonomyWriter writer = new TaxonomyWriter(FSDirectory.open(Paths.get(path)), "en", true);
            writer.close();
        }
        finally {
            if (r != null) {
                r.close();
            }
        }
    }
}