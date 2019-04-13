package br.com.lucasfaria.viasacra.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Arrays;
import java.util.List;

import br.com.lucasfaria.viasacra.R;
import br.com.lucasfaria.viasacra.dao.ParametrosDAO;
import br.com.lucasfaria.viasacra.fragments.IEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.IIEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.IIIEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.IVEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.IXEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.OracaoFinalFragment;
import br.com.lucasfaria.viasacra.fragments.OracaoInicialFragment;
import br.com.lucasfaria.viasacra.fragments.VEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.VIEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.VIIEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.VIIIEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.ViaSacraEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.XEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.XIEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.XIIEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.XIIIEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.XIVEstacaoFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ViaSacraEstacaoFragment fragmentCurrent = null;
    private List<ViaSacraEstacaoFragment> fragmentList = Arrays.asList(new OracaoInicialFragment(), new IEstacaoFragment(), new IIEstacaoFragment(), new IIIEstacaoFragment(), new IVEstacaoFragment(), new VEstacaoFragment(), new VIEstacaoFragment(), new VIIEstacaoFragment(),
            new VIIIEstacaoFragment(), new IXEstacaoFragment(), new XEstacaoFragment(), new XIEstacaoFragment(), new XIIEstacaoFragment(), new XIIIEstacaoFragment(), new XIVEstacaoFragment(), new OracaoFinalFragment());
    private DisplayMetrics metrics;
    private Float tamanhoFonte;
    private ParametrosDAO dao;

    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dao = new ParametrosDAO(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.nav_sobre) {
            startActivity(new Intent(this, SobreActivity.class));
        }

        if (fragmentCurrent != null && fragmentCurrent.getDescricao() != null) {

            metrics = getApplicationContext().getResources().getDisplayMetrics();
            tamanhoFonte = fragmentCurrent.getDescricao().getTextSize() / metrics.density;
            //noinspection SimplifiableIfStatement
            if (id == R.id.actionZoomDown) {


                if (tamanhoFonte > 10.f) {
                    atualizarTamanhoFonte(tamanhoFonte - 2.f);
                }


                return true;
            } else if (id == R.id.actionZoomUp) {

                if ( tamanhoFonte < 40.f) {
                    atualizarTamanhoFonte(tamanhoFonte + 2.f);
                }


            }

//        } else if (id == R.id.actionSobre) {
//
//            startActivity(new Intent(this, SobreActivity.class));

        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();


        atualizarFragment(id);
        atualizarTamanhoFonte(dao.recuperarTamanhoFonte());
        return true;
    }

    private void atualizarFragment(int id) {
        Integer estacao = getNumeroEstacao(id);

        if (estacao != null) {
            fragmentCurrent = fragmentList.get(estacao);
        }
        atualizarFragment();
    }

    private void atualizarFragment() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameContainer, fragmentCurrent);
        fragmentTransaction.commit();
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    private void atualizarTamanhoFonte(Float tamanho) {
        tamanhoFonte = tamanho;


        fragmentCurrent.atualizarTamanhoFonte(tamanhoFonte);

        dao.salvarTamanhoFonte(tamanhoFonte);

    }

    private Integer getNumeroEstacao(int id) {
        Integer estacao = null;
        if (id == R.id.nav_oracao_inicial) {
            estacao = 0;
        } else if (id == R.id.estacaoI) {
            estacao = 1;
        } else if (id == R.id.estacaoII) {
            estacao = 2;

        } else if (id == R.id.estacaoIII) {
            estacao = 3;
        } else if (id == R.id.estacaoIV) {
            estacao = 4;
        } else if (id == R.id.estacaoV) {
            estacao = 5;
        } else if (id == R.id.estacaoVI) {
            estacao = 6;
        } else if (id == R.id.estacaoVII) {
            estacao = 7;
        } else if (id == R.id.estacaoVIII) {
            estacao = 8;
        } else if (id == R.id.estacaoIX) {
            estacao = 9;
        } else if (id == R.id.estacaoX) {
            estacao = 10;
        } else if (id == R.id.estacaoXI) {
            estacao = 11;
        } else if (id == R.id.estacaoXII) {
            estacao = 12;
        } else if (id == R.id.estacaoXIII) {
            estacao = 13;
        } else if (id == R.id.estacaoXIV) {
            estacao = 14;
        } else if (id == R.id.nav_oracao_final) {
            estacao = 15;
        }
        return estacao;
    }

    public void atualizarFragmentVoltar(ViaSacraEstacaoFragment newFragment) {

        navigationView.setCheckedItem(newFragment.getIdFragmentAnterior());
        atualizarFragment(newFragment.getIdFragmentAnterior());

    }

    public void atualizarFragmentProximo(ViaSacraEstacaoFragment newFragment) {

        navigationView.setCheckedItem(newFragment.getIdFragmentProximo());
        atualizarFragment(newFragment.getIdFragmentProximo());

    }
}
