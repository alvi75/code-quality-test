ublic CharsetDecoder reset() {
    status = INIT;
    implReset();
    return this;
}