public GraphvizFormatter( ConnectionCosts costs ) {
    this.costs = costs;
    this.bestPathMap = new HashMap<>();
    setVCenter(-1);
    setVerticalLabelsOnly(false);
}