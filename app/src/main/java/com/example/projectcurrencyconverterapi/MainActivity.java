package com.example.projectcurrencyconverterapi;

 import android.os.Bundle;
 import android.view.View;
 import android.widget.ArrayAdapter;
 import android.widget.Button;
 import android.widget.EditText;
 import android.widget.Spinner;
 import android.widget.TextView;
 import android.widget.Toast;
 import androidx.appcompat.app.AppCompatActivity;
 import java.util.List;
 import java.util.Map;
 import retrofit2.Call;
 import retrofit2.Callback;
 import retrofit2.Response;

 //Importando as classes do projeto
import com.example.projectcurrencyconverterapi.RetrofitClient;
import com.example.projectcurrencyconverterapi.ExchangeRateService;

public class MainActivity extends AppCompatActivity {
    //componente de interface
    private Spinner spinnerMoedaOrigem, spinnerMoedaDestino;
    private EditText  etValor;
    private Button   btnConverter;
    private TextView   tvResultado;
     // lista de moedas suportadas

    private List<String> moedas = List.of("USD", "BRL", "EUR", "GBP", "JPY");

    //mapa para rmanezar as taxas de cambio obtidas da API
    private Map<String, Double> taxasDeCambio;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Define o layot da atividade

        //inicializa os componentes da interface

        spinnerMoedaOrigem = findViewById(R.id.spinnerMoedaOrigem);
        spinnerMoedaDestino = findViewById(R.id.spinnerMoedaDestino);
        etValor = findViewById(R.id.etValor);
        btnConverter = findViewById(R.id.btnConverter);
        tvResultado = findViewById(R.id.tvResultado);

        //configurar spinner com a lista de moedas

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,  android.R.layout.simple_spinner_item, moedas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMoedaOrigem.setAdapter(adapter);
        spinnerMoedaDestino.setAdapter(adapter);

        //carrega as taxas de cambio da API
        carregarTaxasDeCambio();

        //configura o botão de conversão
        btnConverter.setOnClickListener(view -> converterMoeda());

    }
    // metodo para carregar taxas de cambio da API

    private void carregarTaxasDeCambio(){

    }
    // metodo para converter o valor de uma moeda para outra
    private void converterMoeda(){

    }

}
