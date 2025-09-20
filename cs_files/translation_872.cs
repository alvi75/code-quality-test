using System;
using System.Collections.Generic;

public class Translation872
{
    public Status(IndexDiff diff){
    base(diff.Directory);
    this.diff = diff;
    hasUncommittedChanges = !diff.GetAdded().Count == 0 || !diff.GetChanged().Count == 0 || !diff.GetRemoved().Count == 0|| !diff.GetMissing().Count == 0;
    this.commit = null;
    this.workingTree = new File(diff.WorkingTree, IndexFileNames.SEGMENTS);
    this.index = new File(diff.IndexDirectory, IndexFileNames.SEGMENTS);
    this.meta = new File(diff.Directory, Constants.OBJECTS + IndexFileNames.SEGMENTS);
    this.pending = new PendingDelete(this.diff.GetDeltaCompress(), this.diff.GetMaxMergeSize(), this.diff.GetMaxMergeThreadCount());
}
}