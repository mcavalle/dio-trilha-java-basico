public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano =2021;
        int cep = 21070333;// se começar com zero, talvez deva ser outro tipo
        long cpf = 98765432109L;  //se começar com zero, talvez deva ser outro tipo
        float pi = 3.14F;
        double salario = 1234.33;

        //Exemplo de casting
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //Exemplos de constante. É preciso sempre utilizar a palavra final e o nome da variável é escrito em caixa alta
        final double VALOR_DE_PI = 3.14;
    }
}
