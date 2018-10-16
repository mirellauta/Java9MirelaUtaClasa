/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package DesktopComputer;

/**
 *
 * @author Mirela
 */
public class Display {

    /**
     * Enum with possible materials used.
     */
    public enum Material {
        PLEXIGLASS, GLASS, PLASTIC
    }

    /**
     * Hidden atributes of display.
     */
    private String principalDisplay;
    private String firstSecondaryDisplay;
    private String secondSecondaryDisplay;
    private String thirdSecondaryDisplay;
    private Material materialDisplay;
    private int length;
    private int width;

    /*get-ers and set-ers*/
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getPrincipalDisplay() {
        return principalDisplay;
    }

    public void setPrincipalDisplay(String principalDisplay) {
        this.principalDisplay = principalDisplay;
    }

    public String getFirstSecondaryDisplay() {
        return firstSecondaryDisplay;
    }

    public void setFirstSecondaryDisplay(String firstSecondaryDisplay) {
        this.firstSecondaryDisplay = firstSecondaryDisplay;
    }

    public String getSecondSecondaryDisplay() {
        return secondSecondaryDisplay;
    }

    public void setSecondSecondaryDisplay(String secondSecondaryDisplay) {
        this.secondSecondaryDisplay = secondSecondaryDisplay;
    }

    public String getThirdSecondaryDisplay() {
        return thirdSecondaryDisplay;
    }

    public void setThirdSecondaryDisplay(String thirdSecondaryDisplay) {
        this.thirdSecondaryDisplay = thirdSecondaryDisplay;
    }

    public Material getMaterialDisplay() {
        return materialDisplay;
    }

    public void setMaterialDisplay(Material materialDisplay) {
        this.materialDisplay = materialDisplay;
    }

}