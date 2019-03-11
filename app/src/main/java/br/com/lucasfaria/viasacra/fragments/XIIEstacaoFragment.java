package br.com.lucasfaria.viasacra.fragments;


import android.support.v4.app.Fragment;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class XIIEstacaoFragment extends ViaSacraEstacaoFragment {


    public XIIEstacaoFragment() {
        // Required empty public constructor
    }


    @Override
    protected void atualizaTela() {
        super.atualizaTela();
        descricao.setText(R.string.descricaoEstacaoXII);

        titulo.setText(R.string.tituloXII);
        setImagem( getResources().getDrawable(R.drawable.xii));
    }
    @Override
    public String toString() {
        return "XII";
    }

}
