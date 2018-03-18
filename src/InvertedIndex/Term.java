package InvertedIndex;

import java.util.LinkedList;

public class Term implements Comparable {

    protected String term;
    protected LinkedListOrderedUnique<Document> documentList;

    public Term(String inTerm) {
        term = inTerm;
    }

    public String getTerm() {
        return term;
    }

    public LinkedListOrderedUnique<Document> getDocumentList() {
        return documentList;
    }

    public int compareTo(Object o) {
        return term.compareTo(((Term) o).term);
    }

    @Override
    public String toString() {
        String temp = term + " => ";
        temp = temp + documentList.toString();
        return temp;
    }

}
