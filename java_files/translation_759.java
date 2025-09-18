public void close() throws IOException {
    if (this.read(this.skipBuffer) != -1|| this.actualSize != this.expectedSize) {
        throw new CorruptObjectException(MessageFormat.format(JGitText.get().packfileCorruptionDetected,JGitText.get().wrongDecompressedLength));
    }
    final int used = this.bAvail - this.inf.remainingInput();
    if (0 < used) {
        this.onObjectData(this.src, this.buffer, this.p, used);
        this.use(used);
    }
    this.inf.reset();
}