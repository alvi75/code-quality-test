ublic void addShape(HSSFShape shape) {
    shape.setPatriarch(this.getPatriarch());
    shape.setParent(this);
    shapes.add(shape);
}