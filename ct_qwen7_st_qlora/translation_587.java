import java.util.*;

public class Translation587 {
    public static void main(String[] args) throws Exception {
    boolean printTree = false;
    String path = null;
    for(int i=0;
    i<args.length;
    i++) {
        if ("-printTree".equals(args[i])) {
            printTree = true;
        }
        else if (null == path) {
            path = args[i];
        }
        else {
            throw new IllegalArgumentException("Unknown parameters: " + Arrays.toString(Arrays.copyOfRange(args,i,args.length)));
        }
    }
    if (null == path) throw new IllegalArgumentException("Missing directory parameter");
    Directory dir = FSDirectory.open(Paths.get(path));
    try (DirectoryReader reader = DirectoryReader.open(dir);
    IndexSearcher searcher = new IndexSearcher(reader);
    DirectoryReader taxoReader = DirectoryReader.open(FSDirectory.open(Paths.get(path + "_taxo")))) {
        if (printTree) {
            printTaxonomy(taxoReader);
        }
        else {
            printStats(searcher);
        }
    }
}
catch (IOException e) {
    throw new RuntimeException(e);
}
}