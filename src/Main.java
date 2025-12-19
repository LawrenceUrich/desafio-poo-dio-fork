import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // ===== Criando cursos =====
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("curso java");
        cursoJava.setDescricao("descrição curso java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("curso js");
        cursoJs.setDescricao("descrição curso js");
        cursoJs.setCargaHoraria(4);

        // ===== Criando mentoria =====
        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("mentoria de java");
        mentoriaJava.setDescricao("descrição mentoria java");
        mentoriaJava.setData(LocalDate.now());

        // ===== Criando bootcamp =====
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");

        bootcamp.adicionarConteudo(cursoJava);
        bootcamp.adicionarConteudo(cursoJs);
        bootcamp.adicionarConteudo(mentoriaJava);

        System.out.println(bootcamp);
        System.out.println("===================================");

        // ===== Dev Camila =====
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Antes da progressão:");
        System.out.println(devCamila);

        devCamila.progredir(2);

        System.out.println("Depois da progressão:");
        System.out.println(devCamila);
        System.out.println("===================================");

        // ===== Dev João =====
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Antes da progressão:");
        System.out.println(devJoao);

        devJoao.progredirTudo();

        System.out.println("Depois da progressão:");
        System.out.println(devJoao);
    }
}
