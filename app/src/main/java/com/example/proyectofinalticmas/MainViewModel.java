package com.example.proyectofinalticmas;

import android.app.Application;
import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class MainViewModel extends AndroidViewModel {
    private Context context;
    private String repuesta;
    private MutableLiveData<String> mtRepuesta;
    public MainViewModel(@NonNull Application application) {
        super(application);
        context=application.getApplicationContext();
    }
    public MutableLiveData<String> getRepuesta(){
        if(mtRepuesta==null){
            mtRepuesta= new MutableLiveData<String>();
        }
        return mtRepuesta;
    }

    public void comparar(EditText primera, EditText segunda){
        if(primera.getText().equals("")){
            Toast.makeText(context,"Debe inqresar un texto en el primer campo", Toast.LENGTH_SHORT).show();
            return;
        }
        if(segunda.getText().equals("")){
            Toast.makeText(context,"Debe inqresar un texto en el segundo campo", Toast.LENGTH_SHORT).show();
            return;
        }
        if(primera.getText().equals(segunda.getText())){
            mtRepuesta.setValue("Las cadenas son iguales");
        }else{
            mtRepuesta.setValue("Las cadenas son distintas");
        }

    }
}
