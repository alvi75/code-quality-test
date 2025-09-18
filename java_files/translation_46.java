public void setProgressMonitor(ProgressMonitor pm) {
    if (pm == null) {
        pm = NullProgressMonitor.INSTANCE;
    }
    monitor = ProgressMonitor.wrapIfNotCanceled(pm);
}