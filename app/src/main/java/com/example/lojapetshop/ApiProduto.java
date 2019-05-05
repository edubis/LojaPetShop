package com.example.lojapetshop;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiProduto {

    @GET("/android/rest/produto")
    Call<List<Produto>> getProdutos( );

    @GET("/android/rest/produto/{idProduto}")
    Call<Produto> getProduto(
            @Path("idProduto") Integer id
    );


}
