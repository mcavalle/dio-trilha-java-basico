public class ResultadoEscolar {
 public static void main(String[] args) {
    int nota = 6;

    /*Condicional composta
     * if (nota >= 7)
        System.out.println("Aprovado");
    else
        System.out.println("Reprovado");   
    */

    /*Condicional encadeada
    if (nota >= 7)
        System.out.println("Aprovado");

    else if (nota >= 5 && nota < 7)
        System.out.println("Recuperação");
    else
        System.out.println("Reprovado");
    */

    //Condicional ternária
    String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
    System.out.println(resultado);
    
 }
}
