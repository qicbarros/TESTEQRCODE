package com.example.qrcode_transcal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class TelaLista extends AppCompatActivity {
    public ListView listaDados;
    SQLiteDatabase db;
    Cursor meucursor;
    Button CriarPDf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_lista);
        listaDados=(ListView) findViewById(R.id.lstUsuarios);
        Listar();
        CriarPDf=(Button)findViewById(R.id.btn_imprimir);


        CriarPDf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createPdf(listaDados);
            }
        });


    }

    public void createPdf(ListView texto){
        texto=listaDados;
        //criando um novo documento
PdfDocument documento=new PdfDocument();

    //Criar uma descrição para página
        PdfDocument.PageInfo informacaopagina=new PdfDocument.PageInfo.Builder(300,600,1).create();
        //incializar a página
        PdfDocument.Page pagina=documento.startPage(informacaopagina);
        Canvas canvas=pagina.getCanvas();
        Paint paint=new Paint();
        paint.setColor(Color.RED);
        canvas.drawCircle(50,50,30,paint);
        paint.setColor(Color.BLACK);
        canvas.drawText(String.valueOf(texto),80,50,paint);



        String directory_path = Environment.getExternalStorageDirectory().getPath() + "/mypdf/";
        File file = new File(directory_path);
        if (!file.exists()) {
            file.mkdirs();
        }
        String targetPdf = directory_path+"test-2.pdf";
        File filePath = new File(targetPdf);
        try {
            documento.writeTo(new FileOutputStream(filePath));
            Toast.makeText(this, "Done", Toast.LENGTH_LONG).show();
        } catch (IOException e) {
            Log.e("main", "error "+e.toString());
            Toast.makeText(this, "Something wrong: " + e.toString(),  Toast.LENGTH_LONG).show();
        }
        // close the document
        documento.close();
    }








    public void Listar(){
        try {
    db=openOrCreateDatabase("MeusClientes.sqlite", Context.MODE_PRIVATE,null);
    meucursor=db.rawQuery("select * from bd_clientes",null);
            ArrayList<String> linhas=new ArrayList<String>();
            String []menus={"cd", "carro"};
            ArrayAdapter meuAdapter=new ArrayAdapter<String>(
                    this, android.R.layout.simple_list_item_1,
                    android.R.id.text1,
                    linhas);
            listaDados.setAdapter(meuAdapter);
            meucursor.moveToFirst();
            while(meucursor!=null){
                linhas.add(meucursor.getString(1));
                meucursor.moveToNext();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}