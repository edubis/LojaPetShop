package com.example.lojapetshop;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class TelaProduto extends AppCompatActivity {
    LinearLayout container;

    //Metodo de criação do CardView

    public void addCard(String nomes, String descricoes, Double precos, Double descontos, Integer id) {
        CardView card = (CardView) LayoutInflater.from(this).inflate(R.layout.card, container, false);
        TextView nome = card.findViewById(R.id.nome);
        TextView descricao = card.findViewById(R.id.descricao);
        TextView preco = card.findViewById(R.id.preco);
        TextView desconto = card.findViewById(R.id.desconto);

        nome.setText(nomes);
        descricao.setText(descricoes);
        preco.setText(String.valueOf(precos));
        desconto.setText(String.valueOf(descontos));

        ImageView imagem = (ImageView) card.findViewById(R.id.imageView);
        String url = "https://oficinacordova.azurewebsites.net/android/rest/produto/image/"+id;
        ImageLoader imageLoader = ImageLoader.getInstance();

        imageLoader.init(ImageLoaderConfiguration.createDefault(this));
        imageLoader.displayImage(url, imagem);

        container.addView(card);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_produto);

            container = findViewById(R.id.container);

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://oficinacordova.azurewebsites.net/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            ApiProduto apiProduto = retrofit.create(ApiProduto.class);

            Call<List<Produto>> produtoCall = apiProduto.getProdutos();

            Callback<List<Produto>> callbackProduto = new Callback<List<Produto>>() {
                @Override
                public void onResponse(Call<List<Produto>> call, Response<List<Produto>> response) {
                    List<Produto> produto = response.body();

                    if(response.isSuccessful() && produto != null){
                        for(Produto produtos: produto){
                            addCard(produtos.getNomeProduto(),produtos.getDescProduto(),produtos.getPrecProduto(),produtos.getDescontoPromocao(),produtos.getIdProduto());
                        }
                    }


                }

                @Override
                public void onFailure(Call<List<Produto>> call, Throwable t) {

                }
            };
            produtoCall.enqueue(callbackProduto);



        }
}
