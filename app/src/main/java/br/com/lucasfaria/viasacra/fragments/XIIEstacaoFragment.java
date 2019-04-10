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
    public Integer getIdFragmentAnterior() {
        return R.id.estacaoXI;
    }

    @Override
    public Integer getIdFragmentProximo() {
        return R.id.estacaoXIII;
    }

    @Override
    protected void atualizaTela() {

        super.atualizaTela();
        descricao.setText(R.string.descricaoEstacaoXII);

        titulo.setText(R.string.tituloXII);
        txMeditacaoConteudo.setText(R.string.meditacaoXII);
    }
    @Override
    public String toString() {
        return "XII";
    }

}
