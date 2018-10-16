/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package DesktopComputer;

/**
 *
 * @author Mirela
 */
public class ComputerCase {

    /**
     * Enum with possible colors.
     */
    public enum Color {
        BLACK, WHITE, BLUE, RED, GREEN, GRAY
    }

    /**
     * Enum with possible materials used.
     */
    public enum Material {
        ALUMINIUM, PLASTIC
    }

    /**
     * Enum with possible states of case.
     */
    public enum RoutedState {
        ROUTED, NON_ROUTED
    }

    /**
     * Hidden atributes of desk computer case.
     */
    private Material materialCase;
    private Color colorCase;
    private RoutedState state;
    private String logo;
    private int length;
    private int width;
    private int height;


    /*get-ers and set-ers*/
    public Color getColorCase() {
        return colorCase;
    }

    public void setColorCase(Color colorCase) {
        this.colorCase = colorCase;
    }

    public Material getMaterialCase() {
        return materialCase;
    }

    public void setMaterialCase(Material materialCase) {
        this.materialCase = materialCase;
    }

    public RoutedState getState() {
        return state;
    }

    public void setState(RoutedState state) {
        this.state = state;
    }

    public void setLogo(String x) {
        this.logo = x;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}