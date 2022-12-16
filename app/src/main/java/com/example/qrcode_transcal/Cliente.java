package com.example.qrcode_transcal;

public class Cliente {
    String matricula;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


public Cliente(){

}

public Cliente(int _id, String _matricula){
        this.id=_id;
        this.matricula=_matricula;
}




}