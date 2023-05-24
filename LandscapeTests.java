/**
 * Elia Phan
 * CS231 SP23 Project 2
 * LandscapeTests.java
 * Outline by Prof. Max Bender & Naser Al Madi Colby College
 * last modified 2/19/2023
 */

import java.util.ArrayList;

/**
 * PURPOSE:
 * Test methods of the Landscape class
 */

public class LandscapeTests {

    public static void landscapeTests() {

        // case 1: testing Landscape(int, int)
        {
            // set up
            Landscape l1 = new Landscape(2, 4);
            Landscape l2 = new Landscape(10, 10);

            // verify
            System.out.println(l1);
            System.out.println("\n");
            System.out.println(l2);

            // test
            assert l1 != null : "Error in Landscape::Landscape(int, int)";
            assert l2 != null : "Error in Landscape::Landscape(int, int)";
        }

        // case 2: testing reset()
        {
            // set up
            Landscape l1 = new Landscape(2, 4);
            Landscape l2 = new Landscape(10, 10);

            l1.reset();
            l2.reset();

            // verify
            System.out.println(l1);
            System.out.println("\n");
            System.out.println(l2);

            // test
            assert l1 != null : "Error in Landscape::reset()";
            assert l2 != null : "Error in Landscape::reset()";
        }

        // case 3: testing getRows()
        {
            // set up
            Landscape l1 = new Landscape(2, 4);
            Landscape l2 = new Landscape(10, 10);

            // verify
            System.out.println(l1.getRows());
            System.out.println(l2.getRows());

            // test
            assert l1.getRows() == 2 : "Error in Landscape::getRows()";
            assert l2.getRows() == 10 : "Error in Landscape::getRows()";
        }

        // case 4: testing getCols()
        {
            // set up
            Landscape l1 = new Landscape(2, 4);
            Landscape l2 = new Landscape(10, 10);

            // verify
            System.out.println(l1.getCols());
            System.out.println(l2.getCols());

            // test
            assert l1.getCols() == 4 : "Error in Landscape::getCols()";
            assert l2.getCols() == 10 : "Error in Landscape::getCols()";
        }

        // case 5: testing getCell(int, int)
        {
            // set up
            Landscape l1 = new Landscape(2, 4);
            Landscape l2 = new Landscape(10, 10);

            // verify
            System.out.println(l1.getCell(1,2));
            System.out.println(l2.getCell(1,2));

            // test
            assert l1.getCell(1,2) instanceof Cell : "Error in Landscape::getCell(int, int)";
            assert l2.getCell(1,2) instanceof Cell : "Error in Landscape::getCell(int, int)";
        }

        // case 6: testing getNeighbors()
        {
            // set up
            Landscape l1 = new Landscape(2, 4);
            Landscape l2 = new Landscape(10, 10);

            // verify
            System.out.println(l1.getNeighbors(1,2));
            System.out.println(l2.getNeighbors(1,2));

            // test
            assert l1.getNeighbors(1,2) instanceof ArrayList<Cell> : "Error in Landscape::getNeighbors(int, int)";
            assert l2.getNeighbors(1,2) instanceof ArrayList<Cell> : "Error in Landscape::getNeighbors(int, int)";
        }

        // case 7: testing advance()
        {
            // set up
            Landscape l1 = new Landscape(2, 4);
            Landscape l2 = new Landscape(10, 10);
            Landscape l1Test = l1;
            Landscape l2Test = l2;

            l1Test.advance();
            l2Test.advance();

            // verify
            System.out.println(l1 + "\n" + l1Test);
            System.out.println(l2 + "\n" + l2Test);

            // test
            assert l1 != l1Test: "Error in Landscape::advance()";
            assert l2 != l2Test: "Error in Landscape::advance()";
        }
        System.out.println("*** Done testing Cell! ***\n");
    }

    public static void main(String[] args) {
        landscapeTests();
    }
}