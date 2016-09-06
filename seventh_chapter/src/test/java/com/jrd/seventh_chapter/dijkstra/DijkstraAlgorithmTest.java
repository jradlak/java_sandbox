package com.jrd.seventh_chapter.dijkstra;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by jakub on 06.09.16.
 */
public class DijkstraAlgorithmTest {
    private Graph graph;

    @Before
    public void setup() throws Exception {
        this.graph = GraphUtils.buildTestGraph();
    }

    @Test
    public void calculatePathLengthTest() throws Exception {
        DijkstraAlgorithm.calculatePathLength(this.graph, "1");
        System.out.println("Graph with calculated path lengths: \n" + graph.toString());
    }
}
