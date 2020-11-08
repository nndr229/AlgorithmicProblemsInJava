
//Algorithm by  Holczer Balazs

public class Implementation {
    private int[] hamiltonianPath;
    private int numOfVertices;
    private int[][] adjacencyMatrix;

    Implementation(int[][] adjacencyMatrix){
        this.adjacencyMatrix = adjacencyMatrix;
        this.hamiltonianPath = new int[adjacencyMatrix.length];
        this.numOfVertices  = adjacencyMatrix.length;
        this.hamiltonianPath[0] = 0;


    }

    public void solve(){
        if(findFeasibleSolution(1)){
            showHamiltonianPath();
        }else{
            System.out.println("No feasible solution");
        }
    }

    private boolean findFeasibleSolution(int position) {
        if(position == numOfVertices){
            if(adjacencyMatrix[hamiltonianPath[position-1]][hamiltonianPath[0]] == 1){
                return true;
            }else{
                return false;
            }
        }

        for (int vertexIndex=1; vertexIndex<numOfVertices; ++vertexIndex){
            if(isFeasible(vertexIndex,position)){
                hamiltonianPath[position] = vertexIndex;

                if(findFeasibleSolution(position+1)){
                    return true;
                }

                //Backtrack

            }
        }

        return false;
    }

    private boolean isFeasible(int vertexIndex, int actualPosition) {
        //first criterion: whether two nodes are connected?
        if(adjacencyMatrix[hamiltonianPath[actualPosition-1]][vertexIndex] == 0){
            return false;
        }
        //second criterion: whether we have visited it or not
        for(int i=0; i<actualPosition;i++){
            if(hamiltonianPath[i] == vertexIndex){
                return false;
            }
        }

        return true;
    }

    private void showHamiltonianPath(){
        System.out.println("Hamiltonian cycle:  ");
        for(int i=0; i<hamiltonianPath.length;i++){
            System.out.print(hamiltonianPath[i]+" ");
        }
        System.out.print(hamiltonianPath[0]+".");
    }


}


