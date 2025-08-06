package org.example;

public class GridSignalAnalyzer {
    // Mission Data: The Scrambled Communications Grid
    char[][] scrambledGrid = {
            {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
            {'A', 'L', 'P', 'H', 'A'},
            {'T', 'A', 'N', 'G', 'O', '7'},
            {'B', 'R', 'A', 'V', 'O'}
    };

    void analyzeWithForLoop() {
        for (int row = 0; row < scrambledGrid.length; row++) {
            for (int col = 0; col < scrambledGrid[row].length; col++) {
                char signal = scrambledGrid[row][col];
                System.out.print(signal + " ");
            }
            System.out.println();
        }
    }


    void analyzeWithForEachLoop() {
        for (char[] rowArray : scrambledGrid) {
            System.out.println("Processing Row with Hash: " + rowArray);
           for(char signal: rowArray){
               System.out.println("->" + signal);
           }
        }
    }

    void analyzeWithHybridLoop(){
        for (char [] rowArray: scrambledGrid){
            System.out.println();
            for (int i = 0; i< rowArray.length; i++){
                char signal = rowArray[i];
                System.out.print(signal + " ");
            }
        }
    }


    public static void main(String[] args) {
        GridSignalAnalyzer analyzer = new GridSignalAnalyzer();
        System.out.println("--- PHASE 2: STANDARD FOR-LOOP MANEUVER ---");
        analyzer.analyzeWithForLoop();

        System.out.println("\n--- PHASE 3: ADVANCED FOR-EACH SWEEP ---");
        analyzer.analyzeWithForEachLoop();

        System.out.println("\n--- PHASE 4: HYBRID LOOP APPROACH ---");
        analyzer.analyzeWithHybridLoop();
    }
}
