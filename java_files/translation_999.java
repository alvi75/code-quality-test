public String getClassArg() {
    if (null != args) {
        String className = args.get(CLASS_NAME);
        if (null != className) {
            return className;
        }
    }
    return getClass().getSimpleName();
}