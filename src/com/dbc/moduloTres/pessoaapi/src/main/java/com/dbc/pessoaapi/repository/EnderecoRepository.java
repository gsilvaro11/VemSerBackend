package com.dbc.pessoaapi.repository;


import com.dbc.pessoaapi.entity.Contato;
import com.dbc.pessoaapi.entity.Endereco;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Repository
public class EnderecoRepository {
    private static List<Endereco> listaEndereco = new ArrayList<>();
    private final AtomicInteger COUNTERPESSOA = new AtomicInteger();
    private final AtomicInteger COUNTERENDERECO = new AtomicInteger();

    public EnderecoRepository() {
        listaEndereco.add(new Endereco(COUNTERENDERECO.incrementAndGet(), COUNTERPESSOA.incrementAndGet(),
                "1", "longradouro", 105,
                "null", "91420612", "Porto Alegre", "RS", "Brasil"));

        listaEndereco.add(new Endereco(COUNTERENDERECO.incrementAndGet(), COUNTERPESSOA.incrementAndGet(),
                "1", "longradouro", 105,
                "null", "91420612", "Porto Alegre", "RS", "Brasil"));

        listaEndereco.add(new Endereco(COUNTERENDERECO.incrementAndGet(), COUNTERPESSOA.incrementAndGet(),
                "1", "longradouro", 105,
                "null", "91420612", "Porto Alegre", "RS", "Brasil"));
    }

    public List<Endereco> list() {
        return listaEndereco;
    }

    public Endereco listByEndereco(Integer id) throws Exception{
        return listaEndereco.stream()
                .filter(endereco -> endereco.getIdEndereco().equals(id))
                .findFirst().orElseThrow(() -> new Exception("Erro"));

    }

    public List<Endereco> listByPessoa(Integer idPessoa){
        return listaEndereco.stream()
                .filter(endereco -> endereco.getIdPessoa().equals(idPessoa))
                .collect(Collectors.toList());
    }

    public Endereco create(Endereco endereco) {
        endereco.setIdEndereco(COUNTERENDERECO.incrementAndGet());
        listaEndereco.add(endereco);
        return endereco;
    }

    public Endereco update(Integer id, Endereco enderecoAtualizado) throws Exception {
        Endereco enderecoRecuperado = listaEndereco.stream()
                .filter(contato -> contato.getIdEndereco().equals(id))
                .findFirst()
                .orElseThrow(() -> new Exception("Contato não encontrado"));
        enderecoRecuperado.setIdEndereco(id);
        enderecoRecuperado.setIdPessoa(enderecoAtualizado.getIdPessoa());
        enderecoRecuperado.setTipo(enderecoAtualizado.getTipo());
        enderecoRecuperado.setLogradouro(enderecoAtualizado.getLogradouro());
        enderecoRecuperado.setNumero(enderecoAtualizado.getNumero());
        enderecoRecuperado.setComplemento(enderecoAtualizado.getComplemento());
        enderecoRecuperado.setCep(enderecoAtualizado.getCep());
        enderecoRecuperado.setCidade(enderecoAtualizado.getCidade());
        enderecoRecuperado.setEstado(enderecoAtualizado.getEstado());
        enderecoRecuperado.setPais(enderecoAtualizado.getPais());
        return enderecoRecuperado;
    }

    public void delete(Integer id) throws Exception {
        Endereco enderecoRecuperado = listaEndereco.stream()
                .filter(endereco -> endereco.getIdEndereco().equals(id))
                .findFirst()
                .orElseThrow(() -> new Exception("Contato não encontrado"));
        listaEndereco.remove(enderecoRecuperado);
    }

}
