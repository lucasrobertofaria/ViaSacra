package br.com.lucasfaria.viasacra.fragments;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.florent37.materialviewpager.MaterialViewPagerHelper;

import br.com.lucasfaria.viasacra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ViaSacraEstacaoFragment extends Fragment {

    protected NestedScrollView mScrollView;
    protected TextView titulo;
    protected TextView numeroEstacao;
    protected TextView descricao;
    private TextView txNosTeAdoramos;
    private TextView txPorque;
    private TextView txOracoes;
    private TextView txJaculatoria;
    private TextView txRespostaJaculatoria;
    private TextView txJaculatoria2;
    private Drawable imagem;

    private float tamanhoFonte = 16.f;

    public ViaSacraEstacaoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_estacao, container, false);
        mScrollView = view.findViewById(R.id.scrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), mScrollView);
        titulo = view.findViewById(R.id.txTituloEstacao);
        numeroEstacao = view.findViewById(R.id.txNumeroEstacao);
        descricao = view.findViewById(R.id.txDescricao);
        txNosTeAdoramos = view.findViewById(R.id.txNosVosAdoramos);
        txPorque = view.findViewById(R.id.txPorque);
        txOracoes = view.findViewById(R.id.txOracoes);
        txJaculatoria = view.findViewById(R.id.txJaculatoria);
        txRespostaJaculatoria = view.findViewById(R.id.txRespostaJaculatoria);
        txJaculatoria2 = view.findViewById(R.id.txJaculatoria2);


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

    public TextView getNumeroEstacao() {
        return numeroEstacao;
    }

    public void setNumeroEstacao(TextView numeroEstacao) {
        this.numeroEstacao = numeroEstacao;
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


    protected void atualizaTela() {
        numeroEstacao.setText(toString());
    }

    public Drawable getImagem() {
        return imagem;
    }

    public void setImagem(Drawable imagem) {
        this.imagem = imagem;
    }

    public float getTamanhoFonte() {
        return tamanhoFonte;
    }

    public void setTamanhoFonte(float tamanhoFonte) {
        this.tamanhoFonte = tamanhoFonte;
    }
}
