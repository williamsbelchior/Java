public class Conta {
  private int numConta;
  private double saldo;
  private double limiteCartao;
  private int senha;
  private static cont = 0;
  
public Conta (double saldo, double limiteCartao, int senha){  
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

public void setlimiteCartao(double valor){
  if (valor < (3 * saldo))
    limiteCartao = valor;
  else
   system.out.println("O limite do cartão não pode ser tão alto")
}

public int getlimiteCartao(){
  return limiteCartao;
}

public void setSenha (int num){
  if (num.size() < 6)
    senha = num;
  else
    system.out.println ("A senha deve conter seis dígitos");
}

public int getSenha(){
  return senha;
}

public int getNumConta(){
  return numConta;
}
  
}

