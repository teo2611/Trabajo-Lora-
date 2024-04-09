public class carrera extends Estudiante{

    private float sueldo;
    private int semestre;
    private String Nomcarrera;

    public carrera(Estudiante estudiante, float sueldo, int semestre, String nomcarrera) {
        super(estudiante.getNom(), estudiante.getEdad());
        this.sueldo = sueldo;
        this.semestre = semestre;
        Nomcarrera = nomcarrera;
    }
    public float getSueldo() {
        return sueldo;
    }
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public String getNomcarrera() {
        return Nomcarrera;
    }
    public void setNomcarrera(String nomcarrera) {
        Nomcarrera = nomcarrera;
    }
    public void Practicas_Profesionales() {
        System.out.println(getNom()+ " está realizando prácticas profesionales en " + Nomcarrera);
    }
    public void Mostar_sueldo () {
        System.out.println("El sueldo de su semestre es: " + sueldo );
    }

    public void Mostar_semestre () {
        System.out.println("Semestre actual: " + semestre);
    }

    @Override
    public void mostrar_info () {
        super.mostrar_info();
        System.out.println("sueldo: " + sueldo);
        System.out.println("semestre: " + semestre);
        System.out.println("carrera: " + Nomcarrera);
    }
    


    


    
}
