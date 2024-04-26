package br.com.fatec.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Persistencia {
    public static ArrayList<Usuario> lista = new ArrayList<Usuario>();
    public static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    
    public boolean cadastrar(Usuario user){
        if(user != null){
            lista.add(user);
            return true;
        }
        return false;
    }
    
    public boolean cadastrarProduto(Produto prod){
        if(prod != null){
            listaProdutos.add(prod);
            return true;
        }
        return false;
    }
    
    public static ArrayList<Usuario> getLista(){
        return lista;
    }
    public static ArrayList<Produto> getListaProdutos(){
        return listaProdutos;
    }
    
    public static void importar(String nomedoarquivo){
        try {
            FileReader arq = new FileReader(nomedoarquivo);
            BufferedReader lerArq = new BufferedReader(arq);
            String id,nome,login,senha;
            id = lerArq.readLine();
            
            while (id != null) {
                nome = lerArq.readLine();
                login = lerArq.readLine();
                senha = lerArq.readLine();
                lista.add(new Usuario(nome,login,senha));
                id = lerArq.readLine();
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.", e.getMessage());
        }
    }
    
    public static void exportar(String nomedoarquivo) throws IOException{
            FileWriter arq = new FileWriter(nomedoarquivo);
            PrintWriter gravarArq = new PrintWriter(arq);
            
            for (Usuario user : lista) {
                gravarArq.print(user + "\n");
            }
            
            gravarArq.close();    
    }




}
