public class Estudiante {

    // Atributos
    private int id;
    private int cantidadponencias;

    public Estudiante(int id, int cantidadponencias) { // Constructor
        this.id = id;
        this.cantidadponencias = cantidadponencias;
    }


    //Metodos y/o funciones     siempre retornan alguna informacion

    public void SetId(int id){
        this.id=id;
    }

    public int GetId(){
        return id;
    }
     
    public void SetCantidadPonencias(int cantidadponencias){
        this.cantidadponencias=cantidadponencias;
    }

    public int GetCantidadPonencias(){
        return cantidadponencias;
    }
    

}
