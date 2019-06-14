package br.com.juaanhs.sliderviewpager.ui.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.juaanhs.sliderviewpager.R;

public class SlideAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater inflater;

    // list of images
    public int[] listImages = {
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4
    };

    // list of titles
    public String[] listTitle = {
            "ASTRONAUTA",
            "SATÉLITE",
            "GALÁXIA",
            "FOGUETE"
    };

    //list of description
    public String[] listDescription = {
            "Os astronautas são as pessoas que já viajaram para o espaço, fora da atmosfera da Terra, a bordo de uma nave ou satélite artificial.",
            "Os Satélites são pequenos corpos que gravitam em torno de um astro maior no espaço. Os satélites podem ser naturais ou artificiais (feitos pelo homem).",
            "Uma galáxia é um grande sistema, gravitacionalmente ligado, que consiste de estrelas, remanescentes de estrelas, um meio interestelar de gás e poeira, e um importante mas insuficientemente conhecido componente apelidado de matéria escura.",
            "Um foguete espacial é uma máquina que se desloca expelindo atrás de si um fluxo de gás a alta velocidade."
    };

    // list of background colors
    public int[] listBackground = {
            Color.rgb(55,55,55),
            Color.rgb(239,85,85),
            Color.rgb(110,49, 89),
            Color.rgb(1,188,212)
    };
    public SlideAdapter (Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return listTitle.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(ConstraintLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide, container,false);


        //setando cores na view
        ConstraintLayout layoutSlide = view.findViewById(R.id.slide_layout);
        layoutSlide.setBackgroundColor(listBackground[position]);

        //setando imagens na view
        ImageView imageSlide = view.findViewById(R.id.slide_image);
        imageSlide.setImageResource(listImages[position]);

        //setando titulos na view
        TextView txtTitle = view.findViewById(R.id.txt_title);
        txtTitle.setText(listTitle[position]);

        //setando descrições na view
        TextView txtDescription = view.findViewById(R.id.txt_description);
        txtDescription.setText(listDescription[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ConstraintLayout) object);
    }
}
