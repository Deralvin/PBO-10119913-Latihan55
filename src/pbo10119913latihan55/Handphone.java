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
public class Handphone {
 protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga){
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }

    public void displayProduct(){
        System.out.println("Manufaktur        : " + this.manufacture);
        System.out.println("OS                : " + this.operatingSystem);
        System.out.println("Model             : " + this.model);
        System.out.println("Harga             : " + this.harga);
    }
}
