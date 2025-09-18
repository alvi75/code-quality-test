public void write(byte[] b) {
    writeContinueIfRequired(b.length);
    _ulrOutput.write(b);
}