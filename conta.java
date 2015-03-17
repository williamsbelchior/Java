Public Class Conta{
  private int numConta;
  private double saldo;
  private double limiteCartao;
  private int senha;
  private static cont = 0;
  
Public Conta (double saldo, double limiteCartao, int senha){  
  numConta =  cont++;
  this.saldo = saldo;
  this.limiteCartao = limiteCartao;
  this.senha = senha;
}
  
Public void imprimir(){
  system.out.println("O número da conta é:" + numConta);
  system.out.println("O saldo é:" + saldo);
  system.out.println("O limite do cartão é:" + limiteCartao);
}  

Public void setlimiteCartao(double valor){
  if limiteCartao = 3x saldo (acho que não é assim)
    limiteCartao = valor (não sei se é isso!!)
  else
   system.out.println("O limite do cartão não pode ser tão alto")
}

Public int getlimiteCartao(){
  return limiteCartao;
}

Public void setsenha (int num){
  if senha < não sei o que colocar aqui (se eu colocar 6 vai ser o número 6, não sei se posso colocar num e atribuir um valor 6 pra ele, acho que não!!)
    
  else
   system.out.println ("A senha deve conter seis dígitos");
}  
Public int getsenha(){
  return senha;

Public int numConta(){
  return numConta;
}
}

  
  
}

