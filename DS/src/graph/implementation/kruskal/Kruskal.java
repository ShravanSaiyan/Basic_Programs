package graph.implementation.kruskal;

import graph.graphUtil.UndirectedEdge;
import graph.implementation.WeightedNode;
import graph.implementation.disjointset.DisJointSet;

import java.util.ArrayList;
import java.util.Comparator;



public class Kruskal {
	ArrayList<WeightedNode> nodeList = new ArrayList<>();
	ArrayList<UndirectedEdge> edgeList = new ArrayList<>();

	public Kruskal(ArrayList<WeightedNode> nodeList) {
		this.nodeList = nodeList;
	}

	
	// Kruskal algo
	void kruskal() {
		// make disjoint sets for each node
		DisJointSet.makeSet(nodeList);
		
		// sort the edges in ascending order
		Comparator<UndirectedEdge> comparator = Comparator.comparingInt(UndirectedEdge::getWeight);
		edgeList.sort(comparator);

		int cost = 0;
		for (UndirectedEdge edge : edgeList) {
			WeightedNode first = edge.getFirst();
			WeightedNode second = edge.getSecond();
			if (!DisJointSet.findSet(first).equals(DisJointSet.findSet(second))) {
				DisJointSet.union(first, second);
				cost += edge.getWeight();
				System.out.println("Taken " + edge);
			}
		}

		System.out.println("\nTotal cost of MST: " + cost);
	}

	
	// add a weighted undirected edge between two nodes
	public void addWeightedUndirectedEdge(int firstIndex, int secondIndex, int weight) {
		UndirectedEdge edge = new UndirectedEdge(nodeList.get(firstIndex - 1), nodeList.get(secondIndex - 1), weight);
		WeightedNode first = edge.getFirst();
		WeightedNode second = edge.getSecond();
		first.getNeighbours().add(second);
		second.getNeighbours().add(first);
		first.getWeightedNodeMap().put(second, weight);
		second.getWeightedNodeMap().put(first, weight);
		edgeList.add(edge);
	}
}
