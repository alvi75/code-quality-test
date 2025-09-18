public int compareTo(ScoreTerm other) {
    if (term.bytesEquals(other.term))return 0;
    if (this.boost == other.boost)return other.term.compareTo(this.term);
    elsereturn Float.compare(this.boost, other.boost);
}