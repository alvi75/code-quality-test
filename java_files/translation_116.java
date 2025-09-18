public boolean equals(Object obj) {
    if (this == obj)return true;
    if (!super.equals(obj))return false;
    if (getClass() != obj.getClass())return false;
    AutomatonQuery other = (AutomatonQuery) obj;
    if (automaton == null) {
        if (other.automaton != null) return false;
    }
    else if (!automaton.equals(other.automaton))return false;
    if (term == null) {
        if (other.term != null) return false;
    }
    else if (!term.equals(other.term))return false;
    return true;
}