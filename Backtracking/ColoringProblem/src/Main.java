//Color the vertices of a given graph such that no two adjacent vertices have the same color...
//Smallest number of colors needed to color a graph G is called its chromatic number.
//NP complete problem !!! exponential running time..

//Determining if a graph can be colored with 2 colors is equivalent to determining whether the graph is bipartite.
//Bipartite graph: A graph  whose vertices  can be divided into  2 disjoint sets "U" and "V" such that every edge
//connects  a vertex in "U"" "to one in "V".

//Used in -> |1. radio frequency assignment  |2. register allocation

//Four colors are sufficient to color any map aka Four Color Theorem.

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[][] adjacencyMatrix = {
                {0,1,0,1,0},
                {1,0,1,1,0},
                {0,1,0,1,0},
                {1,1,1,1,0},
                {0,0,0,1,0},

        };
//        int[][] adjacencyMatrix = {
//                {0,1,1,1,0,0},
//                {1,0,1,0,1,0},
//                {1,1,1,1,0,1},
//                {1,0,1,0,0,1},
//                {0,1,0,0,0,1},
//                {0,1,1,1,1,1},
//
//        };

        int numOfColors = 3;

        Implementation coloringProblem = new Implementation(adjacencyMatrix,numOfColors);
        coloringProblem.solve();

    }
}
