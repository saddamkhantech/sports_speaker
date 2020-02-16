package com.example.sporstspeaker;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import java.net.URI;

public class Main extends AppCompatActivity implements View.OnClickListener {

    private ImageButton aikido,boxing,judo,karate,kickboxing,taekwondo;
    public void onCreate(Bundle state)
    {
        super.onCreate(state);
        setContentView(R.layout.mainlayout);
        aikido=findViewById(R.id.aikido);
        boxing=findViewById(R.id.boxing);
        judo=findViewById(R.id.judo);
        karate=findViewById(R.id.karate);
        kickboxing=findViewById(R.id.kickboxing);
        taekwondo=findViewById(R.id.taekwondo);


        aikido.setOnClickListener(this);
        boxing.setOnClickListener(this);
        judo.setOnClickListener(this);
        karate.setOnClickListener(this);
        kickboxing.setOnClickListener(this);
        taekwondo.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Log.i("display","i am running");
        Toast.makeText(this,"WOW",Toast.LENGTH_SHORT).show();


        switch(view.getId())
        {
            case R.id.aikido:
                this.play(aikido.getTag().toString());
                break;
            case R.id.boxing:
                this.play(boxing.getTag().toString());
                break;
            case R.id.judo:
                this.play(judo.getTag().toString());
                break;
            case R.id.karate:
                this.play(karate.getTag().toString());
                break;
            case R.id.kickboxing:
                this.play(kickboxing.getTag().toString());
                break;
            case R.id.taekwondo:
                this.play(taekwondo.getTag().toString());
                break;

        }
    }

    private void play(String name)
    {

        MediaPlayer mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier(name,"raw",getPackageName()));
        mediaPlayer.start();
    }
}
