package br.com.lucasfaria.viasacra.acitivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;

import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

import java.util.Arrays;
import java.util.List;

import br.com.lucasfaria.viasacra.DAO.ParametrosDAO;
import br.com.lucasfaria.viasacra.R;
import br.com.lucasfaria.viasacra.fragments.IEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.IIEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.IIIEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.IVEstacaoFragment;
import br.com.lucasfaria.viasacra.fragments.IXEstacaoFragment;
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

public class MainActivity extends AppCompatActivity {

    private MaterialViewPager mViewPager;

    private List<ViaSacraEstacaoFragment> fragmentList = Arrays.asList(new IEstacaoFragment(), new IIEstacaoFragment(), new IIIEstacaoFragment(), new IVEstacaoFragment(), new VEstacaoFragment(), new VIEstacaoFragment(), new VIIEstacaoFragment(),
            new VIIIEstacaoFragment(), new IXEstacaoFragment(), new XEstacaoFragment(), new XIEstacaoFragment(), new XIIEstacaoFragment(), new XIIIEstacaoFragment(), new XIVEstacaoFragment());

    private DisplayMetrics metrics;
    private Float tamanhoFonte;
    private ParametrosDAO dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.materialViewPager);
        dao = new ParametrosDAO(getApplicationContext());

        FragmentPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());


        ViewPager viewPager = mViewPager.getViewPager();
        viewPager.setAdapter(adapter);


        configurarToolbar();
        Float tamanhoRecuperado = dao.recuperarTamanhoFonte();
        if (tamanhoRecuperado != null && tamanhoRecuperado != 0.f) {
            atualizarTamanhoFonte(tamanhoRecuperado);
        }


        mViewPager.getPagerTitleStrip().setViewPager(mViewPager.getViewPager());


        mViewPager.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                return HeaderDesign.fromColorAndDrawable(Color.GRAY, fragmentList.get(page).getImagem());

            }
        });


    }

    private void configurarToolbar() {
        Toolbar toolbar = mViewPager.getToolbar();

        if (toolbar != null) {
            setSupportActionBar(toolbar);

            ActionBar actionBar = getSupportActionBar();
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setDisplayShowHomeEnabled(false);
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setDisplayUseLogoEnabled(false);
//            actionBar.setHomeButtonEnabled(false);
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
        metrics = getApplicationContext().getResources().getDisplayMetrics();
        tamanhoFonte = fragmentList.get(0).getDescricao().getTextSize() / metrics.density;
        //noinspection SimplifiableIfStatement
        if (id == R.id.actionZoomDown) {


            if (tamanhoFonte != null && tamanhoFonte > 10.f) {
                atualizarTamanhoFonte(tamanhoFonte - 1.f);
            }


            return true;
        } else if (id == R.id.actionZoomUp) {

            if (tamanhoFonte != null && tamanhoFonte < 40.f) {
                atualizarTamanhoFonte(tamanhoFonte + 1.f);
            }


        } else if (id == R.id.actionSobre) {

            startActivity(new Intent(this, SobreActivity.class));

        }

        return super.onOptionsItemSelected(item);
    }

    private void atualizarTamanhoFonte(float tamanho) {
        tamanhoFonte = tamanho;
        for (ViaSacraEstacaoFragment fragment : fragmentList) {
            fragment.atualizarTamanhoFonte(tamanhoFonte);
        }
        dao.salvarTamanhoFonte(tamanhoFonte);
    }


    public class MyPagerAdapter extends FragmentPagerAdapter {
        private int NUM_ITEMS = 14;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);

        }


        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentList.get(position).toString();

        }

    }
}
