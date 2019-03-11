package br.com.lucasfaria.viasacra.fragments;


import android.support.v4.app.Fragment;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IXEstacaoFragment extends ViaSacraEstacaoFragment {


    public IXEstacaoFragment() {
        // Required empty public constructor
    }


    @Override
    protected void atualizaTela() {
        super.atualizaTela();

        descricao.setText(R.string.descricaoEstacaoIX);

        titulo.setText(R.string.tituloIX);
        setImagem( getResources().getDrawable(R.drawable.ix));
    }
    @Override
    public String toString() {
        return "IX";
    }

}
