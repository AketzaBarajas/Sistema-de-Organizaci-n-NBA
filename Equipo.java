import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    //Constructor
    public Equipo (String nombre){
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    //Getters
    public String getNombre(){return nombre;}
    public ArrayList<Jugador> getJugadores(){return jugadores;}
    
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setJugadores(ArrayList<Jugador> jugadores){
        this.jugadores = jugadores;
    }

    //Método para meter el jugador en el equipo
    public void agregarJugadores(Jugador jugador){
        jugadores.add(jugador);
    }

    //Método para eliminar el jugador del equipo
    public void eliminarJugaodores(Jugador jugador){
        jugadores.remove(jugador);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipo: " + nombre + "\n");
        for (Jugador jugador : jugadores) {
            sb.append("  " + jugador.toString() + "\n");
        }
        return sb.toString();
    }
}
