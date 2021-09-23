package com.login.gozapotillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;
import com.slidergozapotillo.MainActivitySlider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_gozapotillo);
        if (AccessToken.getCurrentAccessToken() == null) {
            goFacebookPantalla();



    }
}

    private void goFacebookPantalla() {
        Intent intent = new Intent(this, LoginFacebookActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);


    }
//metodo para salir de la aplicacion y cerrar seccion de facebook
    public void logout(View view) {
        LoginManager.getInstance().logOut();
        goFacebookPantalla();
    }

  /*  funcion de llamado a actividad de listas de parroquias*/


    public void ZapParroquiaslistas(View view) {
        Intent intent = new Intent(this, MainActivitySlider.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);



    }
}
