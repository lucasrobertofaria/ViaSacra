package br.com.lucasfaria.viasacra.fragments;


import android.support.v4.app.Fragment;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class XEstacaoFragment extends ViaSacraEstacaoFragment {


    public XEstacaoFragment() {
        // Required empty public constructor
    }


    @Override
    protected void atualizaTela() {
        super.atualizaTela();

        descricao.setText(R.string.descricaoEstacaoX);

        titulo.setText(R.string.tituloX);
        setImagem( getResources().getDrawable(R.drawable.x));
    }
    @Override
    public String toString() {
        return "X";
    }

}
