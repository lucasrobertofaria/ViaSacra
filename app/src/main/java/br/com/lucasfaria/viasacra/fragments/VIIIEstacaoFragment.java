package br.com.lucasfaria.viasacra.fragments;


import android.support.v4.app.Fragment;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VIIIEstacaoFragment extends ViaSacraEstacaoFragment {


    public VIIIEstacaoFragment() {
        // Required empty public constructor
    }


    @Override
    protected void atualizaTela() {
        super.atualizaTela();

        descricao.setText(R.string.descricaoEstacaoVIII);

        titulo.setText(R.string.tituloVIII);
        setImagem( getResources().getDrawable(R.drawable.viii));
    }
    @Override
    public String toString() {
        return "VIII";
    }

}
