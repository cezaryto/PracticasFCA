// UNIVERSIDAD NACIONAL AUTONOMA DE MÉXICO
// FACULTAD DE CONTADURÍA Y ADMINISTRACIÓN
// Alumno: Cesar Casas Quiroga
// Asignatura: Informática V
// Unidad 3, Actividad 5
// Resolver la ecuación cuadrática ax2+bx+c=0, empleando herencia de clases.

public class Operaciones {
    public Operaciones() {
        //Constructor
    }

    public double Multiplicar(double numero1, double numero2) {
        //Metodo para Multiplicar los numeros dados
        return numero1 * numero2;
    }

    public double Potencia(double numBase, int numPotencia) {
        //Metodo para calcular la potencia de un número dado
        return Math.pow(numBase, numPotencia);
    }

    public double Sumar(double numero1, double numero2) {
        //Metodo para Sumar dos numeros dados
        return numero1 + numero2;
    }

    public double RaizCuadrada(double numero) {
        //MEtodo para calcular la Raiz2
        return Math.sqrt(numero);
    }

    public double Restar(double numero1, double numero2) {
        //Metodo para Restar 2 numeros
        return numero1 - numero2;
    }
}

public class Ecuacion extends Operaciones {
    //Clase que contiene los terminos de la Ecuacion

    private double coeficienteA;
    private double coeficienteB;
    private double constanteC;

    public Ecuacion() {
        //Constrcutor con los valores por Defecto: 1
        this.coeficienteA = 1;
        this.coeficienteB = 1;
        this.constanteC = 1;
    }

    public Ecuacion(double coefA, double coefB, double consC) {
        //Constructor con los Valores de los Coeficientes distintos de 1
        this.coeficienteA = coefA;
        this.coeficienteB = coefB;
        this.constanteC = consC;
    }

    public double[] FormulaGeneral() {
        //Metodo para Resolver la Ecuacion cuadratica por la Formula General
        double[] equis = {0, 0};

        //Calcula el Valor Positivo de X
        equis[0] = Multiplicar(this.coeficienteA, this.constanteC);
        equis[0] = Multiplicar(4, equis[0]);
        equis[0] = Potencia(this.coeficienteB, 2) - equis[0];
        equis[0] = Sumar(Multiplicar(-1, this.coeficienteB), RaizCuadrada(equis[0]));
        equis[0] = equis[0] / Multiplicar(2, this.coeficienteA);

        //Calcula el Valor NEgativo de X
        equis[1] = Multiplicar(this.coeficienteA, this.constanteC);
        equis[1] = Multiplicar(4, equis[1]);
        equis[1] = Potencia(this.coeficienteB, 2) - equis[1];
        equis[1] = Sumar(Multiplicar(-1, this.coeficienteB), RaizCuadrada(equis[1]));
        equis[1] = equis[1] / Multiplicar(2, this.coeficienteA);

        return equis;
    }
}

public static void main(String[] args) {
    // Instancia la Clase Ecuacion 
    Ecuacion claseEcuacion = new Ecuacion(4, 7, 2);

    double[] resultado = claseEcuacion.FormulaGeneral();
    System.out.print("X1 = " + resultado[0] + ", X2 = " + resultado[1]);
}
