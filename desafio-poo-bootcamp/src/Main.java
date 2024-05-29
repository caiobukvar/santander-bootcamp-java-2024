import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria1);
    }
}
