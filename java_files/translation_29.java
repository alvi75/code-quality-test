public HSSFPolygon createPolygon(HSSFChildAnchor anchor) {
    HSSFPolygon shape = new HSSFPolygon(this, anchor);
    shape.setParent(this);
    shape.setAnchor(anchor);
    shapes.add(shape);
    onCreate(shape);
    return shape;
}