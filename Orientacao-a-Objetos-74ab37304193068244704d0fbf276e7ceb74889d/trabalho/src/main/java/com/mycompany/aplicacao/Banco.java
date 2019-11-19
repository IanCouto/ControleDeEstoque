/*
Álvaro Domingues de Freitas     Matrícula: 201876007
Arthur Rodrigues Fernandes      Matrícula: 201835005
Augusto Castilho Medeiros       Matrícula: 201876044
Ian Couto de Paula		Matrícula: 201876002
Matheus Henrique Rubio		Matrícula: 201876036
 */
package com.mycompany.aplicacao;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Augusto

 */
public class Banco {

    Estoque tabela;
    RegistroDeVendas tabela2;
    private Gson gson;

    // converte objetos Java para JSON
    private String json;

    /**
     * Construtor da classe Banco caso seja estoque
     * @param estoque - Recebe o estoque
     */
    public Banco(Estoque estoque) {
        tabela = new Estoque();
        tabela = estoque;
        gson = new Gson();
        json = gson.toJson(tabela);
    }
    
    /**
     * Construtor da classe Banco caso seja lista de produtos vendidos
     * @param listaProdutosVendidos - Recebe a lista de produtos vendidos 
     */
    public Banco(RegistroDeVendas listaProdutosVendidos) {
        tabela2 = new RegistroDeVendas();
        tabela2 = listaProdutosVendidos;
        gson = new Gson();
        json = gson.toJson(tabela2);
    }

    /**
     * @param x - Nome do arquivo ao qual se destina o banco de dados (estoque ou registroVendas)
     * @throws IOException - precaução para casos de erros de leitura de
     * arquivos
     */
    public void escreveArquivo(String x) throws IOException {
        try {

            FileWriter writer = new FileWriter(x+".json");
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return tabela - retona o estoque que foi traduzido para Java
     * @throws IOException - precaução para casos de erros de leitura de
     * arquivos
     */
    public Estoque pegaArquivo() throws IOException {
        try {

            BufferedReader br = new BufferedReader(new FileReader("estoque.json"));
            tabela = gson.fromJson(br, Estoque.class);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tabela;
    }
    
    public RegistroDeVendas pegaArquivo2() throws IOException{
        try{
            
            BufferedReader br = new BufferedReader(new FileReader("registroVendas.json"));
            tabela2 = gson.fromJson(br, RegistroDeVendas.class);
        
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tabela2;
    }
}
