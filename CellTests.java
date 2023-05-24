/*
file name:      CellTests.java
Authors:        Max Bender & Naser Al Madi
last modified:  9/18/2022
*/

import java.util.ArrayList;


/**
 * PURPOSE:
 * Test methods of the Cell class
 */

public class CellTests {

    public static void cellTests() {

        // case 1: testing Cell() and Cell(Bool)
        {
            // set up
            Cell c1 = new Cell();
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(false);

            // verify
            System.out.println(c1 + " == 0 Case 1");
            System.out.println(c2 + " == 1 Case 1");
            System.out.println(c3 + " == 0 Case 1");

            // test
            assert c1 != null : "Case 1 Error in Cell::Cell()";
            assert c2 != null : "Case 1 Error in Cell::Cell(bool)";
            assert c3 != null : "Case 1 Error in Cell::Cell(bool)";
        }

        // case 2: testing getAlive()
        {
            // set up
            Cell c1 = new Cell();
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(false);

            // verify
            System.out.println(c1.getAlive() + " == false Case 2");
            System.out.println(c2.getAlive() + " == true Case 2");
            System.out.println(c3.getAlive() + " == false Case 2");

            // test
            assert c1.getAlive() == false : "Case 2 Error in Cell::Cell() or Cell::getValue()";
            assert c2.getAlive() == true : "Case 2 in Cell::Cell() or Cell::getValue()";
            assert c3.getAlive() == false : "Case 2 Error in Cell::Cell() or Cell::getValue()";
        }

        // case 3: testing setAlive()
        {
            // set up
            Cell c1 = new Cell();
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(false);

            c1.setAlive(true);
            c2.setAlive(false);
            c3.setAlive(true);

            // verify
            System.out.println(c1.getAlive() + " == true Case 3");
            System.out.println(c2.getAlive() + " == false Case 3");
            System.out.println(c3.getAlive() + " == true Case 3");

            // test
            assert c1.getAlive() == true : "Case 3 Error in Cell::getAlive() or Cell::setAlive()";
            assert c2.getAlive() == false : "Case 3 Error in Cell::getAlive() or Cell::setAlive()";
            assert c3.getAlive() == true : "Case 3 Error in Cell::getAlive() or Cell::setAlive()";
        }

        // case 4: testing updateState()
        {
            // set up
            Cell c1 = new Cell(true);
            Cell c2 = new Cell(false);
            Cell c3 = new Cell(false);
            Cell c4 = new Cell(false);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            c1.updateState(neighbors);

            // verify
            System.out.println(c1.getAlive() + " == false Case 4");

            // test
            assert c1.getAlive() == false : "Case 4 Error in Cell::updateState()";
        }

        // case 5: testing updateState()
        {
            // set up
            Cell c1 = new Cell(true);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(false);
            Cell c4 = new Cell(false);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            c1.updateState(neighbors);

            // verify
            System.out.println(c1.getAlive() + " == false Case 5");

            // test
            assert c1.getAlive() == false : "Case 5 Error in Cell::updateState()";
        }

        // case 6: testing updateState()
        {
            // set up
            Cell c1 = new Cell(true);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(true);
            Cell c4 = new Cell(false);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            c1.updateState(neighbors);

            // verify
            System.out.println(c1.getAlive() + " == true Case 6");

            // test
            assert c1.getAlive() == true : "Case 6 Error in Cell::updateState()";
        }

        // case 7: testing updateState()
        {
            // set up
            Cell c1 = new Cell(true);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(true);
            Cell c4 = new Cell(true);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            c1.updateState(neighbors);

            // verify
            System.out.println(c1.getAlive() + " == true Case 7");

            // test
            assert c1.getAlive() == true : "Case 7 Error in Cell::updateState()";
        }

        // case 8: testing updateState()
        {
            // set up
            Cell c1 = new Cell(true);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(true);
            Cell c4 = new Cell(true);
            Cell c5 = new Cell(true);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            c1.updateState(neighbors);

            // verify
            System.out.println(c1.getAlive() + " == false Case 8");

            // test
            assert c1.getAlive() == false : "Case 8 Error in Cell::updateState()";
        }

        // case 9: testing updateState()
        {
            // set up
            Cell c1 = new Cell(false);
            Cell c2 = new Cell(false);
            Cell c3 = new Cell(false);
            Cell c4 = new Cell(false);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            c1.updateState(neighbors);

            // verify
            System.out.println(c1.getAlive() + " == false Case 9");

            // test
            assert c1.getAlive() == false : "Case 9 Error in Cell::updateState()";
        }

        // case 10: testing updateState()
        {
            // set up
            Cell c1 = new Cell(false);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(false);
            Cell c4 = new Cell(false);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            c1.updateState(neighbors);

            // verify
            System.out.println(c1.getAlive() + " == false Case 10");

            // test
            assert c1.getAlive() == false : "Case 10 Error in Cell::updateState()";
        }

        // case 11: testing updateState()
        {
            // set up
            Cell c1 = new Cell(false);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(true);
            Cell c4 = new Cell(false);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            c1.updateState(neighbors);

            // verify
            System.out.println(c1.getAlive() + " == false Case 11");

            // test
            assert c1.getAlive() == false : "Case 11 Error in Cell::updateState()";
        }

        // case 12: testing updateState()
        {
            // set up
            Cell c1 = new Cell(false);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(true);
            Cell c4 = new Cell(true);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            c1.updateState(neighbors);

            // verify
            System.out.println(c1.getAlive() + " == true Case 12");                 //TODO

            // test
            assert c1.getAlive() == true : "Case 12 Error in Cell::updateState()";
        }

        // case 13: testing updateState()
        {
            // set up
            Cell c1 = new Cell(false);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(true);
            Cell c4 = new Cell(true);
            Cell c5 = new Cell(true);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            c1.updateState(neighbors);

            // verify
            System.out.println(c1.getAlive() + " == false Case 13");

            // test
            assert c1.getAlive() == false : "Case 13 Error in Cell::updateState()";
        }

        // no test for toString(), students could format string differently

        System.out.println("*** Done testing Cell! ***\n");
    }


    public static void main(String[] args) {
        cellTests();
    }
}