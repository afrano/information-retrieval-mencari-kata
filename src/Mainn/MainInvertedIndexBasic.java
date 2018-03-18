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
//public class MainInvertedIndexBasic {
//
//    public static void main(String[] args) {
//
//        
//        InvertedIndexBasic cobaList;
//        
//        cobaList = new InvertedIndexBasic();
//        for (int i = 1; i <= 12; i++) {
//            try {
//        File f = new File("D:/Bahan Kuliah/Semester 6/Informasi/Koleksi/doc" + i + ".txt");
//                Scanner s = new Scanner(f);
//                while (s.hasNext()) {
//                    String token = s.next();
//                    StringTokenizer tokenizer = new StringTokenizer(token);
//                    while (tokenizer.hasMoreTokens()) {
//                        cobaList.add(tokenizer.nextToken(),"doc"+i);
//                    }
//
//                }
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(MainInvertedIndexBasic.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//        System.out.println(cobaList);
//        
//    }
//
//}
