/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;


public class Agenda {
    
     private String nome;
     private  int telefone;
     private String email;
     private  String endereco;
     
     
    public String getnome(){return nome;}
    public void setnome(String nome ){this.nome=nome;}
     public int gettelefonee(){return telefone;}
    public void settelefone(int telefone ){this.telefone=telefone;}
     public String getemail(){return email;}
    public void setemail(String email ){this.email=email;}
     public String getendereco(){return endereco;}
    public void setendereco(String endereco ){this.endereco=endereco;}
    
    public void dados(){
        System.out.println("o contacto é "+nome+" telemóvel " +telefone +" email "+ email+" endereço "+ endereco);
    }
    

  
    public static void main(String[] args) {
        
           Agenda a1= new Agenda();
        a1.setnome(" Gilmar Freitas ");
        a1.settelefone(99922233);
        a1.setemail(" gilmar@hotmail.com ");
        a1.setendereco(" R.Dom pedro v ");
       
        a1.dados();
     
    }
    
}
