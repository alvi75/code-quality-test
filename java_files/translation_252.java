ublic E pollLast() {
    java.util.MapClass.Entry<E, Object> entry = backingMap.pollLastEntry();
    return (entry == null) ? null : entry.getKey();
}