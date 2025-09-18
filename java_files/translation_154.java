public static short lookupIndexByName(String name) {
    final FunctionMetadata fd = getInstance().getFunctionByName(name);
    if (fd == null) {
        return -1;
    }
    return fd.getIndex();
}