package com.example.qrcode_transcal;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class AppDataBase  extends SQLiteOpenHelper {
    public static final String DB_NAME = "MeusClientes.sqlite";
    public static final int DB_VERSION = 1;
    SQLiteDatabase db;


    public AppDataBase(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        db = getWritableDatabase();
    }

    public static String criarTabela() {
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NOT EXISTS CLIENTE(");
        sql.append("nome varchar (250) null(''))");
        return sql.toString();
    }


    @Override
    public void onCreate(SQLiteDatabase db1) {
        String tabelaCliente = "CREATE TABLE CLIENTE ( matricula TEXT);";
        //  String inserir="insert into CLIENTE(matricula) values ('291286');";

        db1.execSQL(tabelaCliente);
        //db1.execSQL(inserir);
        try {
            // db1.execSQL(tabelaCliente);

        } catch (SQLException e) {

            Log.e("DB_LOG", "onCreate: " + e.getLocalizedMessage());
        }
    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
    }



