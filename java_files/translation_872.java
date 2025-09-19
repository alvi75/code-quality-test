import java.util.*;

public class Translation872 {
    ublic Status(IndexDiff diff) {
    super();
    this.diff = diff;
    final List<IndexDiff.Entry> entries = new ArrayList<>();
    for (File f : diff.getFiles()) {
        entries.add(new IndexDiff.Entry(f, null, -1));
    }
    walk = new FileTreeIterator(entries);
}
}