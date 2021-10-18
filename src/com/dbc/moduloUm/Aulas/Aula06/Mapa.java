package com.dbc.Aulas.Aula06;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> pessoasPorCpf = new HashMap<>();
        pessoasPorCpf.put("Guilherme", "85622326");
        pessoasPorCpf.put("Laura", "86562326");

        System.out.println(pessoasPorCpf);
    }
}
