package br.com.alura.screenmatch.service;

public interface IConverteDados {
    //Utiliza o T para simbolizar um genérico (Generics) entre os sinais <>
   <T> T obterDados(String json, Class<T> classe);
}
