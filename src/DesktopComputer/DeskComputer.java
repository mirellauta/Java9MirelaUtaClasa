/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package DesktopComputer;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Mirela
 */
public class DeskComputer extends Computer {

    /**
     * Hidden atributes of desk computer.
     */
    double result;
    double number1;
    double number2;
    String operator;
    String sign;
    String flag;

    /*get-ers and set-ers*/
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator() {
        read();
    }

    public void setOperator(String x) {
        this.operator = x;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1() {
        read();
    }

    public void setNumber1(double x) {
        this.number1 = x;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2() {
        read();
    }

    public void setNumber2(double x) {
        this.number2 = x;
    }

    //Create nested class
    private static class Battery {

        /**
         * Enum with possible battery states of charge.
         */
        private enum ChargeState {

            CHARGED, NOT_CHARGED
        }

        /**
         * Hiddent atributes of battery.
         */
        private ChargeState batteryState;
        private int chargedValue;
        private double diameter;

        /*get-ers and set-ers*/
        public double getDiameter() {
            return diameter;
        }

        public void setDiameter(double diameter) {
            this.diameter = diameter;
        }

        public int getChargedValue() {
            return chargedValue;
        }

        public void setChargedValue(int chargedValue) {
            this.chargedValue = chargedValue;
        }

        private ChargeState getBatteryState() {
            return batteryState;
        }

        protected void setBatteryState(ChargeState batteryState) {
            this.batteryState = batteryState;
        }

    }

    private static class Motherboard {

        /**
         * Enum with possible colors for motherboard.
         */
        public enum Color {
            BLACK, WHITE, BLUE, RED, GREEN, GRAY
        }

        /**
         * Enum with possible materials used.
         */
        public enum Material {
            EBONITE, PLEXICGLASS,
        }

        private Material motherboardMaterial;
        private Color motherboardColor;
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

        public Material getMotherboardMaterial() {
            return motherboardMaterial;
        }

        public void setMotherboardMaterial(Material motherboardMaterial) {
            this.motherboardMaterial = motherboardMaterial;
        }

        public Color getMotherboardColor() {
            return motherboardColor;
        }

        public void setMotherboardColor(Color motherboardColor) {
            this.motherboardColor = motherboardColor;
        }

        /**
         * This method add buttons to motherboard.
         *
         * @param x is the name of the button to be added
         */
        private void add(ButtonComputer x) {

        }

        /**
         * This method add the display to motherboard.
         *
         * @param x is the name of display to be added
         */
        private void add(Display x) {
        }

        /**
         * This method add photovoltaic panel to motherboard.
         *
         * @param x is the name of photovoltaic panel to be added
         */
        private void add(PhotovoltaicPanel x) {
        }

        /**
         * This method add battery to motherboard.
         *
         * @param x is the name of battery to be added
         */
        private void add(Battery x) {
        }

        /**
         * This method add the case to motherboard.
         *
         * @param x is the name of case to be added
         */
        private void add(ComputerCase x) {
        }

    }

    //Create all components
    Battery battery = new Battery();
    Motherboard motherboard = new Motherboard();
    ComputerCase computerDeskCase = new ComputerCase();
    PhotovoltaicPanel photovoltaicPanel = new PhotovoltaicPanel();
    Display display = new Display();
    ButtonComputer buttonZero = new ButtonComputer("0");
    ButtonComputer buttonOne = new ButtonComputer("1");
    ButtonComputer buttonTwo = new ButtonComputer("2");
    ButtonComputer buttonThree = new ButtonComputer("3");
    ButtonComputer buttonFour = new ButtonComputer("4");
    ButtonComputer buttonFive = new ButtonComputer("5");
    ButtonComputer buttonSix = new ButtonComputer("6");
    ButtonComputer buttonSeven = new ButtonComputer("7");
    ButtonComputer buttonEight = new ButtonComputer("8");
    ButtonComputer buttonNine = new ButtonComputer("9");
    ButtonComputer buttonDot = new ButtonComputer(".");
    ButtonComputer buttonClear = new ButtonComputer("CE");
    ButtonComputer buttonEqual = new ButtonComputer("=");
    ButtonComputer buttonMul = new ButtonComputer("x");
    ButtonComputer buttonDiv = new ButtonComputer("/");
    ButtonComputer buttonPlus = new ButtonComputer("+");
    ButtonComputer buttonMinus = new ButtonComputer("-");
    ButtonComputer buttonPercent = new ButtonComputer("\u0025");
    ButtonComputer buttonSquareRoot = new ButtonComputer("\u221A");
    ButtonComputer buttonOnC = new ButtonComputer("on/c");
    ButtonComputer buttonOff = new ButtonComputer("off");
    ButtonComputer buttonMrc = new ButtonComputer("MRC");
    ButtonComputer buttonMminus = new ButtonComputer("M-");
    ButtonComputer buttonMplus = new ButtonComputer("M+");

    public void setComponents() {

        //set all caracteristics for motherboard
        motherboard.setMotherboardColor(Motherboard.Color.GREEN);
        motherboard.setMotherboardMaterial(Motherboard.Material.EBONITE);
        motherboard.setLength(82);
        motherboard.setWidth(50);

        //set all display caracteristics
        display.setPrincipalDisplay("");
        display.setFirstSecondaryDisplay("");
        display.setSecondSecondaryDisplay("");
        display.setThirdSecondaryDisplay("");
        display.setMaterialDisplay(Display.Material.PLASTIC);
        display.setLength(37);
        display.setWidth(13);

        //set all battery caracteristics
        battery.setBatteryState(Battery.ChargeState.CHARGED);
        battery.setChargedValue(80);
        battery.setDiameter(11.6);

        //set all caracteristics for photovoltaic panel
        photovoltaicPanel.setLength(28);
        photovoltaicPanel.setWidth(4);
        photovoltaicPanel.setArea();
        photovoltaicPanel.setIntensity();
        photovoltaicPanel.setVoltage();
        photovoltaicPanel.setPower();
        photovoltaicPanel.setMaterialPanel(PhotovoltaicPanel.Material.SEMI_CONDUCTOR);
        photovoltaicPanel.setColorPanel(PhotovoltaicPanel.Color.BROWN);

        //set all caracteristics for desk computer case
        computerDeskCase.setMaterialCase(ComputerCase.Material.ALUMINIUM);
        computerDeskCase.setColorCase(ComputerCase.Color.GRAY);
        computerDeskCase.setLength(86);
        computerDeskCase.setWidth(53);
        computerDeskCase.setHeight(4);
        computerDeskCase.setState(ComputerCase.RoutedState.ROUTED);
        computerDeskCase.setLogo("ADDEX");

        //set all buttons
        buttonSeven.setColorButton(ButtonComputer.Color.BLACK);
        buttonSeven.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonSeven.setDiameter(6);

        buttonEight.setColorButton(ButtonComputer.Color.BLACK);
        buttonEight.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonEight.setDiameter(6);

        buttonNine.setColorButton(ButtonComputer.Color.BLACK);
        buttonNine.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonNine.setDiameter(6);

        buttonDiv.setColorButton(ButtonComputer.Color.RED);
        buttonDiv.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonDiv.setDiameter(6);

        buttonFour.setColorButton(ButtonComputer.Color.BLACK);
        buttonFour.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonFour.setDiameter(6);

        buttonFive.setColorButton(ButtonComputer.Color.BLACK);
        buttonFive.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonFive.setDiameter(6);

        buttonSix.setColorButton(ButtonComputer.Color.BLACK);
        buttonSix.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonSix.setDiameter(6);

        buttonMul.setColorButton(ButtonComputer.Color.RED);
        buttonMul.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonMul.setDiameter(6);

        buttonOne.setColorButton(ButtonComputer.Color.BLACK);
        buttonOne.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonOne.setDiameter(6);

        buttonTwo.setColorButton(ButtonComputer.Color.BLACK);
        buttonTwo.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonTwo.setDiameter(6);

        buttonThree.setColorButton(ButtonComputer.Color.BLACK);
        buttonThree.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonThree.setDiameter(6);

        buttonMinus.setColorButton(ButtonComputer.Color.RED);
        buttonMinus.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonMinus.setDiameter(6);

        buttonZero.setColorButton(ButtonComputer.Color.BLACK);
        buttonZero.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonZero.setDiameter(6);

        buttonDot.setColorButton(ButtonComputer.Color.BLACK);
        buttonDot.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonDot.setDiameter(6);

        buttonEqual.setColorButton(ButtonComputer.Color.BLACK);
        buttonEqual.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonEqual.setDiameter(6);

        buttonPlus.setColorButton(ButtonComputer.Color.RED);
        buttonPlus.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonPlus.setDiameter(6);

        buttonOnC.setColorButton(ButtonComputer.Color.RED);
        buttonOnC.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonOnC.setDiameter(5);

        buttonOff.setColorButton(ButtonComputer.Color.BLACK);
        buttonOff.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonOff.setDiameter(5);

        buttonPercent.setColorButton(ButtonComputer.Color.BLACK);
        buttonPercent.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonPercent.setDiameter(5);

        buttonSquareRoot.setColorButton(ButtonComputer.Color.BLACK);
        buttonSquareRoot.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonSquareRoot.setDiameter(5);

        buttonClear.setColorButton(ButtonComputer.Color.RED);
        buttonClear.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonClear.setDiameter(5);

        buttonMrc.setColorButton(ButtonComputer.Color.BLACK);
        buttonMrc.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonMrc.setDiameter(5);

        buttonMminus.setColorButton(ButtonComputer.Color.BLACK);
        buttonMminus.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonMminus.setDiameter(5);

        buttonMplus.setColorButton(ButtonComputer.Color.BLACK);
        buttonMplus.setMaterialButton(ButtonComputer.Material.ALUMINIUM);
        buttonMplus.setDiameter(5);

        System.out.println("-----All components caracteristics have been set-------");
        System.out.println();

    }

    public void deviceAssembly() {

        motherboard.add(display);
        motherboard.add(photovoltaicPanel);
        motherboard.add(battery);
        motherboard.add(buttonSeven);
        motherboard.add(buttonEight);
        motherboard.add(buttonNine);
        motherboard.add(buttonDiv);
        motherboard.add(buttonFour);
        motherboard.add(buttonFive);
        motherboard.add(buttonSix);
        motherboard.add(buttonMul);
        motherboard.add(buttonOne);
        motherboard.add(buttonTwo);
        motherboard.add(buttonThree);
        motherboard.add(buttonMinus);
        motherboard.add(buttonZero);
        motherboard.add(buttonDot);
        motherboard.add(buttonEqual);
        motherboard.add(buttonPlus);
        motherboard.add(buttonOnC);
        motherboard.add(buttonOff);
        motherboard.add(buttonPercent);
        motherboard.add(buttonSquareRoot);
        motherboard.add(buttonClear);
        motherboard.add(buttonMrc);
        motherboard.add(buttonMminus);
        motherboard.add(buttonMplus);
        motherboard.add(computerDeskCase);

        System.out.println("----------The device was assembled------------");
        System.out.println();

    }

    public void start() {
        System.out.println("You want to use the desk computer? Type yes or no.");
        Scanner input = new Scanner(System.in);
        switch (input.next()) {

            case "yes":
                buttonOnC.pushed(buttonOnC.getName());
                display.setPrincipalDisplay("0");
                display.setFirstSecondaryDisplay("");
                display.setSecondSecondaryDisplay("");
                display.setThirdSecondaryDisplay("");
                setSign("");
                System.out.println("The principal display show: "
                        + display.getPrincipalDisplay());
                System.out.println("The secondary displays show nothing ");

                System.out.println();
                break;

            case "no":
                System.exit(0);
                break;

            default:
                System.err.println("Sorry, you introduced wrong data. I quit :)");
                System.exit(0);

        }
        setFlag("number");

    }

    public void read() {
        Scanner input = new Scanner(System.in);
        switch (getFlag()) {
            case "number":
                display.setPrincipalDisplay("");
                display.setFirstSecondaryDisplay("");
                display.setSecondSecondaryDisplay("");
                display.setThirdSecondaryDisplay("");

                if (input.hasNextDouble()) {

                    double j = input.nextDouble();
                    setFlag("string");

                    if (getOperator() == null) {
                        this.number1 = j;
                    } else {
                        this.number2 = j;
                    }

                    DecimalFormat deNumber = new DecimalFormat("0.############");
                    String Number = deNumber.format(j);

                    int i;

                    for (i = 0; i < Number.length(); i++) {

                        char character = Number.charAt(i);
                        String characterToString = Character.toString(character);

                        switch (characterToString) {

                            case "0":
                                buttonZero.pushed(buttonZero.getName());
                                display.setPrincipalDisplay(display.getPrincipalDisplay()
                                        + buttonZero.getName());
                                System.out.println("The principal display show: "
                                        + display.getPrincipalDisplay());
                                System.out.println("The secondary displays show nothing");

                                break;

                            case "1":
                                buttonOne.pushed(buttonOne.getName());
                                display.setPrincipalDisplay(display.getPrincipalDisplay()
                                        + buttonOne.getName());
                                System.out.println("The principal display show: "
                                        + display.getPrincipalDisplay());
                                System.out.println("The secondary displays show nothing");
                                break;

                            case "2":
                                buttonTwo.pushed(buttonTwo.getName());
                                display.setPrincipalDisplay(display.getPrincipalDisplay()
                                        + buttonTwo.getName());
                                System.out.println("The principal display show: "
                                        + display.getPrincipalDisplay());
                                System.out.println("The secondary displays show nothing");
                                break;

                            case "3":
                                buttonThree.pushed(buttonThree.getName());
                                display.setPrincipalDisplay(display.getPrincipalDisplay()
                                        + buttonThree.getName());
                                System.out.println("The principal display show: "
                                        + display.getPrincipalDisplay());
                                System.out.println("The secondary displays show nothing");
                                break;

                            case "4":
                                buttonFour.pushed(buttonFour.getName());
                                display.setPrincipalDisplay(display.getPrincipalDisplay()
                                        + buttonFour.getName());
                                System.out.println("The principal display show: "
                                        + display.getPrincipalDisplay());
                                System.out.println("The secondary displays show nothing");
                                break;

                            case "5":
                                buttonFive.pushed(buttonFive.getName());
                                display.setPrincipalDisplay(display.getPrincipalDisplay()
                                        + buttonFive.getName());
                                System.out.println("The principal display show: "
                                        + display.getPrincipalDisplay());
                                System.out.println("The secondary displays show nothing");
                                break;

                            case "6":
                                buttonSix.pushed(buttonSix.getName());
                                display.setPrincipalDisplay(display.getPrincipalDisplay()
                                        + buttonSix.getName());
                                System.out.println("The principal display show: "
                                        + display.getPrincipalDisplay());
                                System.out.println("The secondary displays show nothing");
                                break;

                            case "7":
                                buttonSeven.pushed(buttonSeven.getName());
                                display.setPrincipalDisplay(display.getPrincipalDisplay()
                                        + buttonSeven.getName());
                                System.out.println("The principal display show: "
                                        + display.getPrincipalDisplay());
                                System.out.println("The secondary displays show nothing");
                                break;

                            case "8":
                                buttonEight.pushed(buttonEight.getName());
                                display.setPrincipalDisplay(display.getPrincipalDisplay()
                                        + buttonEight.getName());
                                System.out.println("The principal display show: "
                                        + display.getPrincipalDisplay());
                                System.out.println("The secondary displays show nothing");
                                break;

                            case "9":
                                buttonNine.pushed(buttonNine.getName());
                                display.setPrincipalDisplay(display.getPrincipalDisplay()
                                        + buttonNine.getName());
                                System.out.println("The principal display show: "
                                        + display.getPrincipalDisplay());
                                System.out.println("The secondary displays show nothing");
                                break;

                            case ".":
                                buttonDot.pushed(buttonDot.getName());
                                display.setPrincipalDisplay(display.getPrincipalDisplay()
                                        + buttonDot.getName());
                                break;

                            case "-":
                                buttonMinus.pushed(buttonMinus.getName());
                                setSign("-Minus");
                                break;

                        }
                    }

                    System.out.println();

                } else {
                    System.err.println("Sorry, you introduced wrong data. I quit :)");
                    System.exit(0);
                }
                break;

            case "string":
                String j = input.next();

                if (getOperator() == null) {

                    if ((!"*".equals(j)) && (!"/".equals(j)) && (!"+".equals(j))
                            && (!"-".equals(j))) {

                        System.err.println("Sorry, you introduced wrong data. I quit :)");
                        System.exit(0);

                    } else {

                        this.operator = j;
                        setFlag("number");

                        switch (j) {

                            case "*":
                                buttonMul.pushed(buttonMul.getName());
                                System.out.println("The principal display show: "
                                        + display.getPrincipalDisplay());
                                if (getSign() == "") {
                                    System.out.println("The secondary displays show nothing");
                                } else {
                                    display.setFirstSecondaryDisplay(getSign());
                                    System.out.println("The secondary displays show: "
                                            + display.getFirstSecondaryDisplay()
                                            + display.getSecondSecondaryDisplay()
                                            + display.getThirdSecondaryDisplay());
                                }
                                break;

                            case "/":
                                buttonDiv.pushed(buttonDiv.getName());
                                System.out.println("The principal display show: "
                                        + display.getPrincipalDisplay());
                                if (getSign() == "") {
                                    System.out.println("The secondary displays show nothing");
                                } else {
                                    display.setFirstSecondaryDisplay(getSign());
                                    System.out.println("The secondary displays show: "
                                            + display.getFirstSecondaryDisplay()
                                            + display.getSecondSecondaryDisplay()
                                            + display.getThirdSecondaryDisplay());
                                }
                                break;

                            case "+":
                                buttonPlus.pushed(buttonPlus.getName());
                                System.out.println("The principal display show: "
                                        + display.getPrincipalDisplay());
                                if (getSign() == "") {
                                    System.out.println("The secondary displays show nothing");
                                } else {
                                    display.setFirstSecondaryDisplay(getSign());
                                    System.out.println("The secondary displays show: "
                                            + display.getFirstSecondaryDisplay()
                                            + display.getSecondSecondaryDisplay()
                                            + display.getThirdSecondaryDisplay());
                                }
                                break;

                            case "-":
                                buttonMinus.pushed(buttonMinus.getName());
                                System.out.println("The principal display show: "
                                        + display.getPrincipalDisplay());
                                if (getSign() == "") {
                                    System.out.println("The secondary displays show nothing");
                                } else {
                                    display.setFirstSecondaryDisplay(getSign());
                                    System.out.println("The secondary displays show: "
                                            + display.getFirstSecondaryDisplay()
                                            + display.getSecondSecondaryDisplay()
                                            + display.getThirdSecondaryDisplay());
                                }
                                break;

                        }

                    }
                } else {

                    if (!"=".equals(j)) {

                        System.err.println("Sorry, you introduced wrong data. I quit :)");
                        System.exit(0);
                    }

                }

                System.out.println();
                break;

        }
    }

    public void stop() {
        buttonOff.pushed(buttonOff.getName());
        System.out.println("\nAll displays show nothing.\n");
        System.exit(0);
    }

    public void clear() {
        buttonClear.pushed(buttonClear.getName());
        display.setPrincipalDisplay("0");
        display.setFirstSecondaryDisplay("");
        display.setSecondSecondaryDisplay("");
        display.setThirdSecondaryDisplay("");
        setNumber1(0);
        setNumber2(0);
        setResult(0);
        setOperator(null);
        setSign("");
        System.out.println("The principal display show: "
                + display.getPrincipalDisplay());
        if (getSign() == "") {
            System.out.println("The secondary displays show nothing");
        } else {
            display.setFirstSecondaryDisplay(getSign());
            System.out.println("The secondary displays show: "
                    + display.getFirstSecondaryDisplay()
                    + display.getSecondSecondaryDisplay()
                    + display.getThirdSecondaryDisplay());
        }
        System.out.println();
        setFlag("number");
    }

    /**
     * Abstract method deffined in Computer class.
     *
     * Computer.buildSetAndUse() method
     */
    @Override
    public void buildSetAndUse() {

        setComponents();
        deviceAssembly();
        start();
        System.out.println("Please introduce your first number: ");
        setNumber1();
        System.out.println("Please introduce operator(+/-/*//): ");
        setOperator();
        System.out.println("Please introduce your second number: ");
        setNumber2();
        System.out.println("Please introduce '=' ");
        read();
        compute(getNumber1(), getNumber2());

    }

    /**
     * Abstract method deffined in Computer class.
     *
     * Computer.compute() method
     */
    @Override
    public void compute(double x, double y) {

        switch (getOperator()) {

            case "+":

                setResult(x + y);

                DecimalFormat deResult = new DecimalFormat("0.############");
                String strResult = deResult.format(getResult());
                String firstChar = Character.toString(strResult.charAt(0));

                switch (firstChar) {

                    case "-":
                        setSign("-Minus");
                        strResult = strResult.substring(1);
                        display.setPrincipalDisplay(strResult);
                        display.setFirstSecondaryDisplay(getSign());
                        System.out.println("The principal display show: "
                                + display.getPrincipalDisplay());
                        System.out.println("The secondary displays show: "
                                + display.getFirstSecondaryDisplay()
                                + display.getSecondSecondaryDisplay()
                                + display.getThirdSecondaryDisplay());
                        break;

                    default:
                        display.setPrincipalDisplay(strResult);
                        System.out.println("The principal display show: "
                                + display.getPrincipalDisplay());
                        System.out.println("The secondary displays show nothing");
                        break;
                }
                break;

            case "-":

                setResult(x - y);

                DecimalFormat deResult1 = new DecimalFormat("0.############");
                String strResult1 = deResult1.format(getResult());
                String firstChar1 = Character.toString(strResult1.charAt(0));

                switch (firstChar1) {

                    case "-":
                        setSign("-Minus");
                        strResult1 = strResult1.substring(1);
                        display.setPrincipalDisplay(strResult1);
                        display.setFirstSecondaryDisplay(getSign());
                        System.out.println("The principal display show: "
                                + display.getPrincipalDisplay());
                        System.out.println("The secondary displays show: "
                                + display.getFirstSecondaryDisplay()
                                + display.getSecondSecondaryDisplay()
                                + display.getThirdSecondaryDisplay());
                        break;

                    default:
                        display.setPrincipalDisplay(strResult1);
                        System.out.println("The principal display show: "
                                + display.getPrincipalDisplay());
                        System.out.println("The secondary displays show nothing");
                        break;
                }
                break;

            case "*":

                setResult(x * y);

                DecimalFormat deResult2 = new DecimalFormat("0.############");
                String strResult2 = deResult2.format(getResult());
                String firstChar2 = Character.toString(strResult2.charAt(0));

                switch (firstChar2) {

                    case "-":
                        setSign("-Minus");
                        strResult2 = strResult2.substring(1);
                        display.setPrincipalDisplay(strResult2);
                        display.setFirstSecondaryDisplay(getSign());
                        System.out.println("The principal display show: "
                                + display.getPrincipalDisplay());
                        System.out.println("The secondary displays show: "
                                + display.getFirstSecondaryDisplay()
                                + display.getSecondSecondaryDisplay()
                                + display.getThirdSecondaryDisplay());
                        break;

                    default:
                        display.setPrincipalDisplay(strResult2);
                        System.out.println("The principal display show: "
                                + display.getPrincipalDisplay());
                        System.out.println("The secondary displays show nothing");
                        break;
                }
                break;

            case "/":

                setResult(x / y);

                if (y == 0) {

                    display.setPrincipalDisplay("0");
                    display.setThirdSecondaryDisplay("ERROR");
                    System.out.println("The principal display show: "
                            + display.getPrincipalDisplay());
                    System.out.println("The secondary displays show: "
                            + display.getFirstSecondaryDisplay()
                            + display.getSecondSecondaryDisplay()
                            + display.getThirdSecondaryDisplay());

                } else {

                    DecimalFormat deResult3 = new DecimalFormat("0.############");
                    String strResult3 = deResult3.format(getResult());
                    String firstChar3 = Character.toString(strResult3.charAt(0));

                    switch (firstChar3) {

                        case "-":
                            setSign("-Minus");
                            strResult3 = strResult3.substring(1);
                            display.setPrincipalDisplay(strResult3);
                            display.setFirstSecondaryDisplay(getSign());
                            System.out.println("The principal display show: "
                                    + display.getPrincipalDisplay());
                            System.out.println("The secondary displays show: "
                                    + display.getFirstSecondaryDisplay()
                                    + display.getSecondSecondaryDisplay()
                                    + display.getThirdSecondaryDisplay());
                            break;

                        default:
                            display.setPrincipalDisplay(strResult3);
                            System.out.println("The principal display show: "
                                    + display.getPrincipalDisplay());
                            System.out.println("The secondary displays show nothing");
                            break;
                    }
                    break;

                }
        }

        DecimalFormat deResult = new DecimalFormat("0.############");
        String strResult = deResult.format(getResult());

        System.out.println("\nResult is: " + strResult + "\n");

        System.out.println("Make another oppertation? Type yes or no");
        Scanner input2 = new Scanner(System.in);
        switch (input2.next()) {

            case "yes":
                clear();
                System.out.println("Please introduce your first number: ");
                setNumber1();
                System.out.println("Please introduce operator(+/-/*//): ");
                setOperator();
                System.out.println("Please introduce your second number: ");
                setNumber2();
                System.out.println("Please introduce '=' ");
                read();
                compute(getNumber1(), getNumber2());
                break;

            case "no":
                stop();
                break;

            default:
                System.err.println("Sorry, you introduced wrong data. I quit :)");
                System.exit(0);

        }

    }
}
