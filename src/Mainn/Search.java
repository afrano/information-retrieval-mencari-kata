package Mainn;

import InvertedIndex.InvertedIndexBasic;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InvertedIndexBasic cobaList;
        cobaList = new InvertedIndexBasic();
        System.out.println("1. Menampilkan isi dari setiap file doc.txt");
        System.out.println("2. Mencari keberadaan file 1 kata tertentu");
        System.out.println("3. Mencari keberadaan file 4 kata tertentu\n");

        System.out.print("Masukkan pilihan (1/2/3) : ");
        int pil = sc.nextInt();
        if (pil == 1) {
            for (int i = 1; i <= 12; i++) {
                try {
                    File f = new File("D:/Bahan Kuliah/Semester 6/Informasi/Koleksi/doc" + i + ".txt");
                    Scanner s = new Scanner(f);
                    System.out.println("===ISI DARI FILE doc" + i + ".txt ;===");
                    while (s.hasNext()) {
                        String token = s.next();
                        StringTokenizer tokenizer = new StringTokenizer(token);
                        while (tokenizer.hasMoreTokens()) {
                            System.out.println(tokenizer.nextToken());
                        }
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MainInvertedIndexBasic.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("\n");
        } else if (pil == 2) {
            cobaList.getTermList().clear();
            System.out.println("Masukkan 1 kata yang dicari :");
            String a = sc.next();
            String b = a.toUpperCase();
            System.out.println("\n");
            for (int i = 1; i <= 12; i++) {
                try {
                    File f = new File("D:/Bahan Kuliah/Semester 6/Informasi/Koleksi/doc" + i + ".txt");
                    Scanner s = new Scanner(f);
                    while (s.hasNext()) {
                        String token = s.next();
                        StringTokenizer tokenizer = new StringTokenizer(token);
                        while (tokenizer.hasMoreTokens()) {
                            if (tokenizer.nextToken().toUpperCase().matches(b)) {
                                cobaList.add(a, "doc" + i);
                            }
                        }
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println(cobaList);
        } else if (pil == 3) {
            int qty = 4;
            String[] kata = new String[qty];
            String[] b = new String[qty];
            ArrayList<Integer> kata1 = new ArrayList();
            ArrayList<Integer> kata2 = new ArrayList();
            ArrayList<Integer> kata3 = new ArrayList();
            ArrayList<Integer> kata4 = new ArrayList();
            for (int i = 0; i < qty; i++) {
                cobaList.getTermList().clear();
                System.out.println("Masukkan kata " + (i + 1) + " :");
                kata[i] = sc.next();
                b[i] = kata[i].toUpperCase();
                System.out.println();
                for (int j = 1; j <= 12; j++) {
                    try {
                        File f = new File("D:/Bahan Kuliah/Semester 6/Informasi/Koleksi/doc" + j + ".txt");
                        Scanner s = new Scanner(f);
                        while (s.hasNext()) {
                            String token = s.next();
                            StringTokenizer tokenizer = new StringTokenizer(token);
                            while (tokenizer.hasMoreTokens()) {
                                if (i == 0) {
                                    if (tokenizer.nextToken().toUpperCase().matches(b[i])) {
                                        cobaList.add(kata[i], "doc" + j);
                                        kata1.add(j);
                                    }
                                } else if (i == 1) {
                                    if (tokenizer.nextToken().toUpperCase().matches(b[i])) {
                                        cobaList.add(kata[i], "doc" + j);
                                        kata2.add(j);
                                    }
                                } else if (i == 2) {
                                    if (tokenizer.nextToken().toUpperCase().matches(b[i])) {
                                        cobaList.add(kata[i], "doc" + j);
                                        kata3.add(j);
                                    }
                                } else {
                                    if (tokenizer.nextToken().toUpperCase().matches(b[i])) {
                                        cobaList.add(kata[i], "doc" + j);
                                        kata4.add(j);
                                    }
                                }
                            }
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(MainInvertedIndexBasic.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                System.out.println(cobaList);
            }
            ArrayList<Integer> kata1b = new ArrayList(new HashSet(kata1));
            ArrayList<Integer> kata2b = new ArrayList(new HashSet(kata2));
            ArrayList<Integer> kata3b = new ArrayList(new HashSet(kata3));
            ArrayList<Integer> kata4b = new ArrayList(new HashSet(kata4));
            ArrayList<Integer> kata1234 = new ArrayList();

            for (int i = 0; i < kata1b.size(); i++) {
                for (int j = 0; j < kata2b.size(); j++) {
                    for (int k = 0; k < kata3b.size(); k++) {
                        for (int l = 0; l < kata4b.size(); l++) {
                            if (kata1b.get(i) == kata2b.get(j) && kata2b.get(j) == kata3b.get(k)
                                    && kata3b.get(k) == kata4b.get(l) && kata1b.get(i) == kata4b.get(l)) {
                                kata1234.add(kata1b.get(i));
                            }
                        }
                    }
                }
            }

            System.out.println("kata " + kata[0] + ", " + kata[1] + ", " + kata[2] + ", " + kata[3]);
            System.out.print("terdapat di dokumen : " + kata1234 + " ");
        }
    }
}
