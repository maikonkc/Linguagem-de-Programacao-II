import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int somaTanque=0;
    int somaQuilometros=0;
    Scanner en = new Scanner(System.in);
    String continuar="s";
    while(continuar.toUpperCase().equals("S")){
      System.out.print("");
      System.out.print("Digite o valor do tanque: ");
      int tanque = en.nextInt();
      somaTanque = somaTanque + tanque;
      System.out.print("Digite o valor da quilometragem: ");
      int quilometros = en.nextInt();
      somaQuilometros = somaQuilometros + quilometros;
      System.out.println("O valor tanque/quilometragem �: "+(double)tanque/quilometros);
      System.out.println("Voc� deseja adicionar outro?(s/n) ");
      continuar = en.next();
    }
    System.out.println("A combina��o da quilometragem �:  "+somaQuilometros);
    System.out.println("A soma total de litros consumidos �:  "+somaTanque);
  }
}