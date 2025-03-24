import java.util.ArrayList;

public class Liga {
    private String nombre;
    private ArrayList<Conferencia> conferencias;

    //Constructor
    public Liga(String nombre){
        this.nombre = "NBA";
        this.conferencias = new ArrayList<>();
    }

    //Getters
    public String getNombre(){return nombre;}
    public ArrayList<Conferencia> getConferencias(){return conferencias;}

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setConferencias(ArrayList<Conferencia> conferencias){
        this.conferencias = conferencias;
    }

    //Método para añadir conferencias en la liga
    public void añadirConferencia(Conferencia conferencia){
        conferencias.add(conferencia);
    } 

    //Método para eliminar conferencias de la liga
    public void eliminarConferencia(Conferencia conferencia){
        conferencias.add(conferencia);
    }

     // Método para mostrar todas las conferencias y sus equipos
     public void mostrarConferencias() {
        System.out.println("=== Conferencias ===");
        for (Conferencia conferencia : conferencias) {
            System.out.println(conferencia.getNombre());
            conferencia.mostrarEquipos();
        }
     }    
}
