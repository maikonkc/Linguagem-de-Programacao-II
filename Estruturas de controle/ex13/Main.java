class Main {
  public static void main(String[] args) {
    int pi=0;
    int p=1;
    for(int i =0;i<500;i++){
 
      if(i%2!=0){
        pi += (4/i)*p;
      }
      p*=-1;
    }
    System.out.print(pi);
  }
}