public void flush() throws IOException {
    drain();
    output.flush();
}