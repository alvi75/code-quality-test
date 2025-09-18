public static Format byId(int id) {
    for (Format f : values()) {
        if (f.getId() == id)return f;
    }
    throw new IllegalArgumentException("Unknown format id: " + id);
}