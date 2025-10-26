ublic override void close() throws IOException {
    if (this.read(this.skipBuffer) != -1 || this.actualSize != this.expectedSize) {
        throw new CorruptObjectException(MessageFormat.format(JGitText.get().packfileCorruptionDetected, JGitText.get().wrongDecompressedLength)));
    }
    int used = this._enclosing.bAvail - this.inf.remainingInput;
    if (0 < used) {
        this._enclosing.onObjectData(this.src, this._enclosing.buf, this.p, used);
        this._enclosing.use(used);
    }
    this.inf.reset();
}