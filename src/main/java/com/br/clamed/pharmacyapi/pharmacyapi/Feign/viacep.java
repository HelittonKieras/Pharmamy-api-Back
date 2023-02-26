package com.br.clamed.pharmacyapi.pharmacyapi.Feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="https://viacep.com.br/ws/", name="viacep")
public interface viacep {
    @GetMapping("{cep}/json")
    Endereco buscarEnderecoPor(@PathVariable("cep") String cep);

}