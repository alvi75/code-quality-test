ublic void incrementSecondaryProgressBy(int diff) {
    synchronized(this) {
        setSecondaryProgress(secondaryProgress + diff);
    }
}