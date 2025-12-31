package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Certificado {
    private LocalDate dataEmissao = LocalDate.now();
    private Dev dev;

    public Certificado() {

    }

    public Certificado(Dev dev) {
        this.dataEmissao = dataEmissao;
        this.dev = dev;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Dev getDev() {
        return dev;
    }

    public void setDev(Dev dev) {
        this.dev = dev;
    }

}
