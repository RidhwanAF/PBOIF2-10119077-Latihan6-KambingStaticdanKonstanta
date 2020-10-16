/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan6.kambingstaticdankonstanta;

/**
 *
 * @author RAF
 * Nama         : Ridhwan Anwar Fauzan
 * Kelas        : IF-2 
 * NIM          : 10119077
 * Deskripsi    : Kambing Static & Konstanta
 */

public class PBOIF210119077Latihan6KambingStaticdanKonstanta {


    public static final String NAMA_KAMBING = "SOLEH";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}
