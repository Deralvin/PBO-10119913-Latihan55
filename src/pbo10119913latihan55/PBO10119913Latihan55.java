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
public class PBO10119913Latihan55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android andro = new Android("Samsung","Android","Grand",3000000);
        andro.setKeyStore("234ibfd3840fo");
        andro.displayProduct();
        System.out.printf("Android Key Store : %s%n%n", andro.getKeyStore());

        Blackberry bb = new Blackberry("BlackB","RIM","Curve",2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.printf("PIN               : %s%n%n", bb.getPinBB());

        WindowsPhone windows = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        windows.setWpKeyStore("UUUQIJWORJ");
        windows.displayProduct();
        System.out.println("Wp Key Store      : " + windows.getWpKeyStore());

    }
    
}
