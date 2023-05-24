/**
 * Elia Phan
 * CS231 SP23 Project 2
 * LifeSimulation.java
 * last modified 2/19/2023
 *
 * How to run?
 * javac LifeSimulation.java
 * java LifeSimulation [number of steps] [number of row] [number of column] [initial chance]
 * for e.g.: java LifeSimulation 3 10 10 .25
 */

/**
 * PURPOSE:
 * Include a loop that calls Landscape.advance(), LandscapeDisplay.repaint(), and Thread.sleep(1000)
 * Each iteration of the loop is one time step of the simulation.
 */

public class LifeSimulation {

    /**
     * Include a loop that calls Landscape.advance(), LandscapeDisplay.repaint(), and Thread.sleep(250)
     * Each iteration of the loop is one time step of the simulation.
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        if (args.length < 4) {
            System.out.println("Command-line argument: [number of steps] [number of row] [number of column] [initial chance]");
        }
        else {
            int step = Integer.parseInt(args[0]);
            int row = Integer.parseInt(args[1]);
            int col = Integer.parseInt(args[2]);
            double chance = Double.parseDouble(args[3]);

            Landscape scape = new Landscape(row, col, chance);

            LandscapeDisplay display = new LandscapeDisplay(scape, 20);

            for (int i = 0 ; i < step; i++) {
                Thread.sleep(250);
                scape.advance();
                display.repaint();
            }

            int count = 0;
            for (int i = 0; i < scape.getRows(); i++) {
                for (int j = 0; j < scape.getCols(); j++) {
                    if (scape.getCell(i,j).getAlive() == true) {
                        count++;
                    }
                }
            }
            System.out.println("Number of living cells left: " + count);
        }
    }
}