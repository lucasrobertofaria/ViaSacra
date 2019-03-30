package br.com.lucasfaria.viasacra.fragments;


import android.support.v4.app.Fragment;
import android.view.View;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OracaoFinalFragment extends ViaSacraEstacaoFragment {


    public OracaoFinalFragment() {
        // Required empty public constructor
    }

    @Override
    public String toString() {
        return "Oração Final";
    }

    @Override
    protected void atualizaTela() {
        super.atualizaTela();
        descricao.setText(R.string.descricaoOracaoFinal);
        titulo.setText(R.string.tituloOracaoFinal);

        trataVisibilidadeOracoes();
        setImagem(getResources().getDrawable(R.drawable.i));
    }


}
