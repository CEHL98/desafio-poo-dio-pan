import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Desenvolvimento java");
        curso1.setDescricao("Aprendendo programação java");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Orientação a objeto");
        curso2.setDescricao("Aprendendo programação Orietada a objetos com java");
        curso2.setCargaHoraria(8);

        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Desafio de projeto");
        mentoria.setDescricao("Desenvolvimento de uma aplicação java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição bootCamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Carlos");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos por "+ dev1.getNome()+ ": "+ dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("-----------------------");
        System.out.println("Conteudo inscritos por "+ dev1.getNome()+ ": "+ dev1.getConteudosInscritos());
        System.out.println("Conteudo concluido por "+ dev1.getNome()+ ": " +  dev1.getConteudosConcluidos());
        System.out.println("XP: "+dev1.calcularTotalXp());

        System.out.println("\n*********************\n\n");
        Dev dev2 = new Dev();
        dev2.setNome("Eduardo");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos por "+dev2.getNome()+": "+ dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("-----------------------");
        System.out.println("Conteudo inscritos por "+dev2.getNome()+": "+ dev2.getConteudosInscritos());
        System.out.println("Conteudo concluido por "+ dev2.getNome()+": "+ dev2.getConteudosConcluidos());
        System.out.println("XP: "+dev2.calcularTotalXp());
    }
}
