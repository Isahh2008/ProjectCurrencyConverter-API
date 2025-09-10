//Interface que identifica o endpoint da API que será consumida pelo retrofit
package com.example.projectcurrencyconverterapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ExchangeRateService {
    /**
     * *Método para obter taxas de cambio recentes
     */

    @GET("/v6/{apikey}/latest/{baseCurrency}")
        Call<ExchangeRatesResponse> getExcengeRates(

                @Path("apikey") String apikey,
                //subistitui {apikey} na URL com valor ornecido
                @Path("baseCurrency") String baseCurrency
                //substitui {baseCurrency} na URL com valor fornecido
    );

}
