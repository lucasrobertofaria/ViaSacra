package br.com.lucasfaria.viasacra.fragments;


import android.support.v4.app.Fragment;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class XIVEstacaoFragment extends ViaSacraEstacaoFragment {


    public XIVEstacaoFragment() {
        // Required empty public constructor
    }

    @Override
    public Integer getIdFragmentAnterior() {
        return R.id.estacaoXIII;
    }

    @Override
    public Integer getIdFragmentProximo() {
        return R.id.nav_oracao_final;
    }

    @Override
    protected void atualizaTela() {
        super.atualizaTela();
        descricao.setText(R.string.descricaoEstacaoXIV);

        titulo.setText(R.string.tituloXIV);
        txMeditacaoConteudo.setText(R.string.meditacaoXIV);
    }

    @Override
    public String toString() {
        return "XIV";
    }

}
