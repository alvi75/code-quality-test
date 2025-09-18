public RevFilter negate() {
    return NotRevFilter.create(this);
}