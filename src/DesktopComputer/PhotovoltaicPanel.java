/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package DesktopComputer;

/**
 *
 * @author Mirela
 */
public class PhotovoltaicPanel {
/**
     * Enum with possible materials used.
     */
    public enum Material {
        SEMI_CONDUCTOR, CONDUCTOR
    }

    /**
     * Enum with possible colors of photovoltaic panel.
     */
    public enum Color {
        BLACK, BROWN, BLUE
    }

    /**
     * Hidden atributes of photovoltaic panel.
     */
    private double power;
    private double voltage;
    private double intensity;
    private int length;
    private int width;
    private int area;
    private Color colorPanel;
    private Material materialPanel;

    /*get-ers and set-ers*/
    public Color getColorPanel() {
        return colorPanel;
    }

    public void setColorPanel(Color colorPanel) {
        this.colorPanel = colorPanel;
    }

    public Material getMaterialPanel() {
        return materialPanel;
    }

    public void setMaterialPanel(Material materialPanel) {
        this.materialPanel = materialPanel;
    }

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

    public int getArea() {
        return area;
    }

    public void setArea() {
        this.area = length * width;
    }

    public double getPower() {
        return power;
    }

    public void setPower() {
        this.power = voltage * intensity;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage() {
        this.voltage = area * 0.05 / 100;
    }

    public double getIntensity() {
        return intensity;
    }

    public void setIntensity() {
        this.intensity = area * 18 / 100;
    }

}
