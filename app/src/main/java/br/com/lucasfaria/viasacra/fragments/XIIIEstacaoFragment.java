package br.com.lucasfaria.viasacra.fragments;


import android.support.v4.app.Fragment;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class XIIIEstacaoFragment extends ViaSacraEstacaoFragment {


    public XIIIEstacaoFragment() {
        // Required empty public constructor
    }


    @Override
    protected void atualizaTela() {
        super.atualizaTela();
        descricao.setText(R.string.descricaoEstacaoXIII);

        titulo.setText(R.string.tituloXIII);
        setImagem( getResources().getDrawable(R.drawable.xiii));
    }
    @Override
    public String toString() {
        return "XIII";
    }

}
