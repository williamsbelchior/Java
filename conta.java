public class Conta {
  private int numConta;
  private double saldo;
  private double limiteCartao;
  private String senha;
  private static cont = 0;
  
  public Conta (double saldo, double limiteCartao, String senha){  
    numConta =  cont++;
    
    this.saldo = saldo;
    this.limiteCartao = limiteCartao;
    this.senha = senha;
  }
    
  public void imprimir(){
    system.out.println("O número da conta é:" + numConta);
    system.out.println("O saldo é:" + saldo);
    system.out.println("O limite do cartão é:" + limiteCartao);
  }  
  
  public void setlimiteCartao(double limiteCartao){
    if (limiteCartao < (3 * saldo))
      this.limiteCartao = limiteCartao;
    else
      system.out.println("O limite do cartão não pode ser tão alto")
  }
  
  public int getlimiteCartao(){
    return limiteCartao;
  }
  
  public void setSenha (String senha){
    if (senha.length() < 6)
      system.out.println ("A senha deve conter no mínimo seis dígitos");
    else
      this.senha = senha;
  }
  
  public String getSenha(){
    return senha;
  }
  
  public double getSaldo() {
    return saldo;
  }
  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  
  public int getNumConta(){
    return numConta;
  }
  
}

