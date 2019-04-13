package br.com.lucasfaria.viasacra.activity;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;

import br.com.lucasfaria.viasacra.R;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PackageInfo packageInfo = null;


        AboutPage aboutPage = new AboutPage(this).isRTL(false)
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
                .addInstagram("lucaskuririn", "Instagram");
//                .addItem(versionElement)
//                .addItem(adsElement)
        try {
            packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);

            String versionName = packageInfo.versionName;
            Element versionElement = new Element();
            versionElement.setGravity(Gravity.CENTER);
            versionElement.setTitle("Versão " + versionName);
            aboutPage.addItem(versionElement);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        View sobre = aboutPage.create();

        setContentView(sobre);

    }
}
