public boolean equals(Object obj) {
    if (!(obj instanceof FacetLabel)) {
        return false;
    }
    FacetLabel other = (FacetLabel) obj;
    return length == other.length && Arrays.equals(components, other.components);
}