public final CharsetDecoder reset() {
    status = INIT;
    implReset();
    return this;
}