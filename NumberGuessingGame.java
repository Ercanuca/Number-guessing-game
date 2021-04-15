/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.guessing.game;
import java.util.Scanner;import java.util.Random;
/**
 *
 * @author Windows10
 */
public class NumberGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner(System.in);
Random rnd = new Random();
System.out.println("Sayı tahmin oyununa hoş geldiniz!");
System.out.println("Lütfen 1-100 arasında bir sayı giriniz: ");
// Kullanıcıdan sayı alıyoruz
int tahmin = input.nextInt();
// Bilgisayardan rastgele sayı alıyoruz
int sayi = rnd.nextInt(101);
while (tahmin != sayi) {
if(tahmin < 0 || tahmin > 100 ) {
System.out.println("1 ile 100 arasında bir değer giriniz: ");
tahmin = input.nextInt(); }
else if (tahmin < sayi) {
System.out.println("Daha büyük bir sayı giriniz: ");
tahmin = input.nextInt(); }
else{
System.out.println("Daha küçük bir sayı giriniz: ");
tahmin = input.nextInt();}
}
// Eğer sayımız ve tahmin birbirine eşitse while döngüsüne girmez
// ve print komutunu yazdırırız
System.out.println("Tebrikler, kazandınız!"); }
    
}
