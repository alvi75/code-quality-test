ublic static List<Tree> getChildren(Tree t) {
    List<Tree> kids = new ArrayList<Tree>();
    for (int i = 0;
    i < t.getChildCount();
    i++) {
        kids.add(t.getChild(i));
    }
    return kids;
}