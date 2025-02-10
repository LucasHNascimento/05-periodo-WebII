public class Principal{

    public static void main(String args[]){

    Pessoa objPessoa = new Pessoa();
    System.out.println(objPessoa.toString());

    Pessoa objPessoa2 = new Pessoa("Eu", 200);
    System.out.println(objPessoa2.toString());

    Pessoa objPessoa3 = new Pessoa("UE", 002, 11000000000L);
    System.out.println(objPessoa3.toString());

    }
}