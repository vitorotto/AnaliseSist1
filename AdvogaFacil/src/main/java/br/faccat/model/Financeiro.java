package br.faccat.model;

import br.faccat.model.Cliente;

import java.time.LocalDateTime;

public class Financeiro {
    private Float valor;
    private Cliente dadosCliente;
    private LocalDateTime dataPagamento;

    public Financeiro(Float valor, LocalDateTime dataPagamento, Cliente dadosCliente) {
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.dadosCliente = dadosCliente;
    }

    public Float getValor() {
        return valor;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public Cliente getDadosCliente() {
        return dadosCliente;
    }

    public void registrarPagamento(Cliente dadosCliente, String valor) {

    }

    public void consultarPagamento(Cliente dadosCliente) {

    }
}
