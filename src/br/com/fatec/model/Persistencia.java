package br.com.fatec.model;

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
    //Excluir / Alterar / Buscar
}
