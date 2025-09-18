public void clearFormatting() {
    _string = cloneStringIfRequired();
    _string.clearFormatting();
    addToSSTIfRequired();
}