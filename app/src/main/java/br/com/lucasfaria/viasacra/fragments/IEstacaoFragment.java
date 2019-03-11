package br.com.lucasfaria.viasacra.fragments;


import android.support.v4.app.Fragment;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IEstacaoFragment extends ViaSacraEstacaoFragment {


    public IEstacaoFragment() {
        // Required empty public constructor
    }

    @Override
    public String toString() {
        return "I";
    }

    @Override
    protected void atualizaTela() {
        super.atualizaTela();
        descricao.setText(R.string.descricaoEstacaoI);
        titulo.setText(R.string.tituloI);
        setImagem( getResources().getDrawable(R.drawable.i));
    }
}
