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
    protected void atualizaTela() {
        super.atualizaTela();
        descricao.setText(R.string.descricaoEstacaoXIV);

        titulo.setText(R.string.tituloXIV);
//        setImagem( getResources().getDrawable(R.drawable.xiv));
    }

    @Override
    public String toString() {
        return "XIV";
    }

}
