/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.dao;
        
import br.com.fatec.factory.ConnectionFactory;
import br.com.fatec.model.Usuario;
import java.sql.*;

/**
 *
 * @author dti
 */
public class UsuarioDAO {
    public void insere(Usuario user) throws SQLException, ClassNotFoundException{
        String sql = "INSERT INTO usuarios(nome,login,senha) VALUES(?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            conn = ConnectionFactory.createConnection();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            
            pstm.setString(1, user.getNome());
            pstm.setString(2, user.getLogin());
            pstm.setString(3, user.getSenha());
 
            pstm.execute();
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            if(pstm != null) pstm.close();
            if(conn != null) conn.close();
        }
    }
    
    
}
    

