/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author arlindo
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //int numero, double saldo, String titular, String tipo, String agencia
        
        Conta conta01 = new Conta(01, 300, "Jubileu", "Poupança", "Vila do Conde");
        Cliente cliente01 = new Cliente();
        
        /*
        cliente01.cadastraNome("Arlindo");
        conta01.setAgencia("Ag 01");
        conta01.setTitular("Arlindo");
        conta01.setNumero(01);
        conta01.setTipo("Corrente");
        conta01.getSaldo();
        */
        //conta01.impressao();
        conta01.saca(100);
        conta01.deposita(250);
        
        Conta conta02 = new Conta(02, 500, "Creuza", "Corrente", "Timbaúba");
        
        /*
        conta02.setAgencia("Ag 02");
        conta02.setTitular("Albenis");
        conta02.setNumero(02);
        conta02.setTipo("Poupança");
        conta02.setSaldo(560);
        */
        //conta02.impressao();
        conta02.saca(100);
        conta02.deposita(450);
        
        conta02.transfere(conta01, 500);
    }
    
}
