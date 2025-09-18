public RenameBranchCommand setOldName(String oldName) {
    checkCallable();
    this.oldName = oldName;
    return this;
}