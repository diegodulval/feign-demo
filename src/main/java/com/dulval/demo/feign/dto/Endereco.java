/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dulval.demo.feign.dto;

import lombok.Data;

/**
 *
 * @author diego
 */
@Data
public class Endereco {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    @Override
    public String toString() {
        return "Endereco{"
                + "cep='" + cep + '\''
                + ", logradouro='" + logradouro + '\''
                + ", complemento='" + complemento + '\''
                + ", bairro='" + bairro + '\''
                + ", localidade='" + localidade + '\''
                + ", uf='" + uf + '\''
                + '}';
    }
}
