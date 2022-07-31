public class Automovil {

    //ATRIBUTO DE LA CLASE

    String fabricante;
    String modelo;
    String color;
    double cilindraje;

    //METODOS

    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nEl automovil es " + this.fabricante);
        sb.append("\nEl automovil es " + this.modelo);
        sb.append("\nEl automovil es " + this.color);
        sb.append("\nEl automovil es " + this.cilindraje);

        return sb.toString();
    }

}
