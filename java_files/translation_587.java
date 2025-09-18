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
    printStats(r, System.out, printTree);
}