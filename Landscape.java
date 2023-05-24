/**
 * Elia Phan
 * CS231 SP23 Project 2 EXTENSION
 * Landscape.java
 * Outline by Colby College CS Department
 * last modified 2/19/2023
 */


import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

/**
 * PURPOSE:
 * The Landscape class has a field to hold the array of Cell object references and its methods
 */


public class Landscape {

    /**
     * The underlying grid of Cells for Conway's Game
     */
    private Cell[][] landscape;


    /**
     * The original probability each individual Cell is alive
     */
    private double initialChance = 0;


    /**
     * Constructs a Landscape of the specified number of rows and columns.
     * All Cells are initially dead.
     *
     * @param rows    the number of rows in the Landscape
     * @param columns the number of columns in the Landscape
     */
    public Landscape(int rows, int columns) {
        landscape = new Cell[rows][columns];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getCols(); j++) {
                landscape[i][j] = new Cell();
            }
        }
        reset();
    }


    /**
     * Constructs a Landscape of the specified number of rows and columns.
     * Each Cell is initially alive with probability specified by chance.
     *
     * @param rows    the number of rows in the Landscape
     * @param columns the number of columns in the Landscape
     * @param chance  the probability each individual Cell is initially alive
     */
    public Landscape(int rows, int columns, double chance) {
        initialChance = chance;
        landscape = new Cell[rows][columns];
        Random rand = new Random(); //Declare a Random object
        boolean status;
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getCols(); j++) {
                double randomNumber = rand.nextDouble();
                if (randomNumber <= initialChance){
                    status = true;
                }
                else {
                    status = false;
                }
                landscape[i][j] = new Cell(status);
            }
        }
    }


    /**
     * Recreates the Landscape according to the specifications given
     * in its initial construction.
     */
    public void reset() {
        landscape = new Cell[this.getRows()][this.getCols()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getCols(); j++) {
                landscape[i][j] = new Cell();
            }
        }
    }


    /**
     * Returns the number of rows in the Landscape.
     *
     * @return the number of rows in the Landscape
     */
    public int getRows() {
        return landscape.length;
    }


    /**
     * Returns the number of columns in the Landscape.
     *
     * @return the number of columns in the Landscape
     */
    public int getCols(){
        return landscape[0].length;
    }


    /**
     * Returns the Cell specified the given row and column.
     *
     * @param row the row of the desired Cell
     * @param col the column of the desired Cell
     * @return the Cell specified the given row and column
     */
    public Cell getCell(int row, int col) {
        return landscape[row][col];
    }


    /**
     * Returns a String representation of the Landscape.
     */
    public String toString() {
        String output = "";
        for (int i = 0; i < this.getRows(); i++){
            for (int j = 0; j < this.getCols(); j++){
                output += this.getCell(i, j) + " ";
            }
            output += "\n";
        }
        return output;
    }


    /**
     * Returns an ArrayList of the neighboring Cells to the specified location.
     *
     * @param row the row of the specified Cell
     * @param col the column of the specified Cell
     * @return an ArrayList of the neighboring Cells to the specified location
     */
    public ArrayList<Cell> getNeighbors(int row, int col) {
        ArrayList<Cell> output = new ArrayList<>();
        if (row > 0){
            if (col < this.getCols()-1){
                output.add(getCell(row-1, col+1));
            }
            if (col > 0){
                output.add(getCell(row-1, col-1));
            }
            output.add(getCell(row-1, col+0));
        }
        if (row < this.getRows()-1){
            if (col > 0){
                output.add(getCell(row+1, col-1));
            }
            if (col < this.getCols()-1){
                output.add(getCell(row+1, col+1));
            }
            output.add(getCell(row+1, col+0));
        }
        if (col < this.getCols()-1){
            output.add(getCell(row+0, col+1));
        }
        if (col > 0){
            output.add(getCell(row+0, col-1));
        }

        return output;
    }


    /**
     * Advances the current Landscape by one step.
     */
    public void advance() {
        Cell[][] temp = new Cell[this.getRows()][this.getCols()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getCols(); j++) {
                temp[i][j] = new Cell();
                temp[i][j].setAlive(this.getCell(i,j).getAlive());
                temp[i][j].updateState(this.getNeighbors(i, j));
            }
        }
        this.landscape = temp;
    }


    /**
     * Draws the Cell to the given Graphics object at the specified scale.
     * An alive Cell is drawn with a black color; a dead Cell is drawn gray.
     *
     * @param g     the Graphics object on which to draw
     * @param scale the scale of the representation of this Cell
     */
    public void draw(Graphics g, int scale) {
        for (int x = 0; x < getRows(); x++) {
            for (int y = 0; y < getCols(); y++) {
                if (getCell(x,y).getColor() == 1){
                    g.setColor(getCell(x, y).getAlive() ? Color.BLACK : Color.gray);
                }
                if (getCell(x,y).getColor() == 2){
                    g.setColor(getCell(x, y).getAlive() ? Color.PINK : Color.gray);
                }
                if (getCell(x,y).getColor() == 3){
                    g.setColor(getCell(x, y).getAlive() ? Color.BLUE : Color.gray);
                }
                if (getCell(x,y).getColor() == 4){
                    g.setColor(getCell(x, y).getAlive() ? Color.GREEN : Color.gray);
                }
                g.fillOval(x * scale, y * scale, scale, scale);
            }
        }
    }


    /**
     * Test the implementation of all methods.
     */
    public static void main(String[] args) {
        Landscape ls = new Landscape(10,10, .5);
        for (int i = 0; i < ls.getRows(); i++){
            for (int j = 0; j < ls.getCols(); j++){
            }
        }
        System.out.println("Number of columns: " + ls.getCols());
        System.out.println("Number of rows: " + ls.getRows());
        System.out.println("Status of cell at row 0 col 1: " + ls.getCell(0,1));
        System.out.println("Its neighbors: " + ls.getNeighbors(0,0));
        System.out.println("Landscape: \n" + ls);
        ls.advance();
        System.out.println("\n Landscape after advance(): \n" + ls);
    }
}