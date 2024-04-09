public class Test {

    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Pedro", 23);
        estudiante1.estudiar();
        estudiante1.mostrar_info();

        System.out.println("");

        universidad uni = new universidad(estudiante1.getNom(), estudiante1.getEdad(), "ITM");
        uni.realizarInvestigacion();
        uni.mostrar_info();

        System.out.println("");

        carrera Carrera1 = new carrera(estudiante1, 185000, 5, "Ingeniero en agua");
        Carrera1.Practicas_Profesionales();
        Carrera1.Mostar_sueldo();
        Carrera1.Mostar_semestre();
        Carrera1.mostrar_info();

        System.out.println("");

        double[] notasEstudent= {2.5,4,5,2};
        Notas Not_Estudent = new Notas(estudiante1, notasEstudent);
        Not_Estudent.mostrar_notas();



    

    }
    
}
