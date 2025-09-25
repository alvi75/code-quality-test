import java.util.*;

public class Translation587 {
    public static void main(String[] args) throws IOException {
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
    if (args.length != (printTree ? 3 : 2)) {
        System.err.println("Usage: java Lucene.Net.Util.Automaton.CompiledAutomatonWriter -printTree <dir> <file>");
        System.exit(1);
    }
    try (Directory dir = FSDirectory.open(Paths.get(args[0], args[1]))) {
        try (InputStream stream = dir.openInput(args[2])) {
            CompiledAutomaton compiledAutomaton = read(stream);
            PrintStream out = System.out;
            if (printTree) {
                out.println(compiledAutomaton.ToTree());
            }
            else {
                compiledAutomaton.Write(out);
            }
        }
    }
    catch (EOFException e) {
        System.err.println("No data found.");
    }
}
}