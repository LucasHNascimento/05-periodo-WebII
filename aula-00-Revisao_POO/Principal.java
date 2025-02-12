public class Principal{

    public static void main(String args[]){

        Aluno aluno1 = new Aluno("Lucas", 20, 1234567890l, 0001);
        System.out.println(aluno1.toString());
        
        Aluno aluno2 = new Aluno("HUA", 220, 1234567890l, 0201);
        System.out.println(aluno2.toString());

        Professor professor1 = new Professor("Lelo", 109, 123457890l, 1234);
        System.out.println(professor1.toString());

        Professor professor2 = new Professor("Trelo", 1009, 123457890l, 8888);
        System.out.println(professor2.toString());

        Disciplina disciplina1 = new Disciplina("Web II", 80);

        disciplina1.addAluno(aluno1);
        disciplina1.addAluno(aluno2);

        disciplina1.addProfessor(professor1);
        disciplina1.addProfessor(professor2);

        Disciplina disciplina2 = new Disciplina("Tópicos Integradores I", 80);

        disciplina2.addAluno(aluno1);
        disciplina2.addAluno(aluno2);

        disciplina2.addProfessor(professor1);
        disciplina2.addProfessor(professor2);

        System.out.println(disciplina2.toString());

        Curso curso = new Curso("Sistemas de Informação");
        curso.addDisciplina(disciplina1);
        curso.addDisciplina(disciplina2);
        System.out.print(curso.toString());
    }
}