public class Notas extends Estudiante  {
    private double[] notas;

    public Notas(Estudiante estudiante, double[] notas) {
        super(estudiante.getNom(), estudiante.getEdad());
        this.notas = notas;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }

        return (notas.length > 0) ? suma / notas.length : 0;
    }
    public void mostrar_notas(){
        super.mostrar_info();
        System.out.println("Promedio: " + calcularPromedio());
    }
    


    
}
