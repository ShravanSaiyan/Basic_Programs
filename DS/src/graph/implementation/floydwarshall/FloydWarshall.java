package graph.implementation.floydwarshall;

import graph.implementation.WeightedNode;

import java.util.List;


public class FloydWarshall {

    List<WeightedNode> nodeList;


    //Constructor
    public FloydWarshall(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }


    void floydWarshall() {
        int size = nodeList.size();
        int[][] v = new int[size][size];

        // Initializing Distance table from adjacency list
        //Can be avoided if user gives in form of adjacency list
        extractingListToAdjacencyMatrix(size, v);

        // Floyd Warshall's Algorithm
        for (int k = 0; k < nodeList.size(); k++) {
            for (int i = 0; i < nodeList.size(); i++) {
                for (int j = 0; j < nodeList.size(); j++) {
                    if (v[i][j] > v[i][k] + v[k][j]) {  // if update possible, then update path
                        v[i][j] = v[i][k] + v[k][j];    // this will keep a track on path
                    }
                }
            }
        }//end of loop


        // Print table of node with minimum distance and shortest path from each source
        printMatrix(size, v);

    }// end of method

    private void printMatrix(int size, int[][] v) {
        for (int i = 0; i < size; i++) {
            System.out.print("Printing distance list for node " + nodeList.get(i) + ": ");
            for (int j = 0; j < size; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void extractingListToAdjacencyMatrix(int size, int[][] v) {
        for (int i = 0; i < size; i++) {
            WeightedNode first = nodeList.get(i);
            for (int j = 0; j < size; j++) {
                WeightedNode second = nodeList.get(j);
                //we have direct edge between i & j
                //no direct edge between i & j, so mark it as infinity [divided by 10 to avoid arithmetic overflow]
                if (i == j)
                    v[i][j] = 0;
                else v[i][j] = first.getWeightedNodeMap().getOrDefault(second, Integer.MAX_VALUE / 10);
            }
        }//end of loop
    }


    // add a weighted edge between two nodes
    public void addWeightedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i - 1);
        WeightedNode second = nodeList.get(j - 1);
        first.getNeighbours().add(second);
        first.getWeightedNodeMap().put(second, d);
    }// end of method

}// end of class