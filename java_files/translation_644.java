public ObjectToPack(AnyObjectId src, int type) {
    super(src);
    flags = type << TYPE_SHIFT;
}