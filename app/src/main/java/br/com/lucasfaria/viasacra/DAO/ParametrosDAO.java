package br.com.lucasfaria.viasacra.DAO;

import android.content.Context;
import android.content.SharedPreferences;

public class ParametrosDAO {
    private SharedPreferences preferences;
    private static final String ARQUIVO_PREFERENCIAS = "ArquivoParametros";
    private Context context;
    private SharedPreferences.Editor editor;
    private final static String CHAVE_NOME = "tamanhoFonte";

    public ParametrosDAO(Context context) {
        this.context = context;
        preferences = context.getSharedPreferences(Context.AUDIO_SERVICE, Context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    public void salvarTamanhoFonte(Float tamanhoFonte) {
        editor.putFloat(CHAVE_NOME, tamanhoFonte);
        editor.commit();
    }

    public Float recuperarTamanhoFonte() {
        if (preferences.contains(CHAVE_NOME))
            return preferences.getFloat(CHAVE_NOME, 0.f);
        else
            return null;
    }
}
