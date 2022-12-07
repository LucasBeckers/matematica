public class Matematica implements InterfaceMatematica {
  public float somar (float n1, float n2) {
    float res = n1 + n2;
    return res;
  }

  public float subtrair (float n1, float n2) {
    float res = n1 - n2;
    return res;
  }

  public float multiplicar(float n1, float n2){
    float res = n1 * n2;
    return res;
  }

  public float dividir (float divisor, float dividendo){
    float res = divisor / dividendo;
    return res;
  }

  public double raiz (float numero){
    double res = Math.sqrt(numero);
    return res;
  }
}