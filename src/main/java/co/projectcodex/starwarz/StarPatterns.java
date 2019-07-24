package co.projectcodex.starwarz;

import java.io.ByteArrayOutputStream;

public class StarPatterns {

    /**
     *
     * line(4) prints * * * *
     *
     * line(7) prints * * * * * * *
     *
     *
     * @param size
     */

    public static void line(int size) {



        for (int i = 0; i<size;i++){

                System.out.print("* ");

        }


    }
    
    /**
     * Print a square of stars of a specified size
     *
     * squareStars(4) should print
     *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     *
     * or
     *
     * squareStars(7) should print
     *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     *
     * @param size
     */
    public static void squareStars(int size) {

        for (int i = 0; i<size;i++){

            for (int j = 0; j<size; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }


    /**
     *
     * triangleBottomBase(4)
     *
     * prints
     *
     * *
     * * *
     * * * *
     * * * * *
     *
     * triangleBottomBase(7)
     *
     * prints
     *
     *  *
     *  * *
     *  * * *
     *  * * * *
     *  * * * * *
     *  * * * * * *
     *  * * * * * * *
     *
     *
     *
     * @param size
     */
    public static void triangleBottomBase(int size) {

        for (int i = 0; i < size; i++) {

            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    /**
     * triangleTopBase(3)
     *
     * prints
     *
     * * * *
     * * *
     * *
     *
     * triangleTopBase(7)
     *
     * prints
     *
     *  * * * * * * *
     *  * * * * * *
     *  * * * * *
     *  * * * *
     *  * * *
     *  * *
     *  *
     *
     *
     * @param size
     */

    public static void triangleTopBase(int size) {

        for (int i = size; i >= 1; i--) {

            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    /**
     * emptySquare(4);
     *
     * prints
     *
     *  * * * *
     *  *     *
     *  *     *
     *  * * * *
     *
     *  emptySquare(7);
     *
     *  * * * * * * *
     *  *           *
     *  *           *
     *  *           *
     *  *           *
     *  *           *
     *  * * * * * * *
     *
     * @param size
     */
    public static void emptySquare(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {

//        squareStars(10);
//        squareStars(5);

//        triangleTopBase(10);
//        triangleBottomBase(7);

        //emptySquare(4);

//        emptySquare(15);


    }




}
