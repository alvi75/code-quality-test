ublic boolean remove(Object o) {
    synchronized (mutex) {
        return c.remove(o);
    }
}