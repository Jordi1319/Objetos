public class EjemploAutomovil {

    public static void main(String[] args) {

        //INSTANCIACION

        Automovil subaru = new Automovil();

        subaru.fabricante = "Subaru";
        subaru.modelo = "Impresa";
        subaru.color = "Gris";
        subaru.cilindraje = 2.4;

        Automovil mazda = new Automovil();

        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.color = "Blanco";
        mazda.cilindraje = 2.0;

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());





    }
}
