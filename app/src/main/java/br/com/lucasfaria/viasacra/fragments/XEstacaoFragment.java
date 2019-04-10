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
    public Integer getIdFragmentAnterior() {
        return R.id.estacaoIX;
    }

    @Override
    public Integer getIdFragmentProximo() {
        return R.id.estacaoXI;
    }

    @Override
    protected void atualizaTela() {
        super.atualizaTela();

        descricao.setText(R.string.descricaoEstacaoX);

        titulo.setText(R.string.tituloX);
        txMeditacaoConteudo.setText(R.string.meditacaoX);
    }
    @Override
    public String toString() {
        return "X";
    }

}
