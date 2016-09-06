package com.jrd.seventh_chapter.dijkstra;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kuba on 2016-08-15.
 *
 * Struktura danych reprezentująca ważony graf skierowany.
 * Czyli graf posiadający krawędzie kierunkowe. Każda krawędź posiada wagę liczbową.
 *
 * Dla uproszczenia wierzchołkami będą ciągin znaków, a wagami liczby zmiennoprzecinkowe podwójnej precyzji.
 *
 */
public class Graph {

    private Map<String, Vertex> vertices;

    public Graph() {
        this.vertices = new HashMap<>();
    }

    public Vertex getVertexByName(String vertexName) throws Exception {
        if (!this.vertices.containsKey(vertexName)) {
            throw new Exception("There is no vertex of name " + vertexName + ".");
        }

        return this.vertices.get(vertexName);
    }

    public int getNumberOfVertices() {
        return this.vertices.size();
    }

    public void addVertex(String vertexName) {
        this.vertices.put(vertexName, new Vertex(vertexName));
    }

    public void addEdge(String source, String destination, Double weight) throws Exception {
        checkVertices(source, destination);
        this.vertices.get(source).addEdge(this.vertices.get(destination), weight);
    }

    public void addBiEdge(String vertexA, String vertexB, Double weight) throws Exception  {
        addEdge(vertexA, vertexB, weight);
        addEdge(vertexB, vertexA, weight);
    }

    public void modifyWeight(String source, String destination, Double weight) throws Exception {
        checkVertices(source, destination);
        this.vertices.get(source).getEdges().get(destination).setWeight(weight);
    }

    public void modifyBiWeight(String vertexA, String vertexB, Double weight) throws Exception {
        modifyWeight(vertexA, vertexB, weight);
        modifyWeight(vertexB, vertexA, weight);
    }

    private void checkVertices(String source, String destination) throws Exception {
        if (!this.vertices.containsKey(source)) {
            throw new Exception("No source " + source);
        }

        if (!this.vertices.containsKey(destination)) {
            throw new Exception("No destination " + destination);
        }
    }

    @Override
    public String toString() {
        return "Graph{" +
                "vertices=" + vertices +
                '}';
    }

    public static class Vertex {
        private String name;

        private Map<String, Edge> edges;

        private double pathLength;

        public Vertex(String name) {
            this.name = name;
            this.edges = new HashMap<>();
            this.pathLength = 0;
        }

        public void addEdge(Vertex destinationVertex, double weight) {
            this.edges.put(destinationVertex.getName(), new Edge(weight, this, destinationVertex));
        }

        public String getName() {
            return name;
        }

        public Map<String, Edge> getEdges() {
            return edges;
        }

        public double getPathLength() {
            return pathLength;
        }

        public void setPathLength(double pathLength) {
            this.pathLength = pathLength;
        }

        @Override
        public String toString() {
            return "\nVertex{" +
                    "name='" + name + '\'' +
                    ", edges=" + edges +
                    ", pathLength=" + pathLength +
                    '}';
        }
    }

    public static class Edge {
        private double weight;
        private Vertex sourceVertex;
        private Vertex destinationVertex;

        public Edge(double weight, Vertex sourceVertex, Vertex destinationVertex) {
            this.weight = weight;
            this.sourceVertex = sourceVertex;
            this.destinationVertex = destinationVertex;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public Vertex getSourceVertex() {
            return sourceVertex;
        }

        public Vertex getDestinationVertex() {
            return destinationVertex;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "weight=" + weight +
                    ", sourceVertex=" + sourceVertex.getName() +
                    ", destinationVertex=" + destinationVertex.getName() +
                    '}';
        }
    }
}
