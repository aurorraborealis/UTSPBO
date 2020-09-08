package StringUTS;

public class ChartoString {

  public static void main(String[] args) {
    
    //Variabel string yang berisi karakter alphabet
    String chara = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#-";
    //variabel string yang berisi nomor index beberapa karakter dalam variabel chara, di pisahkan menggunakan "-"
    String numIn = "5-0-20-25-0-13";
    
    //method split untuk memisahkan string supaya menjadi array
    String[] ex = numIn.split("-");
    int[] n = new int[ ex.length ];
    
    //Merubah tipe data hasil pemisahan string supaya bisa menjadi tipe data integer
    for(int i = 0 ; i < n.length ; i++) {
       n[i] = Integer.parseInt(ex[i]);
    };
    
    //Mengambil character dari variabel chara ke dalam array kemudian di susun sesuai index pada variabel numIn
    char[] word  = new char[ ex.length];
    for(int u=0; u<n.length; u++){
       word[u] = chara.charAt(n[u]);
    };
    
    //Variabel word yang berupa array di output kan sesuai index
    for(int o=0; o<word.length; o++){
      System.out.print(word[o]);
    };
    System.out.println();
    for(int o=0; o<word.length; o++){
      System.out.print(word[o]+",");
    };
    System.out.println();
    
    //Sekian dan Terimakasih
    
  }
  
}
