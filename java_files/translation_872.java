public Status(IndexDiff diff) {
    super(diff.getDirectory(), diff.getEntryReader(), diff.getEntryHasher());
    this.diff = diff;
    this.commit = null;
    this.status = Status.UNKNOWN;
    this.reason = null;
    this.sourceFiles = null;
}