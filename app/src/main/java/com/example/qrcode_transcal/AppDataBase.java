package com.example.qrcode_transcal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


public class AppDataBase extends SQLiteOpenHelper {
    public static final String DB_NAME = "MeusClientes.sqlite";
    public static final int DB_VERSION = 1;
    private static final String TABELA_CLIENTE="bd_clientes";
    private static final String COLUNA_CODIGO="codigo";
    private static final String COLUNA_NOME="nome";
    SQLiteDatabase db;


    public AppDataBase(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        db = getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
       // String criar= "create table teste(id integer  primary key autoincrement, matricula text)";
        String QUERY_COLUNA = "CREATE TABLE  " + TABELA_CLIENTE + "("
               + COLUNA_CODIGO + " INTEGER PRIMARY KEY, " + COLUNA_NOME +"TEXT"+")";
        String QUERY_COLUNA1= "create table bd_clientes (codigo INTEGER PRIMARY KEY , nome TEXT)";
        // String inserir="insert into CLIENTE(matricula) values ('000000');";
        //String inserir1="insert into CLIENTE(matricula) values ('11111111');";

       db.execSQL(QUERY_COLUNA1);
        //db1.execSQL(inserir);
        //db1.execSQL(inserir1);

                try {

        } catch (SQLException e) {

            Log.e("DB_LOG", "onCreate: " + e.getLocalizedMessage());
        }
    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

void addCliente (Cliente cliente){

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(COLUNA_NOME,cliente.getMatricula());
        db.insert(TABELA_CLIENTE,null,values);
        db.close();
    }

   public void inserir(SQLiteDatabase db,String x){

      // x = "tetetetetete";
       //ContentValues cv = new ContentValues();
        //cv.put("nome", x);
       //String inserir="insert into CLIENTE(nome) values ("+x+")";
       String inserir="insert into bd_clientes(nome) values ('" + x +"');";
       String inserir2="insert into bd_clientes (nome) values ('x');";
       //INSERT INTO clientes VALUES(4, 'Zacarias', '33333333333', 'zacarias@email.com', '1199999999', 'RJ');


       db = this.getWritableDatabase();
        //long id = db.insert("TABELA_CLIENTE", null, cv);
       db.execSQL(inserir);
       try {

       } catch (SQLException e) {

           Log.e("DB_LOG", "onCreate: " + e.getLocalizedMessage());
       }


    }







}
