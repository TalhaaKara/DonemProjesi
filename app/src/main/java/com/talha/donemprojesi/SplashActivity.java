package com.talha.donemprojesi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    public boolean  internetVarmi(final Context context)
    {
        final ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        if (internetVarmi(this))
        {
            Thread splashThread=new Thread(){
                @Override public void run() {
                    try {
                        synchronized (this)
                        {
                            wait(2000);
                        }
                    }catch (InterruptedException ex){

                    }
                    finally {
                        startActivity(new Intent(getApplicationContext(),GirisActivity.class));
                        finish();
                    }
                }
            };
            splashThread.start();
        }else {
            AlertDialog alert =new AlertDialog.Builder(this).create();
            alert.setTitle("Bağlantı Hatası");
            alert.setMessage("Lütfen İnternet Bağlantınızı Kontrol Edin!");
            alert.setButton(DialogInterface.BUTTON_NEUTRAL, "Tamam",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            int pid = android.os.Process.myPid();
                            android.os.Process.killProcess(pid);
                            dialog.dismiss();
                        }
                    });
            alert.show();
        }
    }
}