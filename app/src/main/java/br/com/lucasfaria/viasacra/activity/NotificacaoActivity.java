package br.com.lucasfaria.viasacra.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import br.com.lucasfaria.viasacra.R;
import br.com.lucasfaria.viasacra.model.Mensagem;

public class NotificacaoActivity extends AppCompatActivity {
    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();

    private TextView txTitulo;
    private TextView txConteudo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacao);

        txTitulo = findViewById(R.id.txTitulo);
        txConteudo = findViewById(R.id.txConteudo);

        DatabaseReference mensagem = reference.child("mensagens").child("001");


        mensagem.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Mensagem mensagem = dataSnapshot.getValue(Mensagem.class);
                txTitulo.setText(mensagem.getTitulo());
                txConteudo.setText(mensagem.getConteudo());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    @Override
    public void finish() {

        super.finish();
        startActivity(new Intent(this, MainActivity.class));
    }
}
