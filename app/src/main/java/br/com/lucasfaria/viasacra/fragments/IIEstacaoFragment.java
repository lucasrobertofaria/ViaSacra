package br.com.lucasfaria.viasacra.fragments;

import br.com.lucasfaria.viasacra.R;

public class IIEstacaoFragment extends ViaSacraEstacaoFragment {

    public IIEstacaoFragment() {
        // Required empty public constructor
    }

    @Override
    public Integer getIdFragmentAnterior() {
        return R.id.estacaoI;
    }

    @Override
    public Integer getIdFragmentProximo() {
        return R.id.estacaoIII;
    }

    @Override
    protected void atualizaTela() {
        super.atualizaTela();

        descricao.setText(R.string.descricaoEstacaoII);

        titulo.setText(R.string.tituloII);
        txMeditacaoConteudo.setText(R.string.meditacaoII);
    }

    @Override
    public String toString() {
        return "II";
    }
}
