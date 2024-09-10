import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cursos curso = new Cursos();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição Curso Java");
        curso.setCargaHoraria(8);

        Cursos curso2 = new Cursos();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java");
        bootCamp.setDescricao("descrição bootcamp Java");
        bootCamp.getConteudos().add(curso);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Dev Java");
        dev.inscreverBootCamp(bootCamp);
        System.out.println("conteudo inscritos Camila:" +dev.getConteudoInscritos());
        dev.progredir();
        System.out.println("----------");
        System.out.println("conteudo inscritos Camila:" +dev.getConteudoInscritos());
        System.out.println("conteudo concluidos Camila:" +dev.getConteudoConcluidos());
        System.out.println("\n *********************************** \n");
        Dev dev2 = new Dev();
        dev2.setNome("Dev JavaScript");
        dev2.inscreverBootCamp(bootCamp);
        System.out.println("conteudo inscritos Joao:" +dev2.getConteudoInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("----------");
        System.out.println("conteudo inscritos Joao:" +dev2.getConteudoInscritos());
        System.out.println("conteudo concluidos Joao:" +dev2.getConteudoConcluidos());





    }
}