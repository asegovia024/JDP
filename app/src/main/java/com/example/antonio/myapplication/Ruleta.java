package com.example.antonio.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Ruleta extends AppCompatActivity {

    static int FLAG=0;
    ImageView exterior, interior;
    int grad=0 , grad_old=0;
    int gradi=0 , gradi_old=0;


    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruleta);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);

        FloatingActionButton girar = (FloatingActionButton) findViewById(R.id.girar);

         exterior= (ImageView)findViewById(R.id.ruletaExterior);
         interior= (ImageView)findViewById(R.id.ruletaInterior);
        texto= (TextView)findViewById(R.id.texto);

         final Random r1 =new Random();
         final Random r2 =new Random();

       final float FACTOR1 =30;
        final float FACTOR2 =36;

        girar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              //  if (FLAG==0){//giro exterior

                    grad_old= grad %360;
                    grad = r1.nextInt(3600) +720;
                    RotateAnimation rot1 = new RotateAnimation(grad_old,grad,RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                            RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                    rot1.setDuration(1000);

                    rot1.setFillAfter(true);

                    rot1.setInterpolator(new DecelerateInterpolator());

                    rot1.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {

                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    exterior.startAnimation(rot1);
                    FLAG=1;

               // }else{//giro interior
                    gradi_old=gradi%360;
                    gradi = r2.nextInt(3600) +720;


                    RotateAnimation rot2 = new RotateAnimation(gradi_old,gradi,RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                            RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                    rot2.setDuration(3000);
                    rot2.setFillAfter(true);
                    rot2.setInterpolator(new DecelerateInterpolator());

                    rot2.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {
                            texto.setText("");
                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {

                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    interior.startAnimation(rot2);
                    FLAG=0;

              //  }






            }
        });
    }



}
