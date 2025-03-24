public abstract class Jugador {
    protected String nombre;
    protected int dorsal;
    protected double altura;

    //Constructor
    public Jugador(String nombre, int dorsal, double altura){
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.altura = altura;
    }

    //Getters
    public String getNombre(){return nombre;}
    public int getDorsal(){return dorsal;}
    public double getAltura(){return altura;}
   
    //Setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDorsal(int dorsal){
        this.dorsal = dorsal;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
   
    @Override
    public String toString(){
        return nombre + " (" + dorsal + "," + altura +  ")";
    }


}
