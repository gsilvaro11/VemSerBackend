package com.dbc.pessoaapi.repository;

import com.dbc.pessoaapi.entity.Contato;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ContatoRepository {
    private static List<Contato> listaContato = new ArrayList<>();
    private AtomicInteger COUNTERPESSOA = new AtomicInteger();
    private AtomicInteger COUNTERCONTATO = new AtomicInteger();

    public ContatoRepository() {
        listaContato.add(new Contato(COUNTERCONTATO.incrementAndGet(), COUNTERPESSOA.incrementAndGet(), "1", "101", "teste"));
        listaContato.add(new Contato(COUNTERCONTATO.incrementAndGet(), COUNTERPESSOA.incrementAndGet(), "2", "102", "teste2"));
        listaContato.add(new Contato(COUNTERCONTATO.incrementAndGet(), COUNTERPESSOA.incrementAndGet(), "1", "103", "teste3"));
    }


    public Contato create(Contato contato) {
        contato.setIdContato(COUNTERCONTATO.incrementAndGet());
        contato.setIdPessoa(COUNTERPESSOA.incrementAndGet());
        listaContato.add(contato);
        return contato;
    }

    public List<Contato> list() {
        return listaContato;
    }

    public Contato update(Integer id, Contato contatoAtualizar) throws Exception {
        Contato contatoRecuperado = listaContato.stream()
                .filter(contato -> contato.getIdPessoa().equals(id))
                .findFirst()
                .orElseThrow(() -> new Exception("Contato não encontrado"));
        contatoRecuperado.setIdContato(contatoAtualizar.getIdPessoa());
        contatoRecuperado.setIdContato(id);
        contatoRecuperado.setTipoContato(contatoAtualizar.getTipoContato());
        contatoRecuperado.setNumero(contatoAtualizar.getNumero());
        contatoRecuperado.setDescricao(contatoAtualizar.getDescricao());
        return contatoRecuperado;
    }

    public void delete(Integer id) throws Exception {
        Contato contatoRecuperada = listaContato.stream()
                .filter(contato -> contato.getIdContato().equals(id))
                .findFirst()
                .orElseThrow(() -> new Exception("Contato não encontrado"));
        listaContato.remove(contatoRecuperada);
    }

    public List<Contato> listByNumero(String numero) {
        return listaContato.stream()
                .filter(contato -> contato.getNumero().toUpperCase().contains(numero.toUpperCase()))
                .collect(Collectors.toList());
    }
}
