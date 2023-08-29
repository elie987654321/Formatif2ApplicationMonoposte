package a23.climoilou.mono2.exercice_module_java.controller;


public class ApplicationComplete {
    public void agit() {
        int value = getValue();
        affiche("la nouvelle valeur est " + value);
    }


    public int getValue() {
        int retVal = (int) (Math.random() * 100);
        //logger.log("the number is " + retVal);
        return retVal;
    }

    public void affiche(String message) {
        //logger.log("view log this message: " + message);
        System.out.println(message);
    }

    public static void main(String[] args) {
        new Controller().agit();
    }
}
