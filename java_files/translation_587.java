import java.util.*;

public class Translation587 {
    public static int main(String[] args) throws Exception {
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
    TreeWalk tw = new TreeWalk(path);
    tw.setRecursive(false);
    tw.setFilterTreeFilter(PathFilterTreeFilter.create(path));
    tw.setListener(new TreeWalk.Listener() {
        @Override public void onPreVisit(TreeWalk walker, int treeId, int nChildNodes) {
            System.out.println("pre visit " + walker.getTree(treeId).getPathString());
        }
}