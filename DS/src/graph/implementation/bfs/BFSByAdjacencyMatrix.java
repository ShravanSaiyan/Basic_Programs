package graph.implementation.bfs;

import graph.implementation.GraphNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class BFSByAdjacencyMatrix {
    List<GraphNode> nodeList = new ArrayList<>();
    int[][] adjacencyMatrix;

    public BFSByAdjacencyMatrix(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    /**
     * BFS Algorithm
     */
    void bfs() {
        nodeList.stream().filter(node -> !node.isVisited()).forEach(this::bfsVisit);
    }

    private void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode presentNode = queue.remove(0);
            presentNode.setVisited(true);
            System.out.print(presentNode.getName() + " ");
            List<GraphNode> neighbours = getNeighbours(presentNode);

            neighbours.stream().filter(neighbour -> !neighbour.isVisited()).forEach(neighbour -> {
                queue.add(neighbour);
                neighbour.setVisited(true);
            });
        }
    }

    public List<GraphNode> getNeighbours(GraphNode node) {
        List<GraphNode> neighbours = new ArrayList<>();
        int nodeIndex = node.getIndex();

        IntStream.range(0, adjacencyMatrix.length).filter(i -> adjacencyMatrix[nodeIndex][i] == 1).
                mapToObj(i -> nodeList.get(i)).forEach(neighbours::add);
        return neighbours;
    }

    /**
     * Adds an undirected edge
     *
     * @param i the first node
     * @param j the second node
     */
    public void addUndirectedEdge(int i, int j) {
        i--;
        j--;
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }
}
