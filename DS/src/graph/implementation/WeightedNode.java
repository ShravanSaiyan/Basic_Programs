package graph.implementation;

import graph.implementation.disjointset.DisJointSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedNode implements Comparable<WeightedNode> {
    private String name;
    private List<WeightedNode> neighbours = new ArrayList<>();
    private Map<WeightedNode, Integer> weightedNodeMap = new HashMap<>();
    private boolean isVisited = false;
    private WeightedNode parent;
    private int distance;
    private DisJointSet set;

    public WeightedNode(String name) {
        this.name = name;
        distance = Integer.MAX_VALUE;
    }

    public DisJointSet getSet() {
        return set;
    }

    public void setSet(DisJointSet set) {
        this.set = set;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WeightedNode> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<WeightedNode> neighbours) {
        this.neighbours = neighbours;
    }

    public Map<WeightedNode, Integer> getWeightedNodeMap() {
        return weightedNodeMap;
    }

    public void setWeightedNodeMap(Map<WeightedNode, Integer> weightedNodeMap) {
        this.weightedNodeMap = weightedNodeMap;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public WeightedNode getParent() {
        return parent;
    }

    public void setParent(WeightedNode parent) {
        this.parent = parent;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;
    }

    @Override
    public String toString() {
        return name;
    }
}
