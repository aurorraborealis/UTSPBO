package StringUTS;

public class ChartoString {
  
//  Code by
//  Fauzan Syahidur Rohman
//  XII RPL C

  public static void main(String[] args) {
    
    //Variabel string yang berisi karakter alphabet
    String chara = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#-";
    //variabel string yang berisi nomor index beberapa karakter dalam variabel chara, di pisahkan menggunakan "-"
    String numIn = "5-0-20-25-0-13-27-18-24-0-7-8-3-20-17";
    
    //method split untuk memisahkan string supaya menjadi array
    String[] ex = numIn.split("-");
    int[] n = new int[ ex.length ];
    char[] word  = new char[ ex.length];
    
    //Merubah tipe data hasil pemisahan string supaya bisa menjadi tipe data integer dan mengambil karakter dari variabel chara
    for(int i = 0 ; i < n.length ; i++) {
       n[i] = Integer.parseInt(ex[i]);
       word[i] = chara.charAt(n[i]);
    };
    
    //Variabel di output kan
    for(int o=0; o<word.length; o++){
      System.out.print(word[o]+" | ");
    };
    String res = String.valueOf(word);
    System.out.println("\n\nResult : " + res);
    
//  Sekian dan Terimakasih
    
  }
  
}
