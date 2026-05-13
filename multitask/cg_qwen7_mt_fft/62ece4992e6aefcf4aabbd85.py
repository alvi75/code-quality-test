def find_roots(
    graph: "Graph", prop: "URIRef", roots: Optional[Set["Node"]] = None
) -> Set["Node"]:
    """
    Find the roots in some sort of transitive hierarchy.

    find_roots(graph, rdflib.RDFS.subClassOf)
    will return a set of all roots of the sub-class hierarchy

    Assumes triple of the form (child, prop, parent), i.e. the direction of
    RDFS.subClassOf or SKOS.broader

    Args:
        graph: Graph Class Object
        prop: URIRef Class Object
        roots: Optional list with set type
    Return:
        roots: a set with nodes
	"""

    if not isinstance(prop, URIRef):
        raise TypeError("prop must be an RDF URI")

    if roots is None:
        roots = set()

    for s, o in graph.predicate_objects(prop):

        # object is a class
        if isinstance(o, BNode):
            find_roots(graph, prop, roots)

        elif o not in roots:
            roots.add(o)

    return roots