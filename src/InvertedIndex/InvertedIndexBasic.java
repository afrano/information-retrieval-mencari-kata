
package InvertedIndex;
public class InvertedIndexBasic {

    private LinkedListOrderedUnique<Term> termList;

    public InvertedIndexBasic() {
        termList = new LinkedListOrderedUnique<Term>();
    }

    public LinkedListOrderedUnique getTermList() {
        return termList;
    }

    public void add(String pTerm, String pDocument) {

        Term vTerm = termList.get(new Term(pTerm));
      
        if (vTerm == null) {
       
            Term oTerm = new Term(pTerm);
          
            oTerm.documentList = new LinkedListOrderedUnique<Document>();
          
            oTerm.getDocumentList().addSort(new Document(pDocument));
           
            termList.addSort(oTerm);
        } 
        else {
          
            vTerm.getDocumentList().addSort(new Document(pDocument));
        }
    }

    @Override
    public String toString(){
        return termList.toString();
    }
}
