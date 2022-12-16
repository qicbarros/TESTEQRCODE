package com.example.qrcode_transcal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

public class RepositorioCliente {

    /*    private SQLiteDatabase db;
        private SQLiteHelper dbHelper;
        private static final String SCRIPT_DB_DELETE =
                "DROP TABLE IF EXISTS CLIENTE";
        private static final String SCRIPT_DB_CREATE =
                "create table CLIENTE (_id integer primary "+
                        "key autoincrement, matricula text not null);";

        public RepositorioCliente (Context ctx){
            dbHelper = new SQLiteHelper(ctx, "curso", 1,
                    SCRIPT_DB_CREATE, SCRIPT_DB_DELETE);
        }

        private long inserir(Cliente c){
            ContentValues cv = new ContentValues();
            cv.put("matricula", c.getMatricula());
            db = dbHelper.getWritableDatabase();
            long id = db.insert("carros", null, cv);
            db.close();
            return id;
        }

        private long atualizar(Cliente c){
            ContentValues cv = new ContentValues();
            cv.put("matricula", c.getMatricula());
               db = dbHelper.getWritableDatabase();
            long rows = db.update("carros", cv, "_id = ?",
                    new String[]{ String.valueOf(c.getId())});
            db.close();
            return rows; // qtde. de linhas afetadas
        }

        public int excluir(int id){
            db = dbHelper.getWritableDatabase();
            int rows = db.delete("carros", "_id = ?",
                    new String[]{ String.valueOf(id) });
            return rows; // qtde. de linhas afetadas
        }

        public List buscarClientePorNome(String nome){
            List lista = new ArrayList();

            String[] columns = new String[]{
                    "_id", "matricula"};
            String[] args = new String[]{nome+"%"};

            db = dbHelper.getWritableDatabase();
            Cursor c = db.query("carros", columns,
                    "nome like ?", args, null, null, "nome");

            c.moveToFirst();
            while(!c.isAfterLast()){
                Carro carro = fillCarro(c);
                lista.add(carro);
                c.moveToNext();
            }
            c.close();
            db.close();
            return lista;
        }

        private Carro fillCarro(Cursor c) {
            Carro carro = new Carro();
            carro.setId((int)c.getLong(0));
            carro.setNome(c.getString(1));
            carro.setPlaca(c.getString(2));
            carro.setAno(c.getString(3));
            return carro;
        }
    }


*/

}
