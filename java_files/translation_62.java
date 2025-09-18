public boolean remove(Object object) {
    synchronized (mutex) {
        return delegate().remove(object);
    }
}