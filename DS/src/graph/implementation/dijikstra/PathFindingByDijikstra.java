package graph.implementation.dijikstra;

import graph.implementation.WeightedNode;

import java.util.List;
import java.util.PriorityQueue;

public class PathFindingByDijikstra {

    List<WeightedNode> nodeList;

    public PathFindingByDijikstra(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    private static void pathPrint(WeightedNode node) {
        if (node.getParent() != null) {
            pathPrint(node.getParent());
            System.out.print("->" + node);
        } else
            System.out.print(node);
    }//end of method

    void dijikstra(WeightedNode node) {
        node.setDistance(0);
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>(nodeList);
        while (!queue.isEmpty()) {
            WeightedNode presentNode = queue.remove();
            presentNode.getNeighbours().stream().filter(queue::contains).filter(neighbor -> neighbor.getDistance() > (presentNode.getDistance() + presentNode.getWeightedNodeMap().get(neighbor))).forEach(neighbor -> {
                neighbor.setDistance((presentNode.getDistance() + presentNode.getWeightedNodeMap().get(neighbor)));
                neighbor.setParent(presentNode);
                queue.remove(neighbor);
                queue.add(neighbor);
            });
        }

        nodeList.forEach(nodeToBePrinted -> {
            System.out.print("Node " + nodeToBePrinted + ", distance: " + nodeToBePrinted.getDistance() + ", Path: ");
            pathPrint(nodeToBePrinted);
            System.out.println();
        });
    }

    public void addWeightedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i - 1);
        WeightedNode second = nodeList.get(j - 1);
        first.getNeighbours().add(second);
        first.getWeightedNodeMap().put(second, d);
    }//end of method
}
