import java.util.ArrayList;

public class Conferencia {
    private String nombre;
    private ArrayList<Equipo> equipos;

    //Constructor
    public Conferencia (String nombre){
        this.nombre=nombre;
        this.equipos = new ArrayList<>();
    }

    //Getters
    public String getNombre(){return nombre;}
    public ArrayList<Equipo> getEquipos(){return equipos;}

    //Setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEquipos(ArrayList<Equipo> equipos){
        this.equipos = equipos;
    }

    //Método para añadir un equipo a la conferencia
    public void añadirEquipo(Equipo equipo){
        equipos.add(equipo);
    }

    //Método para eliminar un equipo de la conferencia
    public void eliminarEquipo(Equipo equipo){
        equipos.remove(equipo);
    }

     // Método para mostrar todas las conferencias y sus equipos
     public void mostrarEquipos() {
        System.out.println("=== Equipos ===");
        for (Equipo equipo : equipos) {
            System.out.println(equipo.toString());
        }
    }
}