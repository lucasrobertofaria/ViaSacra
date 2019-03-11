package br.com.lucasfaria.viasacra.fragments;


import android.support.v4.app.Fragment;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VIEstacaoFragment extends ViaSacraEstacaoFragment {


    public VIEstacaoFragment() {
        // Required empty public constructor
    }


    @Override
    protected void atualizaTela() {
        super.atualizaTela();
        descricao.setText(R.string.descricaoEstacaoVI);

        titulo.setText(R.string.tituloVI);
        setImagem( getResources().getDrawable(R.drawable.vi));
    }
    @Override
    public String toString() {
        return "VI";
    }

}
