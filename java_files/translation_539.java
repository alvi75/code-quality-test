@Override public Iterator<K> iterator() {
    final Iterator<Entry<K, V>> iterator = filteredEntrySet.iterator();
    return new UnmodifiableIterator<K>() {