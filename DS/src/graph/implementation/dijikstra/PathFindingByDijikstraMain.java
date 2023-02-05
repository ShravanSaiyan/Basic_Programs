package graph.implementation.dijikstra;

import graph.implementation.WeightedNode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PathFindingByDijikstraMain {
    public static void main(String[] args) {
        List<WeightedNode> nodes = IntStream.range(0, 5).mapToObj(i -> new WeightedNode("" + (char) (65 + i))).collect(Collectors.toList());
        PathFindingByDijikstra graph = new PathFindingByDijikstra(nodes);
        graph.addWeightedEdge(1,3,6); //Add A-> C , weight 6
        graph.addWeightedEdge(1,4,3); //Add A-> D , weight 3
        graph.addWeightedEdge(2,1,3); //Add B-> A , weight 3
        graph.addWeightedEdge(3,4,2); //Add C-> D , weight 2
        graph.addWeightedEdge(4,3,1); //Add D-> C , weight 1
        graph.addWeightedEdge(4,2,1); //Add D-> B , weight 1
        graph.addWeightedEdge(5,2,4); //Add E-> B , weight 4
        graph.addWeightedEdge(5,4,2); //Add E-> D , weight 2

        System.out.println("Printing Dijkstra from source: E");
        graph.dijikstra(nodes.get(4));
    }
}
