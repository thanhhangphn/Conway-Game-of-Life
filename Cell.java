/**
 * Elia Phan
 * CS231 SP23 Project 2 EXTENSION
 * Cell.java
 * Outline by Colby College CS Department
 * last modified 2/19/2023
 */

import java.util.ArrayList;
import java.util.Random;

/**
 * PURPOSE:
 * The Cell class stores its alive state and methods
 */

public class Cell {

    /**
     * The status of the Cell.
     */
    private boolean alive;
    private int color;

    /**
     * Declare a new random object
     */
    Random rand = new Random();

    /**
     * Constructs a dead cell.
     */
    public Cell() {
        color = rand.nextInt(1,5);
        alive = false;
    }


    /**
     * Constructs a cell with the specified status.
     *
     * @param status a boolean to specify if the Cell is initially alive
     */
    public Cell(boolean status) {
        color = rand.nextInt(1,5);
        alive = status;
    }


    /**
     * Returns whether the cell is currently alive.
     *
     * @return whether the cell is currently alive
     */
    public boolean getAlive() {
        return alive;
    }


    /**
     * Sets the current status of the cell to the specified status.
     *
     * @param status a boolean to specify if the Cell is alive or dead
     */
    public void setAlive(boolean status) {
        alive = status;
    }


    /**
     * Returns whether the cell is currently alive.
     *
     * @return whether the cell is currently alive
     */
    public int getColor() {
        return color;
    }


    /**
     * Sets the current status of the cell to the specified status.
     *
     * @param status a boolean to specify if the Cell is alive or dead
     */
    public void setColor(int status) {
        color = status;
    }


    /**
     * Updates the state of the Cell.
     *
     * If this Cell is alive and if there are 2 or 3 alive neighbors,
     * this Cell stays alive. Otherwise, it dies.
     *
     * If this Cell is dead and there are 3 alive neighbors,
     * this Cell comes back to life. Otherwise, it stays dead.
     *
     * @param neighbors An ArrayList of Cells
     */
    public void updateState(ArrayList<Cell> neighbors) {
        int count = 0;
        ArrayList<Integer> colorCount = new ArrayList<Integer>();
        for (int i = 0; i < neighbors.size(); i++){
            if (neighbors.get(i).toString() == "1"){
                count++;
                colorCount.add(neighbors.get(i).getColor());
            }
        }

        if (this.alive == true){
            if (count != 2 && count != 3){
                this.setAlive(false);
            }
            else if (count == 2){
                if (colorCount.get(0) == colorCount.get(1)){
                    this.setColor(colorCount.get(0));
                }
            }
            else if (count == 3){
                if (colorCount.get(0) == colorCount.get(1) && colorCount.get(0) != colorCount.get(2)){
                    this.setColor(colorCount.get(0));
                }
                else if (colorCount.get(1) == colorCount.get(2) && colorCount.get(0) != colorCount.get(2)){
                    this.setColor(colorCount.get(1));
                }
                else if (colorCount.get(0) == colorCount.get(2) && colorCount.get(1) != colorCount.get(2)){
                    this.setColor(colorCount.get(0));
                }
                else if (colorCount.get(1) == colorCount.get(2) && colorCount.get(0) == colorCount.get(2)){
                    this.setColor(colorCount.get(1));
                }
            }
        }
        if (this.alive == false){
            if (count == 3){
                this.setAlive(true);
                if (colorCount.get(0) == colorCount.get(1) && colorCount.get(0) != colorCount.get(2)){
                    this.setColor(colorCount.get(0));
                }
                else if (colorCount.get(1) == colorCount.get(2) && colorCount.get(0) != colorCount.get(2)){
                    this.setColor(colorCount.get(1));
                }
                else if (colorCount.get(0) == colorCount.get(2) && colorCount.get(1) != colorCount.get(2)){
                    this.setColor(colorCount.get(0));
                }
                else if (colorCount.get(1) == colorCount.get(2) && colorCount.get(0) == colorCount.get(2)){
                    this.setColor(colorCount.get(1));
                }
            }
        }

    }


    /**
     * Returns a String representation of this Cell.
     *
     * @return 1 if this Cell is alive, otherwise 0.
     */
    public String toString() {
        String output = "1";
        if (alive == true) {
            ;
        } else if (alive == false) {
            output = "0";
        }
        return output;
    }


    /**
     * Test the implementation of all methods.
     */
    public static void main(String[] args) {
        Cell cell1 = new Cell();
        Cell cell2 = new Cell(false);
        System.out.println(cell1.getAlive());
        cell2.setAlive(true);
        System.out.print(cell1);
    }
}
