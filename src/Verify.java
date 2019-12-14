import java.util.*;


public class Verify {


    public static void main(String[] args){

        //test if circular path is reversed
        boolean correct;
        /*
        //use circular graphs to verify brute force working correctly
        CostMatrix costMatrix = GenerateCircularGraphCostMatrix(13, 50);
        costMatrix.printMatrix();
        Path expected = costMatrix.circularCorrect;
        Path actual = BruteForce.TravelingSalesman(costMatrix);
        System.out.println();
        correct = expected.nodes.equals(actual.nodes);
        if(correct){
            System.out.print("Expected path using circle math: ");
            expected.printPath();
            System.out.print("Brute force solution path:      ");
            actual.printPath();
        }
        else{
            Collections.reverse(expected.nodes);
            System.out.print("Expected path using circle math: ");
            expected.printPath();
            System.out.print("Greedy solution path:            ");
            actual.printPath();
        }
        if(expected.nodes.equals(actual.nodes))
            System.out.println("Paths match!");
        else
            System.out.println("Paths do not match :(");

         */

        //use circular graphs to verify greedy version working correctly
        CostMatrix costMatrix = GenerateCircularGraphCostMatrix(60, 50);
        costMatrix.printMatrix();
        Path expected = costMatrix.circularCorrect;
        Path actual = Greedy.TravelingSalesman(costMatrix);
        System.out.println();
        correct = expected.nodes.equals(actual.nodes);
        if(correct){
            System.out.print("Correct path using circle math: ");
            expected.printPath();
            System.out.print("Greedy solution path:           ");
            actual.printPath();
        }
        else{
            Collections.reverse(expected.nodes);
            System.out.print("Correct path using circle math: ");
            expected.printPath();
            System.out.print("Greedy solution path:           ");
            actual.printPath();
        }

        if(expected.nodes.equals(actual.nodes))
            System.out.println("Paths match!");
        else
            System.out.println("Paths do not match :(");




    }

    public static CostMatrix GenerateCircularGraphCostMatrix(int nodes, int radius )
    {
        CostMatrix matrix = new CostMatrix(nodes);
        matrix.createCircularMatrix(radius);
        return matrix;
    }
}

