package graph.implementation.dfs;

import graph.implementation.GraphNode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DFSIterativeMain {
    public static void main(String[] args) {
        List<GraphNode> nodeList = IntStream.range(1, 11).mapToObj(i -> new GraphNode("V" + i)).collect(Collectors.toList());

        //create 10 nodes: v1-v10

        //Constructor
        DFSIterative graph = new DFSIterative(nodeList);

        //add edges following graph in graph.docx
        graph.addUndirectedEdge(1,2);
        graph.addUndirectedEdge(1,4);
        graph.addUndirectedEdge(2,3);
        graph.addUndirectedEdge(2,5);
        graph.addUndirectedEdge(3,6);
        graph.addUndirectedEdge(3,10);
        graph.addUndirectedEdge(4,7);
        graph.addUndirectedEdge(5,8);
        graph.addUndirectedEdge(6,9);
        graph.addUndirectedEdge(7,8);
        graph.addUndirectedEdge(8,9);
        graph.addUndirectedEdge(9,10);

        //dfs from v1
        System.out.println("Printing DFS from source: V1");
        graph.dfs();
    }
}
