package com.example.salariobase;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularSalario(View view) {

        EditText edtxtSalario = (EditText) findViewById(R.id.edtxtSalario);
        Float salarioBase;
        Float novoSalario;

        AlertDialog.Builder a = new AlertDialog.Builder(this);

       if(!(edtxtSalario.getText().toString().equals(""))){

           salarioBase = Float.parseFloat(edtxtSalario.getText()+"");

           novoSalario = (salarioBase + ((salarioBase*5)/100)) - ((salarioBase*7)/100);

           Toast toast = Toast.makeText(this, "Salario a receber: "+novoSalario,
                   Toast.LENGTH_LONG);

           toast.setGravity(Gravity.CENTER, 0, 0);

           toast.show();
       }else {
           a.setTitle("Erro");
           a.setMessage("Caixa vazia, insira o salário!!!");
           a.create().show();
       }
    }
}