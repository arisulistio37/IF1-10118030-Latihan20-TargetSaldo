/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan20.targetsaldo;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi Program : Program ini berisi tentang Target saldo
 */
public class IF110118030Latihan20TargetSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldo = 3500000;
        double saldod= 6000000;
        double saldos= saldo;
        double bunga = 0.8;
        int bulan =1;
        
        do{
            saldos+= saldos*bunga;
            System.out.printf("Saldo di bulan ke-%d Rp. %.0f\n ",bulan ,saldos);
            bulan++;
        }while(saldos<saldod);
    }
    
}
