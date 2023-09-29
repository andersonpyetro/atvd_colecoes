package br.com.apyetro;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayListParticipantes {

    public static void main(String args[]){
        exemploListaOrdemAlfabetica();
        exemploListaSeparadaPorSexo();
    }

    private static void exemploListaOrdemAlfabetica(){
        System.out.println("***** exemploListaOrdemAlfabetica *****");
        List<Participantes> lista = new ArrayList<>();

        Participantes a = new Participantes ("Alexandre o Grande", " M");
        Participantes b = new Participantes ("Catarina de Sena", " F");
        Participantes c = new Participantes ("Cleópatra", " F");
        Participantes d = new Participantes ("Dostoiévski", " M");
        Participantes e = new Participantes ("Tolstói", " M");
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        Collections.sort(lista);
        System.out.println(lista);

    }

    private static void exemploListaSeparadaPorSexo(){
        System.out.println("***** exemploListaSeparadaPorSexo *****");
        List<Participantes> lista = new ArrayList<>();

        Participantes a = new Participantes ("Alexandre o Grande", " M");
        Participantes b = new Participantes ("Catarina de Sena", " F");
        Participantes c = new Participantes ("Cleópatra", " F");
        Participantes d = new Participantes ("Dostoiévski", " M");
        Participantes e = new Participantes ("Tolstói", " M");
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);

        System.out.println(lista);
        Collections.sort(lista);

        System.out.println("Participantes Masculinos:");
        for (Participantes participante : lista) {
            if (participante.getSexo().trim().equalsIgnoreCase("M")) {
                System.out.println(participante);
            }
        }

        System.out.println("Participantes Femininos:");
        for (Participantes participante : lista) {
            if (participante.getSexo().trim().equalsIgnoreCase("F")) {
                System.out.println(participante);
            }
        }


    }
}
