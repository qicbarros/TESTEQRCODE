package com.example.qrcode_transcal;


import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.journeyapps.barcodescanner.ScanContract;
import com.journeyapps.barcodescanner.ScanOptions;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.journeyapps.barcodescanner.ScanContract;
import com.journeyapps.barcodescanner.ScanOptions;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    AppDataBase cc;
    SQLiteDatabase db;
    Button btn_leitura;
    int tamanho_banco2;
    String z,x;
    int a;
    Button botao_tela2;

   ArrayList<Cliente> d = new ArrayList<>();
    ArrayList<String> credenciais = new ArrayList<String>();
    Cliente c= new Cliente();
    List<Cliente> cores = new ArrayList<>();

 //public List<Cliente> listagem () {

    public ArrayList<String> listar() {
        //listagem();
        credenciais.add("38190");
        credenciais.add("44470");
        credenciais.add("20340");
        credenciais.add("260200");
        credenciais.add("261440");
        credenciais.add("245950");
        credenciais.add("358080");
        credenciais.add("345510");
        credenciais.add("39152");
        credenciais.add("259390");
        credenciais.add("25054");
        credenciais.add("261750");
        credenciais.add("53020");
        credenciais.add("100000046");
        credenciais.add("45440");
        credenciais.add("245540");
        credenciais.add("246470");
        credenciais.add("430070");
        credenciais.add("359690");
        credenciais.add("28583");
        credenciais.add("260360");
        credenciais.add("35442");
        credenciais.add("261030");
        credenciais.add("60010");
        credenciais.add("36571");
        credenciais.add("261500");
        credenciais.add("52640");
        credenciais.add("245890");
        credenciais.add("261740");
        credenciais.add("245500");
        credenciais.add("261640");
        credenciais.add("41162");
        credenciais.add("11650");
        credenciais.add("52320");
        credenciais.add("261790");
        credenciais.add("100000050");
        credenciais.add("43510");
        credenciais.add("261920");
        credenciais.add("261230");
        credenciais.add("260970");
        credenciais.add("35192");
        credenciais.add("358700");
        credenciais.add("261730");
        credenciais.add("43970");
        credenciais.add("35532");
        credenciais.add("52990");
        credenciais.add("260760");
        credenciais.add("50450");
        credenciais.add("245840");
        credenciais.add("20370");
        credenciais.add("357690");
        credenciais.add("45050");
        credenciais.add("52850");
        credenciais.add("330720");
        credenciais.add("260730");
        credenciais.add("52670");
        credenciais.add("44810");
        credenciais.add("347120");
        credenciais.add("45320");
        credenciais.add("45040");
        credenciais.add("26612");
        credenciais.add("261160");
        credenciais.add("261620");
        credenciais.add("261910");
        credenciais.add("357930");
        credenciais.add("26001");
        credenciais.add("28283");
        credenciais.add("100000045");
        credenciais.add("53030");
        credenciais.add("430020");
        credenciais.add("261660");
        credenciais.add("36372");
        credenciais.add("52260");
        credenciais.add("245930");
        credenciais.add("44960");
        credenciais.add("44900");
        credenciais.add("357470");
        credenciais.add("260770");
        credenciais.add("42610");
        credenciais.add("52090");
        credenciais.add("30110");
        credenciais.add("44140");
        credenciais.add("359510");
        credenciais.add("261900");
        credenciais.add("261930");
        credenciais.add("261300");
        credenciais.add("260170");
        credenciais.add("258250");
        credenciais.add("261180");
        credenciais.add("43960");
        credenciais.add("52930");
        credenciais.add("2600570");
        credenciais.add("25122");
        credenciais.add("260570");
        credenciais.add("230200");
        credenciais.add("2600580");
        credenciais.add("52230");
        credenciais.add("260540");
        credenciais.add("260790");
        credenciais.add("261510");
        credenciais.add("260230");
        credenciais.add("359360");
        credenciais.add("44730");
        credenciais.add("44330");
        credenciais.add("45570");
        credenciais.add("44580");
        credenciais.add("261520");
        credenciais.add("40113");
        credenciais.add("44650");
        credenciais.add("45370");
        credenciais.add("44300");
        credenciais.add("345760");
        credenciais.add("44560");
        credenciais.add("44500");
        credenciais.add("261800");
        credenciais.add("260930");
        credenciais.add("29461");
        credenciais.add("42790");
        credenciais.add("261040");
        credenciais.add("261050");
        credenciais.add("25582");
        credenciais.add("259970");
        credenciais.add("35030");
        credenciais.add("36361");
        credenciais.add("359970");
        credenciais.add("45550");
        credenciais.add("246140");
        credenciais.add("257680");
        credenciais.add("44880");
        credenciais.add("260800");
        credenciais.add("45220");
        credenciais.add("36202");
        credenciais.add("44720");
        credenciais.add("36991");
        credenciais.add("42530");
        credenciais.add("45140");
        credenciais.add("44790");
        credenciais.add("100000047");
        credenciais.add("44950");
        credenciais.add("261530");
        credenciais.add("330550");
        credenciais.add("257770");
        credenciais.add("45420");
        credenciais.add("261960");
        credenciais.add("44820");
        credenciais.add("258950");
        credenciais.add("41101");
        credenciais.add("260960");
        credenciais.add("44870");
        credenciais.add("45330");
        credenciais.add("44850");
        credenciais.add("37302");
        credenciais.add("261060");
        credenciais.add("44980");
        credenciais.add("52340");
        credenciais.add("230041");
        credenciais.add("10023");
        credenciais.add("230260");
        credenciais.add("44990");
        credenciais.add("45010");
        credenciais.add("358370");
        credenciais.add("26983");
        credenciais.add("261630");
        credenciais.add("330140");
        credenciais.add("100000051");
        credenciais.add("261090");
        credenciais.add("45290");
        credenciais.add("44630");
        credenciais.add("358190");
        credenciais.add("259700");
        credenciais.add("260680");
        credenciais.add("40732");
        credenciais.add("25422");
        credenciais.add("257300");
        credenciais.add("357550");
        credenciais.add("28024");
        credenciais.add("346530");
        credenciais.add("52040");
        credenciais.add("358810");
        credenciais.add("258050");
        credenciais.add("45110");
        credenciais.add("43950");
        credenciais.add("346200");
        credenciais.add("261810");
        credenciais.add("261550");
        credenciais.add("10650");
        credenciais.add("260210");
        credenciais.add("346060");
        credenciais.add("42440");
        credenciais.add("10510");
        credenciais.add("261360");
        credenciais.add("42310");
        credenciais.add("52220");
        credenciais.add("45500");
        credenciais.add("35080");
        credenciais.add("347230");
        credenciais.add("261850");
        credenciais.add("840100");
        credenciais.add("25904");
        credenciais.add("258090");
        credenciais.add("261950");
        credenciais.add("30210");
        credenciais.add("261860");
        credenciais.add("27762");
        credenciais.add("260810");
        credenciais.add("246010");
        credenciais.add("330120");
        credenciais.add("330590");
        credenciais.add("260980");
        credenciais.add("52430");
        credenciais.add("260500");
        credenciais.add("261780");
        credenciais.add("28312");
        credenciais.add("38500");
        credenciais.add("359480");
        credenciais.add("45150");
        credenciais.add("50201");
        credenciais.add("53010");
        credenciais.add("260150");
        credenciais.add("44480");
        credenciais.add("840280");
        credenciais.add("261470");
        credenciais.add("36952");
        credenciais.add("257450");
        credenciais.add("260710");
        credenciais.add("20860");
        credenciais.add("261220");
        credenciais.add("357710");
        credenciais.add("42040");
        credenciais.add("44940");
        credenciais.add("45510");
        credenciais.add("359450");
        credenciais.add("44840");
        credenciais.add("45390");
        credenciais.add("45480");
        credenciais.add("43700");
        credenciais.add("52790");
        credenciais.add("52970");
        credenciais.add("44180");
        credenciais.add("261120");
        credenciais.add("358310");
        credenciais.add("11630");
        credenciais.add("258890");
        credenciais.add("257650");
        credenciais.add("44400");
        credenciais.add("740390");
        credenciais.add("260550");
        credenciais.add("357640");
        credenciais.add("40501");
        credenciais.add("35853");
        credenciais.add("40572");
        credenciais.add("261830");
        credenciais.add("53140");
        credenciais.add("260270");
        credenciais.add("26751");
        credenciais.add("261760");
        credenciais.add("330630");
        credenciais.add("44060");
        credenciais.add("261310");
        credenciais.add("27861");
        credenciais.add("261690");
        credenciais.add("261880");
        credenciais.add("52870");
        credenciais.add("11530");
        credenciais.add("346050");
        credenciais.add("45490");
        credenciais.add("260490");
        credenciais.add("261340");
        credenciais.add("11600");
        credenciais.add("261680");
        credenciais.add("44450");
        credenciais.add("43870");
        credenciais.add("45080");
        credenciais.add("358530");
        credenciais.add("230330");
        credenciais.add("25692");
        credenciais.add("260830");
        credenciais.add("260840");
        credenciais.add("2600600");
        credenciais.add("26441");
        credenciais.add("261840");
        credenciais.add("41071");
        credenciais.add("260530");
        credenciais.add("261410");
        credenciais.add("51910");
        credenciais.add("430180");
        credenciais.add("42930");
        credenciais.add("45020");
        credenciais.add("100000044");
        credenciais.add("44160");
        credenciais.add("45580");
        credenciais.add("358270");
        credenciais.add("346670");
        credenciais.add("51870");
        credenciais.add("45280");
        credenciais.add("35572");
        credenciais.add("52950");
        credenciais.add("44550");
        credenciais.add("53000");
        credenciais.add("45310");
        credenciais.add("260180");
        credenciais.add("45520");
        credenciais.add("52310");
        credenciais.add("45560");
        credenciais.add("260850");
        credenciais.add("330680");
        credenciais.add("259380");
        credenciais.add("260860");
        credenciais.add("52160");
        credenciais.add("45180");
        credenciais.add("257590");
        credenciais.add("29250");
        credenciais.add("246160");
        credenciais.add("45380");
        credenciais.add("261560");
        credenciais.add("358300");
        credenciais.add("44970");
        credenciais.add("259720");
        credenciais.add("45230");
        credenciais.add("28922");
        credenciais.add("43190");
        credenciais.add("245310");
        credenciais.add("28121");
        credenciais.add("260950");
        credenciais.add("50641");
        credenciais.add("261390");
        credenciais.add("347220");
        credenciais.add("28455");
        credenciais.add("43630");
        credenciais.add("261100");
        credenciais.add("52960");
        credenciais.add("28801");
        credenciais.add("26491");
        credenciais.add("25722");
        credenciais.add("44700");
        credenciais.add("43690");
        credenciais.add("260880");
        credenciais.add("245460");
        credenciais.add("2600610");
        credenciais.add("45530");
        credenciais.add("258320");
        credenciais.add("45340");
        credenciais.add("27561");
        credenciais.add("261970");
        credenciais.add("261080");
        credenciais.add("346770");
        credenciais.add("45200");
        credenciais.add("52130");
        credenciais.add("357240");
        credenciais.add("359830");
        credenciais.add("261380");
        credenciais.add("30730");
        credenciais.add("245400");
        credenciais.add("355120");
        credenciais.add("29951");
        credenciais.add("260660");
        credenciais.add("20580");
        credenciais.add("246410");
        credenciais.add("52250");
        credenciais.add("261600");
        credenciais.add("45430");
        credenciais.add("261870");
        credenciais.add("20610");
        credenciais.add("44800");
        credenciais.add("44570");
        credenciais.add("257440");
        credenciais.add("42860");
        credenciais.add("259560");
        credenciais.add("10750");
        credenciais.add("28632");
        credenciais.add("100000048");
        credenciais.add("43410");
        credenciais.add("45460");
        credenciais.add("27182");
        credenciais.add("261590");
        credenciais.add("358390");
        credenciais.add("52680");
        credenciais.add("257706");
        credenciais.add("358670");
        credenciais.add("44250");
        credenciais.add("44380");
        credenciais.add("261010");
        credenciais.add("260890");
        credenciais.add("346400");
        credenciais.add("260910");
        credenciais.add("36212");
        credenciais.add("260900");
        credenciais.add("347060");
        credenciais.add("261400");
        credenciais.add("255320");
        credenciais.add("43620");
        credenciais.add("44640");
        credenciais.add("259920");
        credenciais.add("45240");
        credenciais.add("346130");
        credenciais.add("11250");
        credenciais.add("44930");
        credenciais.add("246110");
        credenciais.add("430230");
        credenciais.add("52010");
        credenciais.add("44830");
        credenciais.add("52410");
        credenciais.add("27462");
        credenciais.add("260560");
        return credenciais;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        cc=new AppDataBase(this);
       //AppDataBase cc=new AppDataBase(this);
       // cc.addCliente(new Cliente(1,"cdcdcd"));
       // Toast.makeText(MainActivity.this,"salvo com sucesso",Toast.LENGTH_LONG).show();
        //cc.getWritableDatabase();

        //cc.inserir(db,"cdcdc");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_leitura = findViewById(R.id.btn_scan);
        btn_leitura.setOnClickListener(v ->
        {
            scanCode();



        });


        botao_tela2=findViewById(R.id.btn_tela2);
        botao_tela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,TelaLista.class);
                startActivity(intent);

            }
        });



    }


    private void scanCode() {
        ScanOptions options=new ScanOptions();
        options.setPrompt("Para aumentar o volume do bip");
        options.setBeepEnabled(true);
        options.setOrientationLocked(true);
        options.setCaptureActivity(CaptureACt.class);
        barLaucher.launch(options);
    }
    ActivityResultLauncher<ScanOptions> barLaucher=registerForActivityResult(new ScanContract(), result ->
    {
        if (result.getContents() != null)

            {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                x=result.getContents();
                String cdcd;
                //db = this.cc.getWritableDatabase();
               // cc.inserir(db,x);

              //  cc.close();

                TextView txt=(TextView)findViewById(R.id.txt_teste);

                 z=  x.replaceAll("[^0-9]", "");
               // txt.setText(z);
                builder.setTitle("Result");
                builder.setMessage(result.getContents());
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                         public void testaDados() {
                             int quantidade=credenciais.size();
                                for(int i=0;i<quantidade;i++ ) {
                                    if (z.contains(credenciais.get(i))) {
                                        a = 1;
                                    }

                                }
                    }

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                   dialog.dismiss();
                        TextView txt = (TextView) findViewById(R.id.txt_teste);
                            listar();
                         testaDados();

                        if (a==1) {

                           txt.setText("TEM DIREITO AO BRINDE\n \uD83D\uDE01");
                            cc.inserir(db,x);
                           a=2;
                        } else {
                           // txt.setText(cores.get(1).getMatricula());
                            txt.setText("NÃO TEM DIREITO AO BRINDE\n \uD83D\uDE14");

                        }
                    }
                });
                builder.show();
            }
    });
}