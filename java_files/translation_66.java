import java.util.*;

public class Translation66 {
    public MergeInfo(final ContentSource prior, final ContentSource current) {
    this.sourceFiles.addAll(current.getSourceFiles());
    if (!sourceFiles.isEmpty()) {
        final File dir = sourceFiles.last();
        if (dir != null && !dir.isEmpty())setSourceTreeIterator(new SourceTreeIterator(dir));
    }
}
}