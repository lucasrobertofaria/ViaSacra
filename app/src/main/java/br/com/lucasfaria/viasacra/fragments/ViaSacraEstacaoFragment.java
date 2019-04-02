package br.com.lucasfaria.viasacra.fragments;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import br.com.lucasfaria.viasacra.R;
import br.com.lucasfaria.viasacra.activity.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class ViaSacraEstacaoFragment extends Fragment {

    private static float tamanhoFonte = 16.f;
    protected NestedScrollView mScrollView;
    protected TextView titulo;
    protected TextView txNumeroEstacao;
    protected TextView descricao;
    protected TextView txNosTeAdoramos;
    protected TextView txPorque;
    protected TextView txOracoes;
    protected TextView txJaculatoria;
    protected TextView txRespostaJaculatoria;
    protected TextView txJaculatoria2;
    protected TextView txEstacao;

    protected Button btVoltar;
    protected Button btProximo;


    public ViaSacraEstacaoFragment() {
        // Required empty public constructor
    }

    public abstract Integer getIdFragmentAnterior();

    public abstract Integer getIdFragmentProximo();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_estacao, container, false);
        mScrollView = view.findViewById(R.id.scrollView);

        titulo = view.findViewById(R.id.txTituloEstacao);
        txNumeroEstacao = view.findViewById(R.id.txNumeroEstacao);
        descricao = view.findViewById(R.id.txDescricao);
        txNosTeAdoramos = view.findViewById(R.id.txNosVosAdoramos);
        txPorque = view.findViewById(R.id.txPorque);
        txOracoes = view.findViewById(R.id.txOracoes);
        txJaculatoria = view.findViewById(R.id.txJaculatoria);
        txRespostaJaculatoria = view.findViewById(R.id.txRespostaJaculatoria);
        txJaculatoria2 = view.findViewById(R.id.txJaculatoria2);
        txEstacao = view.findViewById(R.id.txEstacao);


        btVoltar = view.findViewById(R.id.btVoltar);
        btProximo = view.findViewById(R.id.btProximo);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.atualizarFragmentVoltar(ViaSacraEstacaoFragment.this);

            }
        });

        btProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.atualizarFragmentProximo(ViaSacraEstacaoFragment.this);
            }
        });


        if(getIdFragmentAnterior() == null){
            btVoltar.setVisibility(View.GONE);
        }

        if(getIdFragmentProximo() == null){
            btProximo.setVisibility(View.GONE);
        }

        atualizaTela();
//        atualizarTamanhoFonte(tamanhoFonte);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        atualizarTamanhoFonte(tamanhoFonte);

    }


    public void atualizarTamanhoFonte(Float tamanhoFonte) {
        this.tamanhoFonte = tamanhoFonte;
        if (txNosTeAdoramos != null && tamanhoFonte != null) {


            txNosTeAdoramos.setTextSize(TypedValue.COMPLEX_UNIT_SP, tamanhoFonte);
            txPorque.setTextSize(TypedValue.COMPLEX_UNIT_SP, tamanhoFonte);
            descricao.setTextSize(TypedValue.COMPLEX_UNIT_SP, tamanhoFonte);
            txOracoes.setTextSize(TypedValue.COMPLEX_UNIT_SP, tamanhoFonte);
            txJaculatoria.setTextSize(TypedValue.COMPLEX_UNIT_SP, tamanhoFonte);
            txRespostaJaculatoria.setTextSize(TypedValue.COMPLEX_UNIT_SP, tamanhoFonte);
            txJaculatoria2.setTextSize(TypedValue.COMPLEX_UNIT_SP, tamanhoFonte);
        }
    }

    protected void trataVisibilidadeOracoes() {
        getTxEstacao().setVisibility(View.GONE);
        getTxNumeroEstacao().setVisibility(View.GONE);
        getTxJaculatoria().setVisibility(View.GONE);
        getTxJaculatoria2().setVisibility(View.GONE);
        getTxRespostaJaculatoria().setVisibility(View.GONE);
        getTxOracoes().setVisibility(View.GONE);
        getTxNosTeAdoramos().setVisibility(View.GONE);
        getTxPorque().setVisibility(View.GONE);
    }

    public NestedScrollView getmScrollView() {
        return mScrollView;
    }

    public void setmScrollView(NestedScrollView mScrollView) {
        this.mScrollView = mScrollView;
    }

    public TextView getTitulo() {
        return titulo;
    }

    public void setTitulo(TextView titulo) {
        this.titulo = titulo;
    }


    public TextView getDescricao() {
        return descricao;
    }

    public void setDescricao(TextView descricao) {
        this.descricao = descricao;
    }

    public TextView getTxNosTeAdoramos() {
        return txNosTeAdoramos;
    }

    public void setTxNosTeAdoramos(TextView txNosTeAdoramos) {
        this.txNosTeAdoramos = txNosTeAdoramos;
    }

    public TextView getTxPorque() {
        return txPorque;
    }

    public void setTxPorque(TextView txPorque) {
        this.txPorque = txPorque;
    }

    public TextView getTxOracoes() {
        return txOracoes;
    }

    public void setTxOracoes(TextView txOracoes) {
        this.txOracoes = txOracoes;
    }

    public TextView getTxJaculatoria() {
        return txJaculatoria;
    }

    public void setTxJaculatoria(TextView txJaculatoria) {
        this.txJaculatoria = txJaculatoria;
    }

    public TextView getTxRespostaJaculatoria() {
        return txRespostaJaculatoria;
    }

    public void setTxRespostaJaculatoria(TextView txRespostaJaculatoria) {
        this.txRespostaJaculatoria = txRespostaJaculatoria;
    }

    public TextView getTxJaculatoria2() {
        return txJaculatoria2;
    }

    public void setTxJaculatoria2(TextView txJaculatoria2) {
        this.txJaculatoria2 = txJaculatoria2;
    }

    public TextView getTxNumeroEstacao() {
        return txNumeroEstacao;
    }

    public void setTxNumeroEstacao(TextView txNumeroEstacao) {
        this.txNumeroEstacao = txNumeroEstacao;
    }

    protected void atualizaTela() {
        txNumeroEstacao.setText(toString());
    }


    public float getTamanhoFonte() {
        return tamanhoFonte;
    }

    public void setTamanhoFonte(float tamanhoFonte) {
        this.tamanhoFonte = tamanhoFonte;
    }

    public TextView getTxEstacao() {
        return txEstacao;
    }

    public void setTxEstacao(TextView txEstacao) {
        this.txEstacao = txEstacao;
    }


    ;


}
