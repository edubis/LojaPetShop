package com.example.lojapetshop;

public class Produto {

    private Double descontoPromocao;
    private String descProduto;
    private Double precProduto;
    private Integer idProduto;
    private String nomeProduto;
    private Integer idCategoria;
    private Integer qtdMinEstoque;
    private Boolean ativoProduto;

    public Double getDescontoPromocao() {
        return descontoPromocao;
    }

    public void setDescontoPromocao(Double descontoPromocao) {
        this.descontoPromocao = descontoPromocao;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public Double getPrecProduto() {
        return precProduto;
    }

    public void setPrecProduto(Double precProduto) {
        this.precProduto = precProduto;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getQtdMinEstoque() {
        return qtdMinEstoque;
    }

    public void setQtdMinEstoque(Integer qtdMinEstoque) {
        this.qtdMinEstoque = qtdMinEstoque;
    }

    public Boolean getAtivoProduto() {
        return ativoProduto;
    }

    public void setAtivoProduto(Boolean ativoProduto) {
        this.ativoProduto = ativoProduto;
    }
}
