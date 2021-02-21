package ar.com.xeven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Cliente> turnos = new HashMap<>();
        for(int i=0; i<8; i++)
            cargarTurno(i, new Cliente(), turnos);
        ArrayList<String> nombres = new ArrayList<>(List.of("Pablo", "Juliana", "john", "mike", "anne", "liz", "jules", "carmen"));
        turnos.forEach((k,v) -> v.setNombre(nombres.get(k)));

        turnos.entrySet().stream().forEach(System.out::println);
    }

    private static void cargarTurno(int turno, Cliente cliente, HashMap<Integer, Cliente> turnos) {
        turnos.put(turno, cliente);
    }
}
