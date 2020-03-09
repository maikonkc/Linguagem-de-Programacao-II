import java.util.*;

class MainAula1{
  void resposta(int km ,int gl ){
    System.out.println("Seu consumo: "+(km/gl));
  }
  public static void main(String[] args){
    int km1, gl1;
    Main res = new Main();
    Scanner ent = new Scanner(System.in);

    System.out.print("Qual foi a kilometragem? ");
    km1 = ent.nextInt();
    System.out.print("Quanto foi abastecido? ");
    gl1 = ent.nextInt();

    res.resposta(km1,gl1);
  }
}
