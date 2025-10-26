ublic RevFilter clone() {
    return new AndRevFilter.Binary(getA().clone(), getB().clone());
}