/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package handphone;

/**
 *
 * @author TOSHIBA
 */
public class Handphone {
    String Merk;
    String Warna;
    String JenisProcessor;
    String UkuranLayar;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Handphone handphoneku = new Handphone();
        handphoneku.Merk= "Samsung";
        handphoneku.Warna="Biru";
        handphoneku.JenisProcessor="Exynos";
        handphoneku.UkuranLayar="6,5 inchi";
        
        System.out.println("Merk"+handphoneku.Merk);
        System.out.println("Warna"+handphoneku.Warna);
        System.out.println("processor"+handphoneku.JenisProcessor);
        System.out.println("Ukuran Layar"+handphoneku.UkuranLayar);
    }
    
}
