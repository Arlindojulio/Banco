/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

//import java.util.Date;

import java.time.LocalDate;


/**
 *
 * @author arlindo
 */
public class Conta {
    
    private int numero;
    private double saldo;
    private double limite = 1000;
    private String titular;
    private String tipo;
    private String agencia;
    private double redimento;
    
    private static int identificador;
    

    public Conta(int numero, double saldo, String titular, String tipo, String agencia) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.tipo = tipo;
        this.agencia = agencia;
        
        LocalDate data = LocalDate.now();
        
        this.getIdentificador();
        this.impressao();
        
    }
    
    
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public double getSaldo(){
        return this.saldo + this.limite;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String getAgencia(){
        return this.agencia;
    }
    
    public double getRendimento(){
        return this.redimento = (this.saldo * 0.5) / 100;
    }
    
    public int getIdentificador(){
        return Conta.identificador = Conta.identificador + 1;
    }
    
    boolean saca(double valor){
        
        if(this.saldo < valor){
            return false;
        }
        else{
            this.saldo = this.saldo - valor;
        
            System.out.println(" ");
            System.out.println("Saque realizado com sucesso! Valor: " + valor);
            System.out.println("Novo saldo real R$ " + this.saldo);
            System.out.println(" ");
            
            return true;
        }
    }
    
    double deposita(double quantidade){
        this.saldo = this.saldo + quantidade;
        System.out.println(" ");
            System.out.println("Deposito realizado com sucesso! Valor: " + quantidade);
            System.out.println("Novo saldo real R$ " + this.saldo);
            System.out.println(" ");
        return this.saldo;
    }
    
    boolean transfere(Conta destino, double valor){
        System.out.println(" ");
        System.out.println("Realizando transferência...");
        boolean retira = this.saca(valor);
            if (retira == false){
                System.out.println("Transferencia Negada!");
            }
            else{
                System.out.println(" ");
                System.out.println("Transferência realizada com sucesso");
                 destino.deposita(valor);
                 System.out.println("Novo saldo real R$ " + this.saldo);
            return true;
            }
        return true;
    }
     
    String impressao(){
       
        System.out.println("*************************************************");
        String dados = "Titular da conta: " + this.getTitular();
            dados += "\nNúmero da conta: " + this.getNumero();
            dados += "\nAgência: " + this.getAgencia();
            dados += "\nConta " + this.getTipo();
            dados += "\nSaldo total disponível para saque " + this.getSaldo();
            dados += "\nRendimento mensal R$ " + this.getRendimento();
            dados += "\nNúmero Identificador: " + Conta.identificador;
            dados += "\nData de criação da conta: " + LocalDate.now();
            
        System.out.println(dados);
    return dados;   
    }
        
        
 
    
}
