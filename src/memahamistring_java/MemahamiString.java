/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memahamistring_java;

/**
 * @author RizkyKhapidsyah
 */
public class MemahamiString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hai " + args[0] + " Manis");
        /*  variabel args dengan index array=0 dapat diisi nilai melalui terminal atau command prompt
            dengan tipe data string.
        
            Dengan format compiling seperti biasa: javac MemahamiString.java 
            Setelah itu jalankan dengan format: java MemahamiString [isi_variabel_args_sebanyak_1_kata]
        
            Lakukan berikut pada Terminal atau Command Prompt:
            Contoh: javac MemahamiString.java
            setelah itu jalankan seperti biasa: java MemahamiString Rizky
        
            String "Rizky" akan dimasukkan ke dalam variabel args dengan index array pertama (ke 0), 
            Jika ada 2 kata, maka kata yang kedua akan di simpan pada index selanjutnya, yaitu index ke 1.
            dan seterusnya jika kalimat lebih dari 2 kata, maka penyimpanan data akan dimasukkan ke index array selanjutnya.
        */
    }
}
