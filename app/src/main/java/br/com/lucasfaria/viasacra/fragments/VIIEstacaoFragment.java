package br.com.lucasfaria.viasacra.fragments;


import android.support.v4.app.Fragment;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VIIEstacaoFragment extends ViaSacraEstacaoFragment {


    public VIIEstacaoFragment() {
        // Required empty public constructor
    }

    @Override
    protected void atualizaTela() {
        super.atualizaTela();
        descricao.setText(R.string.descricaoEstacaoVII);

        titulo.setText(R.string.tituloVII);
        setImagem( getResources().getDrawable(R.drawable.vii));
    }

    @Override
    public String toString() {
        return "VII";
    }
}
