/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InvertedIndex;

/**
 *
 * @author basis28
 */
public class Document implements Comparable {

    protected String document;
//    protected int frequency;

    public Document() {
    }

    public Document(String inDocument) {
        document = inDocument;
//        frequency = 1;
    }

    public String getDocument() {
        return document;
    }

    public int compareTo(Object o) {
        return document.compareTo(((Document) o).document);
    }

    public String toString() {
        return document;
    }
//    public int getFrequency() {
//        return frequency;
//    }
}
