package br.com.juaanhs.sliderviewpager.ui.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.juaanhs.sliderviewpager.R;
import br.com.juaanhs.sliderviewpager.ui.adapter.SlideAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SlideAdapter slideAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);
        slideAdapter = new SlideAdapter(getApplicationContext());
        viewPager.setAdapter(slideAdapter);
    }
}
