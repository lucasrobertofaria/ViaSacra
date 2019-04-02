package br.com.lucasfaria.viasacra.fragments;


import android.support.v4.app.Fragment;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VEstacaoFragment extends ViaSacraEstacaoFragment {


    public VEstacaoFragment() {
        // Required empty public constructor
    }

    @Override
    public Integer getIdFragmentAnterior() {
        return R.id.estacaoIV;
    }

    @Override
    public Integer getIdFragmentProximo() {
        return R.id.estacaoVI;
    }

    @Override
    protected void atualizaTela() {
        super.atualizaTela();
        descricao.setText(R.string.descricaoEstacaoV);

        titulo.setText(R.string.tituloV);
    }

    @Override
    public String toString() {
        return "V";
    }

}
