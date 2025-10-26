ublic static int lookupIndexByName(String name) {
    FunctionMetadata fd = getInstance().getFunctionByNameInternal(name);
    if (fd == null) {
        return -1;
    }
    return (int)fd.index;
}