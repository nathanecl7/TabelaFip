package br.com.alura.tabelaFip;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados converte = new ConverteDados();
    private String endereco = "https://parallelum.com.br/fipe/api/v1/";
    public void exibeMenu (){
    var menu = """
    *** OPÇÕES ***
    Carro
    Moto
    Caminhão
    Digite uma das opções para consulta:
    """;
        System.out.println(menu);
    var opcao = leitura.nextLine();
}
}
