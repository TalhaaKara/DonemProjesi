package com.talha.donemprojesi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity4x4 extends AppCompatActivity {


    TextView tv_p1,tv_p2;

    ImageView imageView11,imageView12,imageView13,imageView14,imageView21,imageView22,imageView23,imageView24,imageView31,imageView32,imageView33,imageView34,imageView41,imageView42,imageView43,imageView44;

    Integer[] kartlar ={101,102,103,104,105,106,107,108,201,202,203,204,205,206,207,208}; // Resimler için dizi

    int image101,image102,image103,image104,image105,image106,image107,image108,
            image201,image202,image203,image204,image205,image206,image207,image208;  //Gerçek resimler

    int ilkKart, ikinciKart;
    int ilkSecim,ikinciSecim;
    int cardNumber = 1;

    int sira = 1;
    int birinciOyuncu = 0, ikinciOyuncu = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4x4);

        Intent intent1 =getIntent();
        String data = intent1.getStringExtra("Key");
        System.out.println(data);


        tv_p1=findViewById(R.id.tv_p1);
        tv_p2=findViewById(R.id.tv_p2);

        imageView11=findViewById(R.id.imageView11);
        imageView12=findViewById(R.id.imageView12);
        imageView13=findViewById(R.id.imageView13);
        imageView14=findViewById(R.id.imageView14);
        imageView21=findViewById(R.id.imageView21);
        imageView22=findViewById(R.id.imageView22);
        imageView23=findViewById(R.id.imageView23);
        imageView24=findViewById(R.id.imageView24);
        imageView31=findViewById(R.id.imageView31);
        imageView32=findViewById(R.id.imageView32);
        imageView33=findViewById(R.id.imageView33);
        imageView34=findViewById(R.id.imageView34);
        imageView41=findViewById(R.id.imageView41);
        imageView42=findViewById(R.id.imageView42);
        imageView43=findViewById(R.id.imageView43);
        imageView44=findViewById(R.id.imageView44);

        imageView11.setTag("0");
        imageView12.setTag("1");
        imageView13.setTag("2");
        imageView14.setTag("3");
        imageView21.setTag("4");
        imageView22.setTag("5");
        imageView23.setTag("6");
        imageView24.setTag("7");
        imageView31.setTag("8");
        imageView32.setTag("9");
        imageView33.setTag("10");
        imageView34.setTag("11");
        imageView41.setTag("12");
        imageView42.setTag("13");
        imageView43.setTag("14");
        imageView44.setTag("15");

        if(data.equals("hayvan")){
            hayvanYukle();
        }
        else if(data.equals("brawler")){
            brawlersYukle();
        }
        else if(data.equals("karisik")){
            karisikYukle();
        }


        Collections.shuffle(Arrays.asList(kartlar));

        tv_p2.setTextColor(Color.GRAY);// 2. oyuncunun textini gri yaptım(Sıra 1. oyuncuda olduğu için)

        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView11, theCard);
            }

        });

        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView12, theCard);
            }
        });

        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView13, theCard);
            }
        });

        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView14, theCard);
            }
        });

        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView21, theCard);
            }
        });

        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView22, theCard);
            }
        });

        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView23, theCard);
            }
        });

        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView24, theCard);
            }
        });

        imageView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView31, theCard);
            }
        });

        imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView32, theCard);
            }
        });

        imageView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView33, theCard);
            }
        });

        imageView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView34, theCard);
            }
        });

        imageView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView41, theCard);
            }
        });

        imageView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView42, theCard);
            }
        });

        imageView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView43, theCard);
            }
        });

        imageView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                kartVer(imageView44, theCard);
            }
        });
    }
    private void kartVer(ImageView imageView, int card){ //Tıklanan yere gelecek olan kartları oluşturan fonksiyon
        if(kartlar[card]==101){
            imageView.setImageResource(image101);
        } else if(kartlar[card]==102){
            imageView.setImageResource(image102);
        } else if(kartlar[card]==103){
            imageView.setImageResource(image103);
        } else if(kartlar[card]==104){
            imageView.setImageResource(image104);
        } else if(kartlar[card]==105){
            imageView.setImageResource(image105);
        } else if(kartlar[card]==106){
            imageView.setImageResource(image106);
        } else if(kartlar[card]==107){
            imageView.setImageResource(image107);
        } else if(kartlar[card]==108){
            imageView.setImageResource(image108);
        } else if(kartlar[card]==201){
            imageView.setImageResource(image201);
        } else if(kartlar[card]==202){
            imageView.setImageResource(image202);
        } else if(kartlar[card]==203){
            imageView.setImageResource(image203);
        } else if(kartlar[card]==204){
            imageView.setImageResource(image204);
        } else if(kartlar[card]==205){
            imageView.setImageResource(image205);
        } else if(kartlar[card]==206){
            imageView.setImageResource(image206);
        } else if(kartlar[card]==207){
            imageView.setImageResource(image207);
        } else if(kartlar[card]==208){
            imageView.setImageResource(image208);
        }
        //Hangi kartlar seçildi ve bu seçilen kartları geçici değere atama
        if(cardNumber == 1){
            ilkKart = kartlar[card];
            if ((ilkKart >200)){
                ilkKart = ilkKart -100;
            }
            cardNumber=2;
            ilkSecim =card;

            imageView.setEnabled(false);
        }
        else if(cardNumber==2){
            ikinciKart=kartlar[card];
            if(ikinciKart>200){
                ikinciKart=ikinciKart-100;
            }
            cardNumber=1;
            ikinciSecim=card;

            //Kartların seçimi kapatıldı
            imageView11.setEnabled(false);
            imageView12.setEnabled(false);
            imageView13.setEnabled(false);
            imageView14.setEnabled(false);
            imageView21.setEnabled(false);
            imageView22.setEnabled(false);
            imageView23.setEnabled(false);
            imageView24.setEnabled(false);
            imageView31.setEnabled(false);
            imageView32.setEnabled(false);
            imageView33.setEnabled(false);
            imageView34.setEnabled(false);
            imageView41.setEnabled(false);
            imageView42.setEnabled(false);
            imageView43.setEnabled(false);
            imageView44.setEnabled(false);


            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    hesapla();
                }
            },1000);

        }


    }
    private void hesapla(){
        //seçilen kartlar aynıysa onları ekrandan kaldır
        if(ilkKart==ikinciKart){

            if(ilkSecim == 0){
                imageView11.setVisibility(View.INVISIBLE);
            }
            else if(ilkSecim == 1){
                imageView12.setVisibility(View.INVISIBLE);
            }
            else if(ilkSecim == 2){
                imageView13.setVisibility(View.INVISIBLE);
            }
            else if(ilkSecim == 3){
                imageView14.setVisibility(View.INVISIBLE);
            }
            else if(ilkSecim == 4){
                imageView21.setVisibility(View.INVISIBLE);
            }
            else if(ilkSecim == 5){
                imageView22.setVisibility(View.INVISIBLE);
            }
            else if(ilkSecim == 6){
                imageView23.setVisibility(View.INVISIBLE);
            }
            else if(ilkSecim == 7){
                imageView24.setVisibility(View.INVISIBLE);
            }
            else if(ilkSecim == 8){
                imageView31.setVisibility(View.INVISIBLE);
            }
            else if(ilkSecim == 9){
                imageView32.setVisibility(View.INVISIBLE);
            }
            else if(ilkSecim == 10){
                imageView33.setVisibility(View.INVISIBLE);
            }
            else if(ilkSecim == 11){
                imageView34.setVisibility(View.INVISIBLE);
            }
            else if(ilkSecim == 12){
                imageView41.setVisibility(View.INVISIBLE);
            }
            else if(ilkSecim == 13){
                imageView42.setVisibility(View.INVISIBLE);
            }
            else if(ilkSecim == 14){
                imageView43.setVisibility(View.INVISIBLE);
            }
            else if(ilkSecim == 15){
                imageView44.setVisibility(View.INVISIBLE);
            }



            if(ikinciSecim == 0){
                imageView11.setVisibility(View.INVISIBLE);
            }
            else if(ikinciSecim == 1){
                imageView12.setVisibility(View.INVISIBLE);
            }
            else if(ikinciSecim == 2){
                imageView13.setVisibility(View.INVISIBLE);
            }
            else if(ikinciSecim == 3){
                imageView14.setVisibility(View.INVISIBLE);
            }
            else if(ikinciSecim == 4){
                imageView21.setVisibility(View.INVISIBLE);
            }
            else if(ikinciSecim == 5){
                imageView22.setVisibility(View.INVISIBLE);
            }
            else if(ikinciSecim == 6){
                imageView23.setVisibility(View.INVISIBLE);
            }
            else if(ikinciSecim == 7){
                imageView24.setVisibility(View.INVISIBLE);
            }
            else if(ikinciSecim == 8){
                imageView31.setVisibility(View.INVISIBLE);
            }
            else if(ikinciSecim == 9){
                imageView32.setVisibility(View.INVISIBLE);
            }
            else if(ikinciSecim == 10){
                imageView33.setVisibility(View.INVISIBLE);
            }
            else if(ikinciSecim == 11){
                imageView34.setVisibility(View.INVISIBLE);
            }
            else if(ikinciSecim == 12){
                imageView41.setVisibility(View.INVISIBLE);
            }
            else if(ikinciSecim == 13){
                imageView42.setVisibility(View.INVISIBLE);
            }
            else if(ikinciSecim == 14){
                imageView43.setVisibility(View.INVISIBLE);
            }
            else if(ikinciSecim == 15){
                imageView44.setVisibility(View.INVISIBLE);
            }

            // Sıra kimdeyse ona puanı ekledik
            if(sira==1){
                birinciOyuncu++;
                tv_p1.setText("P1: "+birinciOyuncu);
            }
            else if(sira==2){
                ikinciOyuncu++;
                tv_p2.setText("P2: "+ikinciOyuncu);
            }
        }
        else{
            //Seçilenler aynı değilse tekrar kapanacak
            imageView11.setImageResource(R.drawable.soruisareti2);
            imageView12.setImageResource(R.drawable.soruisareti2);
            imageView13.setImageResource(R.drawable.soruisareti2);
            imageView14.setImageResource(R.drawable.soruisareti2);
            imageView21.setImageResource(R.drawable.soruisareti2);
            imageView22.setImageResource(R.drawable.soruisareti2);
            imageView23.setImageResource(R.drawable.soruisareti2);
            imageView24.setImageResource(R.drawable.soruisareti2);
            imageView31.setImageResource(R.drawable.soruisareti2);
            imageView32.setImageResource(R.drawable.soruisareti2);
            imageView33.setImageResource(R.drawable.soruisareti2);
            imageView34.setImageResource(R.drawable.soruisareti2);
            imageView41.setImageResource(R.drawable.soruisareti2);
            imageView42.setImageResource(R.drawable.soruisareti2);
            imageView43.setImageResource(R.drawable.soruisareti2);
            imageView44.setImageResource(R.drawable.soruisareti2);


            // Sıra hangi oyuncudaysa onunki siyah diğeri gri
            if(sira==1){
                sira=2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            }
            else if(sira==2){
                sira=1;
                tv_p1.setTextColor(Color.BLACK);
                tv_p2.setTextColor(Color.GRAY);
            }
        }
        imageView11.setEnabled(true);
        imageView12.setEnabled(true);
        imageView13.setEnabled(true);
        imageView14.setEnabled(true);
        imageView21.setEnabled(true);
        imageView22.setEnabled(true);
        imageView23.setEnabled(true);
        imageView24.setEnabled(true);
        imageView31.setEnabled(true);
        imageView32.setEnabled(true);
        imageView33.setEnabled(true);
        imageView34.setEnabled(true);
        imageView41.setEnabled(true);
        imageView42.setEnabled(true);
        imageView43.setEnabled(true);
        imageView44.setEnabled(true);

        oyunbitti_mi();
    }

    private void oyunbitti_mi(){
        if(imageView11.getVisibility()==View.INVISIBLE &&
                imageView11.getVisibility()==View.INVISIBLE &&
                imageView12.getVisibility()==View.INVISIBLE &&
                imageView13.getVisibility()==View.INVISIBLE &&
                imageView14.getVisibility()==View.INVISIBLE &&
                imageView21.getVisibility()==View.INVISIBLE &&
                imageView22.getVisibility()==View.INVISIBLE &&
                imageView23.getVisibility()==View.INVISIBLE &&
                imageView24.getVisibility()==View.INVISIBLE &&
                imageView31.getVisibility()==View.INVISIBLE &&
                imageView32.getVisibility()==View.INVISIBLE &&
                imageView33.getVisibility()==View.INVISIBLE &&
                imageView34.getVisibility()==View.INVISIBLE &&
                imageView41.getVisibility()==View.INVISIBLE &&
                imageView42.getVisibility()==View.INVISIBLE &&
                imageView43.getVisibility()==View.INVISIBLE &&
                imageView44.getVisibility()==View.INVISIBLE ){

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity4x4.this);

            if(birinciOyuncu>ikinciOyuncu){
                alertDialogBuilder
                        .setMessage("Oyun Bitti!\n" + "TEBRİKLER P1!!!\n" +"P1: "+birinciOyuncu+"\nP2: "+ikinciOyuncu)
                        .setCancelable(false)
                        .setPositiveButton("Yeni Oyun", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                Intent intent = new Intent(getApplicationContext(),GirisActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setNegativeButton("Çıkış", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                finish();
                                android.os.Process.killProcess(android.os.Process.myPid());
                            }
                        });
            }
            else if (ikinciOyuncu>birinciOyuncu){
                alertDialogBuilder
                        .setMessage("Oyun Bitti!\n" + "TEBRİKLER P2!!!\n" +"P1: "+birinciOyuncu+"\nP2: "+ikinciOyuncu)
                        .setCancelable(false)
                        .setPositiveButton("Yeni Oyun", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                Intent intent = new Intent(getApplicationContext(),GirisActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setNegativeButton("Çıkış", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                finish();
                                android.os.Process.killProcess(android.os.Process.myPid());
                            }
                        });
            }
            else if (birinciOyuncu==ikinciOyuncu){
                alertDialogBuilder
                        .setMessage("Oyun Bitti!\n" + "BERABERE...\n" +"P1: "+birinciOyuncu+"\nP2: "+ikinciOyuncu)
                        .setCancelable(false)
                        .setPositiveButton("Yeni Oyun", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                Intent intent = new Intent(getApplicationContext(),GirisActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setNegativeButton("Çıkış", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                finish();
                                android.os.Process.killProcess(android.os.Process.myPid());
                            }
                        });
            }

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void brawlersYukle(){
        image101 = R.drawable.ic_image101;
        image102 = R.drawable.ic_image102;
        image103 = R.drawable.ic_image103;
        image104 = R.drawable.ic_image104;
        image105 = R.drawable.ic_image105;
        image106 = R.drawable.ic_image106;
        image107 = R.drawable.ic_image107;
        image108 = R.drawable.ic_image108;
        image201 = R.drawable.ic_image201;
        image202 = R.drawable.ic_image202;
        image203 = R.drawable.ic_image203;
        image204 = R.drawable.ic_image204;
        image205 = R.drawable.ic_image205;
        image206 = R.drawable.ic_image206;
        image207 = R.drawable.ic_image207;
        image208 = R.drawable.ic_image208;
    }
    private void hayvanYukle(){
        image101 = R.drawable.ic_hayvan101;
        image102 = R.drawable.ic_hayvan102;
        image103 = R.drawable.ic_hayvan103;
        image104 = R.drawable.ic_hayvan104;
        image105 = R.drawable.ic_hayvan105;
        image106 = R.drawable.ic_hayvan106;
        image107 = R.drawable.ic_hayvan107;
        image108 = R.drawable.ic_hayvan108;
        image201 = R.drawable.ic_hayvan201;
        image202 = R.drawable.ic_hayvan202;
        image203 = R.drawable.ic_hayvan203;
        image204 = R.drawable.ic_hayvan204;
        image205 = R.drawable.ic_hayvan205;
        image206 = R.drawable.ic_hayvan206;
        image207 = R.drawable.ic_hayvan207;
        image208 = R.drawable.ic_hayvan208;

    }
    private void karisikYukle(){
        image101 = R.drawable.ic_hayvan101;
        image102 = R.drawable.ic_image102;
        image103 = R.drawable.ic_hayvan103;
        image104 = R.drawable.ic_image104;
        image105 = R.drawable.ic_hayvan105;
        image106 = R.drawable.ic_image106;
        image107 = R.drawable.ic_hayvan107;
        image108 = R.drawable.ic_image108;
        image201 = R.drawable.ic_hayvan201;
        image202 = R.drawable.ic_image202;
        image203 = R.drawable.ic_hayvan203;
        image204 = R.drawable.ic_image204;
        image205 = R.drawable.ic_hayvan205;
        image206 = R.drawable.ic_image206;
        image207 = R.drawable.ic_hayvan207;
        image208 = R.drawable.ic_image208;
    }
}