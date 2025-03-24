public class Main{
    public static void main(String[] argumentos){
        // Equipo: Lakers
        Jugador jugador1 = new Alero("Lebron James", 23, 2.06);
        Jugador jugador2 = new Alero("Anthony Davis", 3, 2.08);
        Jugador jugador3 = new Base("Russell Westbrook", 0, 1.91);
        Jugador jugador4 = new Base("Malik Monk", 11, 1.93);
        Jugador jugador5 = new Base("Austin Reaves", 15, 1.93);

        // Equipo: Celtics
        Jugador jugador6 = new Escolta("Jayson Tatum", 0, 2.01);
        Jugador jugador7 = new Escolta("Jaylen Brown", 7, 2.01);
        Jugador jugador8 = new Base("Marcus Smart", 36, 1.91);
        Jugador jugador9 = new AlaPivot("Al Horford", 42, 2.11);
        Jugador jugador10 = new AlaPivot("Robert Williams III", 44, 2.11);

        // Equipo: Warriors
        Jugador jugador11 = new Base("Stephen Curry", 30, 1.91);
        Jugador jugador12 = new Escolta("Klay Thompson", 11, 1.98);
        Jugador jugador13 = new Escolta("Draymond Green", 23, 1.98);
        Jugador jugador14 = new Alero("Andrew Wiggins", 22, 2.03);
        Jugador jugador15 = new Base("Jordan Poole", 3, 1.93);

        // Equipo: Cavaliers
        Jugador jugador16 = new Base("Darius Garland", 10, 1.93);
        Jugador jugador17 = new AlaPivot("Jarrett Allen", 31, 2.13);
        Jugador jugador18 = new AlaPivot("Evan Mobley", 4, 2.11);
        Jugador jugador19 = new Escolta("Caris LeVert", 22, 1.98);
        Jugador jugador20 = new Alero("Kevin Love", 0, 2.03);

        // Equipo: Denver Nuggets
        Jugador jugador21 = new AlaPivot("Nikola Jokić", 15, 2.13);
        Jugador jugador22 = new Base("Jamal Murray", 27, 1.93);
        Jugador jugador23 = new Alero("Michael Porter Jr.", 1, 2.03);
        Jugador jugador24 = new Alero("Aaron Gordon", 45, 2.06);
        Jugador jugador25 = new Escolta("Bruce Brown", 7, 1.98);

        // Equipo: 76ers
        Jugador jugador26 = new AlaPivot("Joel Embiid", 21, 2.13);
        Jugador jugador27 = new Escolta("James Harden", 13, 1.96);
        Jugador jugador28 = new Base("Tyrese Maxey", 0, 1.85);
        Jugador jugador29 = new Alero("Tobias Harris", 12, 2.03);
        Jugador jugador30 = new Escolta("Danny Green", 14, 1.98);

        //Crear equipos y añadir jugadores
        Equipo equipo1 = new Equipo("Lakers");
        equipo1.agregarJugadores(jugador1);
        equipo1.agregarJugadores(jugador2);
        equipo1.agregarJugadores(jugador3);
        equipo1.agregarJugadores(jugador4);
        equipo1.agregarJugadores(jugador5);
        Equipo equipo2 = new Equipo("Celtics");
        equipo2.agregarJugadores(jugador6);
        equipo2.agregarJugadores(jugador7);
        equipo2.agregarJugadores(jugador8);
        equipo2.agregarJugadores(jugador9);
        equipo2.agregarJugadores(jugador10);
        Equipo equipo3 = new Equipo("Warriors");
        equipo3.agregarJugadores(jugador11);
        equipo3.agregarJugadores(jugador12);
        equipo3.agregarJugadores(jugador13);
        equipo3.agregarJugadores(jugador14);
        equipo3.agregarJugadores(jugador15);
        Equipo equipo4 = new Equipo("Cavaliers");
        equipo4.agregarJugadores(jugador16);
        equipo4.agregarJugadores(jugador17);
        equipo4.agregarJugadores(jugador18);
        equipo4.agregarJugadores(jugador18);
        equipo4.agregarJugadores(jugador19);
        equipo4.agregarJugadores(jugador20);
        Equipo equipo5 = new Equipo("Nuggets");
        equipo5.agregarJugadores(jugador21);
        equipo5.agregarJugadores(jugador22);
        equipo5.agregarJugadores(jugador23);
        equipo5.agregarJugadores(jugador24);
        equipo5.agregarJugadores(jugador25);
        Equipo equipo6 = new Equipo("76ers");
        equipo6.agregarJugadores(jugador26);
        equipo6.agregarJugadores(jugador27);
        equipo6.agregarJugadores(jugador28);
        equipo6.agregarJugadores(jugador29);
        equipo6.agregarJugadores(jugador30);

        //Crear conferenicas
        Conferencia conferencia1 = new Conferencia("Conferencia Oeste");
        conferencia1.añadirEquipo(equipo1);
        conferencia1.añadirEquipo(equipo3);
        conferencia1.añadirEquipo(equipo5);
        Conferencia conferencia2 = new Conferencia("Conferencia Este");
        conferencia2.añadirEquipo(equipo2);
        conferencia2.añadirEquipo(equipo4);
        conferencia2.añadirEquipo(equipo6);

        //Crear liga
        Liga liga = new Liga(null);
        liga.añadirConferencia(conferencia1);
        liga.añadirConferencia(conferencia2);

        //Mostrar la liga
        liga.mostrarConferencias();
    }
}