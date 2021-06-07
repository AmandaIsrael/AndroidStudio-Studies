package com.unioestetds.jankenpon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView TextResult;
    private ImageView ImgResult;
    private int RandomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImgResult = findViewById(R.id.ImageDefault);
        TextResult = findViewById(R.id.TextDefault);
    }

    @SuppressLint("SetTextI18n")

    //Caso seja escolhido tesoura
    public void Scissors(View view){
        RandomNumber = RandomMachine();

        if(RandomNumber == 0){
            ScissorsImage();
            TextResult.setText("Empate");
        }else{
            if(RandomNumber == 1){
                StoneImage();
                TextResult.setText("Você perdeu");
            }else{
                PaperImage();
                TextResult.setText("Você ganhou");
            }
        }
    }

    //Caso seja escolhido pedra
    public void Stone(View vie){
        RandomNumber = RandomMachine();

        if(RandomNumber == 0){
            ScissorsImage();
            TextResult.setText("Você ganhou");
        }else{
            if(RandomNumber == 1){
                StoneImage();
                TextResult.setText("Empate");
            }else{
                PaperImage();
                TextResult.setText("Você perdeu");
            }
        }
    }

    //Caso seja escolhido papel
    public void Paper(View view){
        RandomNumber = RandomMachine();

        if(RandomNumber == 0){
            ScissorsImage();
            TextResult.setText("Você perdeu");
        }else{
            if(RandomNumber == 1){
                StoneImage();
                TextResult.setText("Você ganhou");
            }else{
                PaperImage();
                TextResult.setText("Empate");
            }
        }
    }

    //Gera um número aleatório para a "máquina"
    private int RandomMachine(){
        int number = new Random().nextInt(3);
        return number;
    }

    private void ScissorsImage(){
        ImgResult.setImageResource(R.drawable.tesoura);
    }

    private void StoneImage(){
        ImgResult.setImageResource(R.drawable.pedra);
    }

    private void PaperImage(){
        ImgResult.setImageResource(R.drawable.papel);
    }
}