public class Perro {
    private Int edad;
    private String nombre;

    public Perro() {

    }

    public void EstablecerEdad(int edadPerro) {
        this.edad = edadPerro;
    }

    public Int EdadHumano(int edadHumano = null) {
        return ConvertirEdad(this.edad);
    }

    private Int ConvertirEdad(int edadPerro) {
        //Metodo Privado para Convertir la Edad del Perro en Edad Humano
        return edadPerro * 7;
    }
}
