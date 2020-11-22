/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan55;

/**
 * Nama :Muhammad Alvin Rizqi Ramdahn
 * Kelas : IF10K
 * NIM : 10119913
 * @author Lenovo
 */
public class Blackberry extends Handphone {
    private String pinBB;

    public Blackberry(String man, String os, String model, int harga){
        super(man,os,model,harga);
    }

    public String getPinBB(){
        return pinBB;
    }

    public void setPinBB(String pinBB){
        this.pinBB = pinBB;
    }
}
