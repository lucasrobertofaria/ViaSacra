package br.com.lucasfaria.viasacra.fragments;

import br.com.lucasfaria.viasacra.R;

public class IVEstacaoFragment extends ViaSacraEstacaoFragment {

    public IVEstacaoFragment() {
        // Required empty public constructor
    }

    @Override
    public Integer getIdFragmentAnterior() {
        return R.id.estacaoIII;
    }

    @Override
    public Integer getIdFragmentProximo() {
        return R.id.estacaoV;

    }


    @Override
    protected void atualizaTela() {
        super.atualizaTela();

        titulo.setText(R.string.tituloIV);
        descricao.setText(R.string.descricaoEstacaoIV);
        txMeditacaoConteudo.setText(R.string.meditacaoIV);
    }
    @Override
    public String toString() {
        return "IV";
    }
}
