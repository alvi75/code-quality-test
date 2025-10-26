ublic boolean equals(Object obj) {
    if (!(obj instanceof State)) return false;
    State other = (State) obj;
    return isFinal == other.isFinal && Arrays.equals(labels, other.labels) && states.equals(other.states);
}