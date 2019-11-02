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
public class Cliente {
 
    private String nome;
    private String sobrenome;
    private String endereco;
    private String cpf;
    private String contato;
    
    
    public void cadastraNome(String nome){
        this.nome = nome;
    }

}
