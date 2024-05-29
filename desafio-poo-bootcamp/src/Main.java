import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java DIO");
        curso1.setDescricao("Este curso abordará os básicos de Java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Javascript DIO");
        curso1.setDescricao("Este curso abordará os básicos de Javascript.");
        curso1.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java DIO");
        mentoria1.setDescricao("Esta mentoria será sobre os básicos de Java.");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Aprenda conosco como funciona o  desenvolvimento em Java!");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria1);

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos inscritos Caio " + devCaio.getConteudosInscritos());

        devCaio.progredir();

        System.out.println("-");
        System.out.println("Conteúdos inscritos Caio " + devCaio.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Caio " + devCaio.getConteudosConcluidos());
        System.out.println("XP: " + devCaio.calcularXpTotal());

        System.out.println("--------");

        Dev devSolo = new Dev();
        devSolo.setNome("Dev Solo");
        devSolo.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos inscritos Dev Solo " + devSolo.getConteudosInscritos());

        devSolo.progredir();

        System.out.println("-");
        System.out.println("Conteúdos inscritos Dev Solo " + devSolo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Dev Solo " + devSolo.getConteudosConcluidos());
        System.out.println("XP: " + devSolo.calcularXpTotal());
    }
}
