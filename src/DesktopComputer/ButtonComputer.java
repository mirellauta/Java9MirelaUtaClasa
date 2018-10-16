/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package DesktopComputer;

/**
 *
 * @author Mirela
 */
public class ButtonComputer {
     /**
     * Constructor
     *
     * @param name is the name of button
     */
    public ButtonComputer(String name) {
        this.name = name;
    }

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
        ALUMINIUM, PLASTIC, GLASS, EBONITE, PLEXIGLASS
    }

    String name;
    Material materialButton;
    Color colorButton;
    int diameter;

    /*get-ers and set-ers*/
    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterialButton() {
        return materialButton;
    }

    public void setMaterialButton(Material materialButton) {
        this.materialButton = materialButton;
    }

    public Color getColorButton() {
        return colorButton;
    }

    public void setColorButton(Color colorButton) {
        this.colorButton = colorButton;
    }



    public void pushed(String x) {
        System.out.println("Button " + x + " was pushed");
    }

}
