package graph.implementation.dfs;

import graph.implementation.GraphNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSIterative {

    List<GraphNode> nodeList = new ArrayList<>();

    public DFSIterative(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    void dfs() {

        nodeList.stream().filter(nodes -> !nodes.isVisited()).forEach(this::dfsVisit);
    }

    private void dfsVisit(GraphNode graphNode) {
        Stack<GraphNode> nodeStack = new Stack<>();
        nodeStack.push(graphNode);

        while (!nodeStack.isEmpty()) {
            GraphNode presentNode = nodeStack.pop();

            presentNode.setVisited(true);
            System.out.print(presentNode.getName() + " ");

            List<GraphNode> neighbours = presentNode.getNeighbours();
            neighbours.stream().filter(neighbour -> !neighbour.isVisited()).forEach(neighbour -> {
                nodeStack.add(neighbour);
                neighbour.setVisited(true);
            });
        }
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode firstNode = nodeList.get(i - 1);
        GraphNode secondNode = nodeList.get(j - 1);
        firstNode.getNeighbours().add(secondNode);
        secondNode.getNeighbours().add(firstNode);
    }
}
