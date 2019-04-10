package br.com.lucasfaria.viasacra.fragments;


import android.support.v4.app.Fragment;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VIEstacaoFragment extends ViaSacraEstacaoFragment {


    public VIEstacaoFragment() {
        // Required empty public constructor
    }


    @Override
    public Integer getIdFragmentAnterior() {
        return R.id.estacaoV;
    }

    @Override
    public Integer getIdFragmentProximo() {
        return R.id.estacaoVII;
    }

    @Override
    protected void atualizaTela() {
        super.atualizaTela();
        descricao.setText(R.string.descricaoEstacaoVI);

        titulo.setText(R.string.tituloVI);
        txMeditacaoConteudo.setText(R.string.meditacaoVI);
    }
    @Override
    public String toString() {
        return "VI";
    }

}
