public class Estudiante {
    private String Nom;
    private int edad;

    public Estudiante() {
    }

    public Estudiante(String nom, int edad) {
        Nom = nom;
        this.edad = edad;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void estudiar() {
        System.out.println(Nom + " está estudiando");
    }

    public void mostrar_info() {
        System.out.println("Nombre: " + Nom);
        System.out.println("Edad: " + edad + " años");
    }

    @Override
    public String toString() {
        return "Estudiante [Nom=" + Nom + ", edad=" + edad + "]";
    }

    
    
}
