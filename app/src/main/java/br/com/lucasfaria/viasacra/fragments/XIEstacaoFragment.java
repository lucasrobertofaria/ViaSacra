package br.com.lucasfaria.viasacra.fragments;


import android.support.v4.app.Fragment;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class XIEstacaoFragment extends ViaSacraEstacaoFragment {


    public XIEstacaoFragment() {
        // Required empty public constructor
    }



    @Override
    protected void atualizaTela() {
        super.atualizaTela();

        descricao.setText(R.string.descricaoEstacaoXI);

        titulo.setText(R.string.tituloXI);
        setImagem( getResources().getDrawable(R.drawable.xi));
    }
    @Override
    public String toString() {
        return "XI";
    }

}
