package br.com.lucasfaria.viasacra.fragments;


import android.support.v4.app.Fragment;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IIIEstacaoFragment extends ViaSacraEstacaoFragment {


    public IIIEstacaoFragment() {
        // Required empty public constructor
    }


    @Override
    protected void atualizaTela() {
        super.atualizaTela();
        descricao.setText(R.string.descricaoEstacaoIII);

        titulo.setText(R.string.tituloIII);
        setImagem( getResources().getDrawable(R.drawable.iii));
    }
    @Override
    public String toString() {
        return "III";
    }

}
