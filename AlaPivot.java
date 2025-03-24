public class AlaPivot extends Jugador {
    protected static final double ALTURA_MAX = 2.15; //Altura máxima requerida (metros)
    protected static final double ALTURA_MIN = 2.10;//Altura mínima requerida (metros)

    //Constructor
    public AlaPivot(String nombre, int dorsal, double altura){
        super(nombre, dorsal, altura);
        if (comprobarAltura()!=true){
            System.out.println(nombre + " no cumple los requisitos");
        }
    }

    //PREGUNTAR SOBRE EL MÉTODO PARA COMPROBAR ALTURA PARA PODER CREAR
    //Método para ver si puede ser base o no
    public boolean comprobarAltura(){
        if (this.altura < ALTURA_MAX && altura>= ALTURA_MIN){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString(){
        return "Jugador ala-pívot: " + super.toString();
    }
}
