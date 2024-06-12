package br.com.alura.tabelaFip;

public interface IConverteDados {
    <T> T obterDados (String json, Class<T>classe);
}
