/*
 Álvaro Domingues de Freitas    Matrícula: 201876007
 Augusto Castilho Medeiros      Matrícula: 201876044
 Ian Couto de Paula		Matrícula: 201876002
 Matheus Henrique Rubio		Matrícula: 201876036
 */
package Classes;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Banco {

    Estoque tabela;
    private Gson gson;

    // converte objetos Java para JSON
    private String json;

    /**
     * Construtor da classe Banco
     * @param estoque - Recebe o estoque
     */
    public Banco(Estoque estoque) {
        tabela = new Estoque();
        tabela = estoque;
        gson = new Gson();
        json = gson.toJson(tabela);
    }

    /**
     * @throws IOException - precaução para casos de erros de leitura de
     * arquivos
     */
    public void escreveArquivo() throws IOException {
        try {
            FileWriter writer = new FileWriter("biblioteca.json");
            writer.write(json);
            writer.close();
        } catch (IOException e) {
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
}
