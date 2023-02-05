package graph.implementation.bfs;

import graph.implementation.GraphNode;

import java.util.LinkedList;
import java.util.List;

public class PathFinding {

    List<GraphNode> nodeList;

    public PathFinding(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public static void pathPrint(GraphNode node) {
        if (null != node.getParent()) {
            pathPrint(node.getParent());
        }
        System.out.print(node + " ");
    }

    void bfsForSSSP(GraphNode node) {
        List<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode presentNode = queue.remove(0);
            presentNode.setVisited(true);
            System.out.print("Printing path for node " + presentNode.getName() + ": ");
            pathPrint(presentNode);
            System.out.println();
            presentNode.getNeighbours().stream().filter(neighbour -> !neighbour.isVisited()).forEach(neighbour -> {
                queue.add(neighbour);
                neighbour.setVisited(true);
                neighbour.setParent(presentNode);
            });
        }
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.getNeighbours().add(second);
        second.getNeighbours().add(first);
    }
}
