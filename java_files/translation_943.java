public void run() {
    long startMS = System.nanoTime()/1000000;
    while(!stop) {
        long msLeft = (startMS + maxMS) - System.nanoTime()/1000000;
        if (msLeft <= 0) {
            return;
        }
        try {
            Thread.sleep(msLeft);
        }
        catch (InterruptedException ie) {
            throw new RuntimeException(ioe);
        }
    }
}