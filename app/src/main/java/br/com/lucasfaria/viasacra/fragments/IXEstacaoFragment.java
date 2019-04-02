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
    public Integer getIdFragmentAnterior() {
        return R.id.estacaoVIII;
    }

    @Override
    public Integer getIdFragmentProximo() {
        return R.id.estacaoX;
    }

    @Override
    protected void atualizaTela() {
        super.atualizaTela();

        descricao.setText(R.string.descricaoEstacaoIX);

        titulo.setText(R.string.tituloIX);
    }
    @Override
    public String toString() {
        return "IX";
    }

}
