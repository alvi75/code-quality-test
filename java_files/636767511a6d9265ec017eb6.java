import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
		if(start == null || stop == null)
			return new OuterFaceCirculator(0);
		
		Node n = start;
		int count=0;
		while(n != stop && (dir > 0 ? n.next() : n.previous()) != null){
			n = dir > 0 ? n.next() : n.previous();
			count++;
			if(count >= MAX_CIRCULAR_SEARCH_COUNT)
				throw new RuntimeException("Circular search limit reached");
		}
		
		if(dir > 0 && n == stop) {
			n = n.next();
			count++;
			if(count >= MAX_CIRCULAR_SEARCH_COUNT)
				throw new RuntimeException("Circular search limit reached");
		}
		
		if(!predicate.test(n))
			return new OuterFaceCirculator(0);
		
		//TODO: this is where we should check for loops in the outer face.
		//We can do this by checking if the next node after n is the same as the starting point.
		//If it is then we have a loop.
		//However, there may be other nodes between n and the starting point which we need to check too.
		//This will probably be more efficient than checking each time we move around the ring.
		//But it will also require us to store some information about the traversal so that we don't 
		//visit the same node twice.
		//A better approach would be to keep track of all visited nodes in the outer face and only allow
		//nodes to be revisited if they are not adjacent.
		//This way we could avoid storing any data at all and still achieve O(1) access times.
		//However, this requires pre-processing the graph to find all the nodes in the outer face and their neighbors.
		//The size of this list is potentially O(|V|+|E|), which is the worst case for both traversals.
		//Therefore, we'll probably want to use the first method for now and optimize it later if needed.
		//For now, let's just go with the slower algorithm.
		//Also note that we don't actually need to traverse the entire outer face in order to find a suitable node.
		//We can simply stop once we reach the end of the ring or the beginning of the ring depending
}