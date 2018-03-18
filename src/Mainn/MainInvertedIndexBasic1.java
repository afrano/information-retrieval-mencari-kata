//package Mainn;
//
//
//import InvertedIndex.Term;
//import InvertedIndex.InvertedIndexBasic;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class MainInvertedIndexBasic1 {
//
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//        InvertedIndexBasic cobaList;
//        
//        cobaList = new InvertedIndexBasic();
//        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan kata :");
//        String a = sc.next();
//        String b = a.toUpperCase();
//        System.out.println("\n");
//        for (int i = 1; i <= 12; i++) {
//            try {
//    File f = new File("D:/Bahan Kuliah/Semester 6/Informasi/Koleksi/doc" + i + ".txt");
//                Scanner s = new Scanner(f);
//                int x = 0;
//                while (s.hasNext()) {
//                    String token = s.next();
//                    StringTokenizer tokenizer = new StringTokenizer(token);
//                    while (tokenizer.hasMoreTokens()) {
//                        if (tokenizer.nextToken().toUpperCase().matches(b)) {
//                        cobaList.add(a,"doc"+i);
//                    }
//                    }
//                }
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(MainInvertedIndexBasic.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//     
//        System.out.println(cobaList); 
//    }
//
//}
