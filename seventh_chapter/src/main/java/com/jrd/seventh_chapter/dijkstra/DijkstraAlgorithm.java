package com.jrd.seventh_chapter.dijkstra;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by Kuba on 2016-08-15.
 *
 * Rozwiązanie zadania 10 z rozdziału 7.
 * Implementacja Algorytmu Dijkstry
 */
public class DijkstraAlgorithm {
    private static String startVert;

    /**
     * Właściwy Algorytm Dijkstry
     * @throws Exception
     */
    public static void calculateMinimalPathLengths(Graph graph) throws Exception {
        PriorityQueue<Graph.Vertex> queue = new PriorityQueue<>();
        queue.addAll(graph.getAllVertices());
        Map<String, Double> d = new HashMap<>();
        graph.getAllVertices().stream().forEach(v -> d.put(v.getName(), v.getPathLength()));
        while (!queue.isEmpty()) {
            Graph.Vertex u = queue.remove();
            u.getEdges().values().stream()
                    .forEach(v -> {
                        if (d.get(u.getName()) + v.getWeight() < d.get(v.getDestinationVertex().getName())) {
                            d.put(v.getDestinationVertex().getName(), d.get(u.getName()) + v.getWeight());
                        }
                    });
        }

        for (Graph.Vertex vert : graph.getAllVertices()) {
            vert.setPathLength(d.get(vert.getName()));
        }
    }

    public static void calculatePathLength(Graph graph, String startVertex) throws Exception {
        startVert = startVertex;
        Graph.Vertex startV = graph.getVertexByName(startVertex);
        calculatePathLength(startV, 0);
    }

    private static void calculatePathLength(Graph.Vertex v, double length) {
        for (String k : v.getEdges().keySet()) {
            Graph.Edge destEdge = v.getEdges().get(k);
            if (destEdge.getDestinationVertex().getPathLength() == 0
                    && !destEdge.getDestinationVertex().getName().equals(startVert)) {
                double destLength = length + destEdge.getWeight();
                destEdge.getDestinationVertex().setPathLength(destLength);
                calculatePathLength(destEdge.getDestinationVertex(), destLength);
            }
        }
    }
}
