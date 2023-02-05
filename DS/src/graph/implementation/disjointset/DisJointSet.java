package graph.implementation.disjointset;

import graph.implementation.WeightedNode;

import java.util.ArrayList;
import java.util.List;

public class DisJointSet {
    private List<WeightedNode> nodes = new ArrayList<>();

    public static void driver(ArrayList<WeightedNode> nodeList) {
        makeSet(nodeList); //Create Disjoint Sets for each node in this list.
        for (int i = 0; i < nodeList.size() - 1; i++) {
            WeightedNode firstNode = nodeList.get(i);
            WeightedNode secondNode = nodeList.get(i + 1);
            System.out.println("Checking if node " + firstNode.getName() + " and " + secondNode.getName() + " belongs" +
                    " to different set, if yes, will Union them...");
            System.out.println("\nFirst Set name is: " + firstNode.getName());
            firstNode.getSet().printAllNodesOfThisSet();
            System.out.println("\nSecond Set name is: " + secondNode.getName());
            secondNode.getSet().printAllNodesOfThisSet();
            if (!findSet(firstNode).equals(findSet(secondNode))) {
                System.out.println("\nMaking union " + firstNode + " and " + secondNode);
                DisJointSet unionedSet = union(firstNode, secondNode);
                unionedSet.printAllNodesOfThisSet();
            }
            System.out.println("\n**************************************\n");
        }
    }//end of method

    public static void makeSet(List<WeightedNode> nodeList) {
        nodeList.forEach(node -> {
            DisJointSet set = new DisJointSet();
            set.getNodes().add(node);   //Retrieve the nodes and add the current node
            node.setSet(set); // To tell the node to which set he belongs to
        });
    }

    public static DisJointSet getSet(WeightedNode node) {
        return node.getSet();
    }

    public static DisJointSet findSet(WeightedNode node) {
        return node.getSet();
    }

    public static DisJointSet union(WeightedNode node1, WeightedNode node2) {
        if (node1.getSet().equals(node2.getSet())) { //if two nodes are of same set then no union needed
            return null;
        } else {
            //get set object of two nodes
            DisJointSet set1 = node1.getSet();
            DisJointSet set2 = node2.getSet();
            // if first set is bigger then update each node of second set to merge to set1
            if (set1.getNodes().size() > set2.getNodes().size()) {
                List<WeightedNode> nodeSet2 = set2.getNodes();
                //update each node of second set to merge to set1
                nodeSet2.forEach(node -> {
                    node.setSet(set1);
                    set1.getNodes().add(node);
                });
                return set1;
            } else {
                // if second set is bigger/equal then update each node of first set to merge to set2
                List<WeightedNode> nodeSet1 = set1.getNodes();
                //update each node of first set to merge to set2
                nodeSet1.forEach(node -> {
                    node.setSet(set2);
                    set2.getNodes().add(node);
                });
                return set2;
            }//end of inner if-else
        }//end of outer if-else
    }//end of method


    public void printAllNodesOfThisSet() {
        System.out.println("Printing all nodes of the set: ");
        nodes.stream().map(node -> node + "  ").forEach(System.out::print);
        System.out.println();
    }//end of method

    public List<WeightedNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<WeightedNode> nodes) {
        this.nodes = nodes;
    }
}
