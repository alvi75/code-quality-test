public String toString() {
    StringBuilder r = new StringBuilder();
    r.append("BlameResult: ");
    r.append(getResultPath());
    r.append(" -> ");
    r.append(getNewPath());
    r.append(" (");
    r.append(getOldId().name());
    r.append(", ");
    r.append(getNewId().name());
    r.append(")");
    return r.toString();
}