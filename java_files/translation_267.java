public void add(int location, E object) {
    synchronized (mutex) {
        list.add(location, object);
    }
}