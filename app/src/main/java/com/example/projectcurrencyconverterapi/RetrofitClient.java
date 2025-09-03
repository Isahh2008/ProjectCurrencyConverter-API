// Classe responsaves por configurar e fornecer a instancia retrofit
package com.example.projectcurrencyconverterapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.example.projectcurrencyconverterapi.ExchangeRateService;
public class RetrofitClient {
    //URL base da API que fornace taxas de cambio
    private static final String BASE_URL = "https://vó.exchangerate-api.com/";
    //instancia do Retrofit que será usada para fazer as requisiçoes

    private static Retrofit retrofit = null;

    /*
    Metodo estatíco que retorna uma instancia do serviço de taxas de cambio
    @return Uma instancia de Exchangfe RateService para realizar chamadas á API
     */
    public static ExchangeRateService getInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ExchangeRateService.class);
    }
}
