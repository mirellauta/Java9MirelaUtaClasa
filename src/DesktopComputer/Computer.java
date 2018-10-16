/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package DesktopComputer;

/**
 *
 * @author Mirela
 */
public abstract class Computer {

    /**
     * Enume with possible states.
     */
    public enum FunctionState {
        ON, OFF
    }
    /**
     * Hidden atributes of computer.
     */
    private FunctionState state;

    public void getState() {

        System.out.println("Computer is : " + state);

        if (state == FunctionState.OFF) {
            System.exit(0);
        }

    }

    public void setState(FunctionState state) {
        this.state = state;
    }

    /**
     * Method return the computed result
     *
     * @param x first number
     * @param y second number
     */
    public abstract void compute(double x, double y);

    public abstract void buildSetAndUse();

}