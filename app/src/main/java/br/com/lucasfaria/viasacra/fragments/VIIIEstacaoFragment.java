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
    public Integer getIdFragmentAnterior() {
        return R.id.estacaoVII;
    }

    @Override
    public Integer getIdFragmentProximo() {
        return R.id.estacaoIX;
    }

    @Override
    protected void atualizaTela() {
        super.atualizaTela();

        descricao.setText(R.string.descricaoEstacaoVIII);

        titulo.setText(R.string.tituloVIII);
        txMeditacaoConteudo.setText(R.string.meditacaoVIII);
    }
    @Override
    public String toString() {
        return "VIII";
    }

}
