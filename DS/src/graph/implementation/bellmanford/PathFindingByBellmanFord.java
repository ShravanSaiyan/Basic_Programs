package graph.implementation.bellmanford;

import graph.implementation.WeightedNode;

import java.util.List;

public class PathFindingByBellmanFord {
    private final List<WeightedNode> nodeList;


    public PathFindingByBellmanFord(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
        nodeList.forEach(node -> node.setDistance(Integer.MAX_VALUE / 10));
    }

    private static void pathPrint(WeightedNode node) {
        if (node.getParent() != null) {
            pathPrint(node.getParent());
            System.out.print("->" + node);
        } else
            System.out.print(node);
    }//end of method

    void bellmanFord(WeightedNode sourceNode) {
        sourceNode.setDistance(0); // set source distance to zero

        for (int i = 1; i < nodeList.size(); i++) { // repeat n-1 times
            nodeList.forEach(presentNode -> presentNode.getNeighbours().stream().filter(neighbor -> neighbor.getDistance() > (presentNode.getDistance() + presentNode.getWeightedNodeMap().get(neighbor))).forEach(neighbor -> {
                neighbor.setDistance((presentNode.getDistance() + presentNode.getWeightedNodeMap().get(neighbor)));
                neighbor.setParent(presentNode);
            }));
        } // end of loop

        System.out.println("Checking for Negative Cycle ...");
        //for each edge check if update possible, if true then negative cycle is there report error
        //end of loop
        for (WeightedNode presentNode : nodeList) {
            List<WeightedNode> neighbours = presentNode.getNeighbours();
            for (WeightedNode neighbor : neighbours) {
                // if distance of neighbor is greater than tentative new path then we have a negative cycle, return
                // from here..
                if (neighbor.getDistance() > (presentNode.getDistance() + presentNode.getWeightedNodeMap().get(neighbor))) {
                    System.out.println("Negative cycle found: \n");
                    System.out.println("Vertex Name: " + neighbor.getName());
                    System.out.println("Old Distance: " + neighbor.getDistance());
                    int newDistance = presentNode.getDistance() + presentNode.getWeightedNodeMap().get(neighbor);
                    System.out.println("New distance: " + newDistance);
                    return;
                }
            }
        }
        System.out.println("Negative cycle not found !");


        //Print table of node with minimum distance and shortest path from source
        System.out.println("\n\nPrinting Paths now: ");
        //end of loop
        nodeList.forEach(nodeToCheck -> {
            if (nodeToCheck.getDistance() != Integer.MAX_VALUE / 10) {
                System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.getDistance() + ", Path: ");
                pathPrint(nodeToCheck);
            } else {
                System.out.print("No path for node " + nodeToCheck);
            }
            System.out.println();
        });
    }//end of method

    // add a weighted edge between two nodes
    public void addWeightedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i - 1);
        WeightedNode second = nodeList.get(j - 1);
        first.getNeighbours().add(second);
        first.getWeightedNodeMap().put(second, d);
    }//end of method

}
