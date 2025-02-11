public class Principal{

    public static void main(String args[]){

        Aluno aluno1 = new Aluno("Lucas", 20, 1234567890l, 0001);
        System.out.println(aluno1.toString());
        
        Aluno aluno2 = new Aluno("HUA", 220, 1234567890l, 0201);
        System.out.println(aluno2.toString());

        Aluno aluno3 = new Aluno("HDUWA", 340, 1234567890l, 3001);
        System.out.println(aluno3.toString());

        Professor professor1 = new Professor("Lelo", 109, 123457890l, 1234);
        System.out.println(professor1.toString());

        Professor professor2 = new Professor("Trelo", 1009, 123457890l, 8888);
        System.out.println(professor2.toString());

        Disciplina disciplina = new Disciplina("Web II");
        System.out.println(disciplina.toString());
    }
}