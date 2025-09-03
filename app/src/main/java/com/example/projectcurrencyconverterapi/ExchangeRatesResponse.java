//Modelo de dados (DTO -Data Transfer Object) que apresenta a resposta
package com.example.projectcurrencyconverterapi;

import java.util.HashMap; //importa a classe map da biblioteca java, usada para armazenar pares de chaves valor
import java.util.Map; //importa a classe Map da biblioteca java, usada para armazenar pares chave-valor
public class ExchangeRatesResponse {
    // declara um mapa que armazena taxas de conversao em moedas. (ex, USD, EUR, GBP)
    // A chave (String) representa o codigo da moeda e o valor (Double) representa a taxa de conversao

    private Map<String, Double> conversion_rates = new HashMap<>();
    //metodo publico para acessar as taxas de conversao
    //retorna o mapa de taxas de conversao

    public Map<String, Double> getConversion_rates(){
        return conversion_rates;
    }
}
