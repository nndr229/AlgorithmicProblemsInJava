//Algorithm
// We assign colors sequentially to the vertices (optional : start coloring from the first vertex)
// Before assigning a color => We check for safety by considering if an adjacent vertex has the same color
// If we find a color assignment that is feasible => Mark the color assignment as part of the solution
// If we do not find a color duw to clashes => "WE BACKTRACK !"

public class Implementation {
    //Algorithm by  Holczer Balazs

    private final int numOfVertices;
    private final int numOfColors;
    private final int[] colors;
    private final int[][] adjacencyMatrix;

    public Implementation(int[][] adjacencyMatrix, int numOfColors){
        this.numOfColors = numOfColors;
        this.adjacencyMatrix = adjacencyMatrix;
        this.numOfVertices = adjacencyMatrix.length;
        this.colors = new int[numOfVertices];
    }

    public void solve(){
        if(solveProblem(0)){
            showResults();
        }else{
            System.out.println("No Solution...");
        }
    }

    private boolean solveProblem(int nodeIndex) {
        if(nodeIndex == numOfVertices){
            return true;
        }

        for(int colorIndex=1; colorIndex<=numOfColors; colorIndex++){
            if(isColorValid(nodeIndex,colorIndex)){
                colors[nodeIndex] = colorIndex;

                if(solveProblem(nodeIndex +1)){
                    return true;
                }
                //Backtrack !!! => means we keep incrementing the color index
            }
        }
        return false;
    }

    private boolean isColorValid(int nodeIndex, int colorIndex) {
        for(int i=0; i<numOfVertices;i++)
            if(adjacencyMatrix[nodeIndex][i] ==1 && colorIndex==colors[i])
                return false;

        return true;
    }

    private void showResults() {
        for(int i=0; i<numOfVertices; i++){
            System.out.println("Node " + (i+1) +" has color index: "+colors[i]);
        }
    }


}
