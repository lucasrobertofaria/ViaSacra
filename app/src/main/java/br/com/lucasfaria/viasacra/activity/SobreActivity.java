package br.com.lucasfaria.viasacra.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import br.com.lucasfaria.viasacra.R;
import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View sobre = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.icon_via_sacra)
                .setDescription(getResources().getString(R.string.sobre_descricao) + "\n\n\n" + getResources().getString(R.string.descricao_indulgencias))

                .addGroup("Fale conosco")
                .addEmail("lucasrobertofaria@gmail.com", "Envie-me um e-mail com sugestões de melhorias")
                .addGroup("Acesse minhas redes sociais")
                .addFacebook("lucaskuririn", "Facebook")
//                .addTwitter("lucaskuririn", "Twitter")
//                .addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")
//                .addPlayStore("com.ideashower.readitlater.pro")
//                .addGitHub("medyo")
                .addInstagram("lucaskuririn", "Instagram")
//                .addItem(versionElement)
//                .addItem(adsElement)
                .create();

        setContentView(sobre);

    }
}
