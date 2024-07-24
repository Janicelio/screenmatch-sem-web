package br.com.janicelio.scrennmatch_sem_web.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
