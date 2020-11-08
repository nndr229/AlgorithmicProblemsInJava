
public class Main {
    public static void main(String[] args) {

//        int[][] adjacencyMatrix = {
//                {0,1,0},
//                {1,0,1},
//                {0,1,0}
//        };
        int[][] adjacencyMatrix = {
                {0,1,1,1,0,0},
                {1,0,1,0,1,0},
                {1,1,1,1,0,1},
                {1,0,1,0,0,1},
                {0,1,0,0,0,1},
                {0,1,1,1,1,1},

        };

        Implementation hamiltonian = new Implementation(adjacencyMatrix);
        hamiltonian.solve();
    }
}