ublic int lastIndexOf(String subString, int start) {
    synchronized (this) {
        return super.lastIndexOf(subString, start);
    }
}