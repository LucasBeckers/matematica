public class MainMatematica {
  public static void main(String a[]) {
    Matematica m = new Matematica();
    System.out.println("Soma 4+4=" + m.somar(4,4));
    System.out.println("Subtrair 6-4=" + m.subtrair(6,4));
    System.out.println("Multiplicar 10*2=" + m.multiplicar(10,2));
    System.out.println("Dividir 25/5=" + m.dividir(25,5));
    System.out.println("Raiz 49=" + m.raiz(49));
  }
}