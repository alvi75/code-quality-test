ublic boolean ready() throws IOException {
    synchronized (lock) {
        if (!isClosed()) {
            throw new IOException("InputStreamReader is closed");
        }
        try {
            return bytes.hasRemaining() || in.available() > 0;
        }
    }
}