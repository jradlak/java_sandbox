package com.jrd.seventh_chapter.dijkstra;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kuba on 2016-08-15.
 */
public class GraphTest {

    @Test
    public void buildGraphTest() throws Exception {
        Graph graph = GraphUtils.buildTestGraph();
        System.out.println("Generated graph = " + graph.toString());
        Assert.assertTrue(6 == graph.getNumberOfVertices());
    }
}
