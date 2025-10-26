ublic static Format byId(int id) {
    for (Format format : values()) {
        if (format.id == id) {
            return format;
        }
    }
    throw new IllegalArgumentException("Unknown format id: " + id);
}