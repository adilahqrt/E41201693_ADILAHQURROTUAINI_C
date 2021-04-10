package com.adilah.graph;

public class GraphApp {
    public static void main(String[] args) {
        Graph theGraph = new Graph();

        theGraph.addVertex('A'); //0
        theGraph.addVertex('B'); //1
        theGraph.addVertex('C'); //2
        theGraph.addVertex('D'); //3
        theGraph.addVertex('E'); //4

        theGraph.addEdge(0, 1); //AB
        theGraph.addEdge(1, 2); //BC
        theGraph.addEdge(2, 3); //AD
        theGraph.addEdge(3, 4); //DE


        Graph graphD = new Graph();

        graphD.addVertex('A'); //0
        graphD.addVertex('B'); //1
        graphD.addVertex('C'); //2
        graphD.addVertex('D'); //3
        graphD.addVertex('E'); //4

        graphD.addEdge(0, 1); //AB
        graphD.addEdge(1, 4); //BE
        graphD.addEdge(4, 2); //EC
        graphD.addEdge(2, 3); //CD

//        theGraph.display();
//        theGraph.bfs();
        graphD.display();
        graphD.dfs();
    }
}
