package br.com.lucasfaria.viasacra.fragments;


import android.support.v4.app.Fragment;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OracaoInicialFragment extends ViaSacraEstacaoFragment {


    public OracaoInicialFragment() {
        // Required empty public constructor
    }

    @Override
    public Integer getIdFragmentAnterior() {
        return null;
    }

    @Override
    public Integer getIdFragmentProximo() {
        return R.id.estacaoI;
    }

    @Override
    public String toString() {
        return "Oração Inicial";
    }

    @Override
    protected void atualizaTela() {
        super.atualizaTela();
        descricao.setText(R.string.descricaoOracaoInicial);
        titulo.setText(R.string.tituloOracaoInicial);
        trataVisibilidadeOracoes();

    }
}
