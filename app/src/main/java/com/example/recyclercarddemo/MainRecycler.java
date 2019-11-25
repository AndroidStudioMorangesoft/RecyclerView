package com.example.recyclercarddemo;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MainRecycler extends AppCompatActivity {




    private RecyclerView recyclerViewCantante;
    private  RecyclerViewAdaptador adaptadorCantante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        recyclerViewCantante=(RecyclerView)findViewById(R.id.recyclerCantante);
        recyclerViewCantante.setLayoutManager(new LinearLayoutManager(this));

        // adaptadorCantante = new RecyclerViewAdaptador(obtenerCantanteBD());
        adaptadorCantante = new RecyclerViewAdaptador(obtenerCantantes());
        recyclerViewCantante.setAdapter(adaptadorCantante);

    }


    //conexion y listado

    public Connection conexionBD(){

        Connection conexion = null;

        try{
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://MORANGESOFT-PC//SQLEXPRESS;databaseName=Developeru;user=sql;password=sql;");

        }catch(Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();


        }

        return conexion;

    }


    public List<CantanteModelo> obtenerCantanteBD(){
        List<CantanteModelo> cantante = new ArrayList<>();
        try {
            Statement st = conexionBD().createStatement();
            ResultSet rs = st.executeQuery("select * from usuario");
            while(rs.next()){
                cantante.add(new CantanteModelo(

                        rs.getString("cantante"),
                        rs.getString("nacialidad"),
                        rs.getString("edad"),
                        rs.getString("estado"),
                        rs.getString("fecha"),
                        R.drawable.img1));
            }



        }catch (Exception es){
            Toast.makeText(getApplicationContext(),es.getMessage(),Toast.LENGTH_SHORT).show();
        }

        return cantante;

    }











    public List<CantanteModelo> obtenerCantantes(){

        List<CantanteModelo> cantante = new ArrayList<>();
        cantante.add(new CantanteModelo("Karen","Perú","34","Casada","01-02-03",R.drawable.img1));
        cantante.add(new CantanteModelo("Elena","Brasil","23","Soltera","03-05-06",R.drawable.img2));
        cantante.add(new CantanteModelo("Mario","Argentina","34","Casado","03-05-19",R.drawable.img3));
        cantante.add(new CantanteModelo("Maria","italia","23","Casada","03-05-19",R.drawable.img4));
        cantante.add(new CantanteModelo("Teresa","Francia","12","Soltera","03-05-19",R.drawable.img5));

        cantante.add(new CantanteModelo("Soyla","Perú","76","Casada","01-02-03",R.drawable.img1));
        cantante.add(new CantanteModelo("Emmna","Brasil","23","Soltera","03-05-06",R.drawable.img2));
        cantante.add(new CantanteModelo("Raúl","Argentina","11","Casado","03-05-19",R.drawable.img3));
        cantante.add(new CantanteModelo("Gloria","italia","78","Casada","03-05-19",R.drawable.img4));
        cantante.add(new CantanteModelo("Eyleen","Francia","12","Soltera","03-05-19",R.drawable.img5));


        cantante.add(new CantanteModelo("yulia","Perú","55","Casada","01-02-03",R.drawable.img1));
        cantante.add(new CantanteModelo("yun","Brasil","34","Soltera","03-05-06",R.drawable.img2));
        cantante.add(new CantanteModelo("Carlos","Argentina","34","Casado","03-05-19",R.drawable.img3));
        cantante.add(new CantanteModelo("Deysi","italia","43","Casada","03-05-19",R.drawable.img4));
        cantante.add(new CantanteModelo("Made","Francia","16","Soltera","03-05-19",R.drawable.img5));

        cantante.add(new CantanteModelo("Elizabeth","Perú","319","Casada","01-02-03",R.drawable.img1));
        cantante.add(new CantanteModelo("Nancy","Brasil","21","Soltera","03-05-06",R.drawable.img2));
        cantante.add(new CantanteModelo("Juan","Argentina","20","Casado","03-05-19",R.drawable.img3));
        cantante.add(new CantanteModelo("Olga","italia","41","Casada","03-05-19",R.drawable.img4));
        cantante.add(new CantanteModelo("yomayra","Francia","17","Soltera","03-05-19",R.drawable.img5));

        cantante.add(new CantanteModelo("Karen","Perú","34","Casada","01-02-03",R.drawable.img1));
        cantante.add(new CantanteModelo("Elena","Brasil","23","Soltera","03-05-06",R.drawable.img2));
        cantante.add(new CantanteModelo("Mario","Argentina","34","Casado","03-05-19",R.drawable.img3));
        cantante.add(new CantanteModelo("Maria","italia","23","Casada","03-05-19",R.drawable.img4));
        cantante.add(new CantanteModelo("Teresa","Francia","12","Soltera","03-05-19",R.drawable.img5));

        cantante.add(new CantanteModelo("Soyla","Perú","76","Casada","01-02-03",R.drawable.img1));
        cantante.add(new CantanteModelo("Emmna","Brasil","23","Soltera","03-05-06",R.drawable.img2));
        cantante.add(new CantanteModelo("Raúl","Argentina","11","Casado","03-05-19",R.drawable.img3));
        cantante.add(new CantanteModelo("Gloria","italia","78","Casada","03-05-19",R.drawable.img4));
        cantante.add(new CantanteModelo("Eyleen","Francia","12","Soltera","03-05-19",R.drawable.img5));


        cantante.add(new CantanteModelo("yulia","Perú","55","Casada","01-02-03",R.drawable.img1));
        cantante.add(new CantanteModelo("yun","Brasil","34","Soltera","03-05-06",R.drawable.img2));
        cantante.add(new CantanteModelo("Carlos","Argentina","34","Casado","03-05-19",R.drawable.img3));
        cantante.add(new CantanteModelo("Deysi","italia","43","Casada","03-05-19",R.drawable.img4));
        cantante.add(new CantanteModelo("Made","Francia","16","Soltera","03-05-19",R.drawable.img5));

        cantante.add(new CantanteModelo("Elizabeth","Perú","319","Casada","01-02-03",R.drawable.img1));
        cantante.add(new CantanteModelo("Nancy","Brasil","21","Soltera","03-05-06",R.drawable.img2));
        cantante.add(new CantanteModelo("Juan","Argentina","20","Casado","03-05-19",R.drawable.img3));
        cantante.add(new CantanteModelo("Olga","italia","41","Casada","03-05-19",R.drawable.img4));
        cantante.add(new CantanteModelo("yomayra","Francia","17","Soltera","03-05-19",R.drawable.img5));

        cantante.add(new CantanteModelo("Karen","Perú","34","Casada","01-02-03",R.drawable.img1));
        cantante.add(new CantanteModelo("Elena","Brasil","23","Soltera","03-05-06",R.drawable.img2));
        cantante.add(new CantanteModelo("Mario","Argentina","34","Casado","03-05-19",R.drawable.img3));
        cantante.add(new CantanteModelo("Maria","italia","23","Casada","03-05-19",R.drawable.img4));
        cantante.add(new CantanteModelo("Teresa","Francia","12","Soltera","03-05-19",R.drawable.img5));

        cantante.add(new CantanteModelo("Soyla","Perú","76","Casada","01-02-03",R.drawable.img1));
        cantante.add(new CantanteModelo("Emmna","Brasil","23","Soltera","03-05-06",R.drawable.img2));
        cantante.add(new CantanteModelo("Raúl","Argentina","11","Casado","03-05-19",R.drawable.img3));
        cantante.add(new CantanteModelo("Gloria","italia","78","Casada","03-05-19",R.drawable.img4));
        cantante.add(new CantanteModelo("Eyleen","Francia","12","Soltera","03-05-19",R.drawable.img5));


        cantante.add(new CantanteModelo("yulia","Perú","55","Casada","01-02-03",R.drawable.img1));
        cantante.add(new CantanteModelo("yun","Brasil","34","Soltera","03-05-06",R.drawable.img2));
        cantante.add(new CantanteModelo("Carlos","Argentina","34","Casado","03-05-19",R.drawable.img3));
        cantante.add(new CantanteModelo("Deysi","italia","43","Casada","03-05-19",R.drawable.img4));
        cantante.add(new CantanteModelo("Made","Francia","16","Soltera","03-05-19",R.drawable.img5));

        cantante.add(new CantanteModelo("Elizabeth","Perú","319","Casada","01-02-03",R.drawable.img1));
        cantante.add(new CantanteModelo("Nancy","Brasil","21","Soltera","03-05-06",R.drawable.img2));
        cantante.add(new CantanteModelo("Juan","Argentina","20","Casado","03-05-19",R.drawable.img3));
        cantante.add(new CantanteModelo("Olga","italia","41","Casada","03-05-19",R.drawable.img4));
        cantante.add(new CantanteModelo("yomayra","Francia","17","Soltera","03-05-19",R.drawable.img5));

        return cantante;
    }



}















