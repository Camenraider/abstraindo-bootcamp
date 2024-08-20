import br.com.joao.desafio.dominio.Bootcamp;
import br.com.joao.desafio.dominio.Curso;
import br.com.joao.desafio.dominio.Dev;
import br.com.joao.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        Curso curso1 = new Curso();
        curso1.setTitulo("java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

/*        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
                                        */

        Bootcamp bootcampClaro = new Bootcamp();
        bootcampClaro.setNome("Bootcamp Java Developer");
        bootcampClaro.setDescricao("Descrição Bootcamp Claro");
        bootcampClaro.getConteudos().add(curso1);
        bootcampClaro.getConteudos().add(curso2);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcampClaro);
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosIncritos());

        devJoao.progredir();
        System.out.println("--");

        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcualarTotalXp());


        System.out.println("---------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcampClaro);
        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosIncritos());

        devCamila.progredir();
        System.out.println("--");

        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcualarTotalXp());

    }
}