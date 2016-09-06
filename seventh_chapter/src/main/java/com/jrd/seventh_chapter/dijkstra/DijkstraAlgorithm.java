package com.jrd.seventh_chapter.dijkstra;



/**
 * Created by Kuba on 2016-08-15.
 */
public class DijkstraAlgorithm {
    private static String startVert;
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
