
package primeirobancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBD {
    private Connection conexao;
    
 public boolean conectar(){
     try{
     String url = "jdbc:sqlite:banco01";
     this.conexao = DriverManager.getConnection(url);  
     
     }catch(SQLException e){
        System.err.println(e.getMessage());
        return false;
     }
 System.out.println("--Conectou ao banco--");
 return true;
 }
public boolean desconectar(){
     
}          
}
