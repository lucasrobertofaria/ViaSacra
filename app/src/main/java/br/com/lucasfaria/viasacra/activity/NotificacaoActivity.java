package br.com.lucasfaria.viasacra.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import br.com.lucasfaria.viasacra.R;
import br.com.lucasfaria.viasacra.model.Mensagem;

public class NotificacaoActivity extends AppCompatActivity {
    private DatabaseReference reference;

    private TextView txTitulo;
    private TextView txConteudo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getApplicationContext(), "passou", Toast.LENGTH_LONG).show();;
        setContentView(R.layout.activity_notificacao);
        Toast.makeText(getApplicationContext(), "passou aqui 1", Toast.LENGTH_LONG).show();;
        Log.i("aa","passou aqui");

        txTitulo = findViewById(R.id.txTitulo);
        txConteudo = findViewById(R.id.txConteudo);

    }

    @Override
    public void finish() {
        Toast.makeText(getApplicationContext(), "passou aqui 2", Toast.LENGTH_LONG).show();;

        super.finish();
        startActivity(new Intent(this, MainActivity.class));
    }
}
