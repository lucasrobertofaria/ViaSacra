package br.com.lucasfaria.viasacra.fragments;

import br.com.lucasfaria.viasacra.R;

public class IIEstacaoFragment extends ViaSacraEstacaoFragment {

    public IIEstacaoFragment() {
        // Required empty public constructor
    }

    @Override
    protected void atualizaTela() {
        super.atualizaTela();

        descricao.setText(R.string.descricaoEstacaoII);

        titulo.setText(R.string.tituloII);
        setImagem( getResources().getDrawable(R.drawable.ii));
    }

    @Override
    public String toString() {
        return "II";
    }
}
