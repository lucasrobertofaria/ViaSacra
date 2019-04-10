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
    public Integer getIdFragmentAnterior() {
        return R.id.estacaoX;
    }

    @Override
    public Integer getIdFragmentProximo() {
        return R.id.estacaoXII;
    }

    @Override
    protected void atualizaTela() {
        super.atualizaTela();

        descricao.setText(R.string.descricaoEstacaoXI);

        titulo.setText(R.string.tituloXI);
        txMeditacaoConteudo.setText(R.string.meditacaoXI);
    }
    @Override
    public String toString() {
        return "XI";
    }

}
