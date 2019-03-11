package br.com.lucasfaria.viasacra.fragments;

import br.com.lucasfaria.viasacra.R;

public class IVEstacaoFragment extends ViaSacraEstacaoFragment {

    public IVEstacaoFragment() {
        // Required empty public constructor
    }

    @Override
    protected void atualizaTela() {
        super.atualizaTela();

        titulo.setText(R.string.tituloIV);
        descricao.setText(R.string.descricaoEstacaoIV);
        setImagem( getResources().getDrawable(R.drawable.iv));
    }
    @Override
    public String toString() {
        return "IV";
    }
}
