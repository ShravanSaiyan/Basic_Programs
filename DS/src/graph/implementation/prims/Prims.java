package graph.implementation.prims;

import graph.implementation.WeightedNode;

import java.util.List;
import java.util.PriorityQueue;


public class Prims {

	List<WeightedNode> nodeList;

	//Constructor
	public Prims(List<WeightedNode> nodeList) {
		this.nodeList = nodeList;
	}//end of method

	
	// Prim's algorithm from source node
	void prims(WeightedNode node) {
		nodeList.forEach(weightedNode -> weightedNode.setDistance(Integer.MAX_VALUE));
	  node.setDistance(0); // Setting '0' distance for Source Vertex
	  
	  
	  
	  System.out.println("I am waiting");
	  try {Thread.sleep(100 * 1000);} catch (InterruptedException e) {e.printStackTrace();}


		PriorityQueue<WeightedNode> queue = new PriorityQueue<>(nodeList);
		while (!queue.isEmpty()) {
			WeightedNode presentNode = queue.remove(); // Remove vertex which has min distance


			//If vertex is not processed, only then enter in if-else
			//If known weight of this �adjacent vertex� is more than current edge,
			//then update �adjacent vertex�s� distance and parent
			//end of if-else
			//end of if-else
			//end of for loop
			presentNode.getNeighbours().stream().filter(queue::contains).filter(neighbor -> neighbor.getDistance() > presentNode.getWeightedNodeMap().get(neighbor)).forEach(neighbor -> {
				neighbor.setDistance(presentNode.getWeightedNodeMap().get(neighbor));
				neighbor.setParent(presentNode);
				queue.remove(neighbor); // Refresh the priority queue
				queue.add(neighbor);
			});
		}//end of while loop
		
		int cost = 0;
		// print table of node with minimum distance and shortest path from source
		for (WeightedNode nodeToCheck : nodeList) {
			System.out.println("Node " + nodeToCheck + ", key: " + nodeToCheck.getDistance() + ", Parent: " + nodeToCheck.getParent());
			cost = cost + nodeToCheck.getDistance();
		}//end of for loop
		
		System.out.println("\nTotal cost of MST: " + cost);
	}//end of method


	// add a weighted undirected edge between two nodes
	public void addWeightedUndirectedEdge(int i, int j, int d) {
		WeightedNode first = nodeList.get(i-1);
		WeightedNode second = nodeList.get(j-1);
		first.getNeighbours().add(second);
		second.getNeighbours().add(first);
		first.getWeightedNodeMap().put(second,d);
		second.getWeightedNodeMap().put(first, d);
	}//end of method
	
}//end of class