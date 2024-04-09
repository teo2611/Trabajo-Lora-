public class universidad extends Estudiante {
    private String Univ;


    public universidad(String nom, int edad, String univ) {
        super(nom, edad);
        Univ = univ;
    }
    
    public String getUniv() {
        return Univ;
    }

    public void setUniv(String univ) {
        Univ = univ;
    }

    public void realizarInvestigacion() {
        System.out.println(getNom()+" Está realizando investigación en " + Univ);
    }
    @Override
    public void mostrar_info(){
        super.mostrar_info();
        System.out.println("Universidad: " + Univ);

    }


    

    


    
}
