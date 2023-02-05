package graph.implementation.bfs;

import graph.implementation.GraphNode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PathFindingMain {
    public static void main(String[] args) {
        List<GraphNode> nodeList = IntStream.range(0, 10).mapToObj(i -> new GraphNode("" + i)).collect(Collectors.toList());

        PathFinding graph = new PathFinding(nodeList);

        graph.addUndirectedEdge(0,8);
        graph.addUndirectedEdge(8,2);
        graph.addUndirectedEdge(8,9);
        graph.addUndirectedEdge(2,1);
        graph.addUndirectedEdge(9,1);
        graph.addUndirectedEdge(2,4);
        graph.addUndirectedEdge(1,3);
        graph.addUndirectedEdge(1,7);
        graph.addUndirectedEdge(3,4);
        graph.addUndirectedEdge(3,5);
        graph.addUndirectedEdge(7,6);
        graph.addUndirectedEdge(5,6);

        System.out.println("Printing BFS from source: 2");
        graph.bfsForSSSP(nodeList.get(2));
    }
}
