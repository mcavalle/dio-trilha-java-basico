public class Operadores {
    public static void main(String[] args) {
        //Quando usamos o "+" em Strings, o texto é concatenado
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        //Exemplo de concatenação
        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        //Operadores unários
        int numero = 5;
        numero = - numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);

        //Incremento
        numero++; //O incremento é feito depois. Para ser feito antes, seria ++numero;
        //numero = numero +1;

        //Boolean
        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        //Operador ternário
        int a, b;
        String resultado;

        a = 5;
        b = 6;

        //Exemplo usando if e else
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        
        System.out.println(resultado);

        //Exemplo com operador ternário
        resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        //Operadores relacionais
        int n1 = 1;
        int n2 = 2;

        boolean simNao = n1 == n2;

        if(n1 < n2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        simNao = n1 != n2;
        System.out.println("numeroUm é diferente a numeroDois?" + simNao);

        simNao = n1 > n2;
        System.out.println("numeroUm é maior a numeroDois?" + simNao);
    }
}
