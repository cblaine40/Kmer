
public class Kmer {

  //the number of the count 
    private int count;
    
    //the kmer sequence
    private String seq;
    
    /**
     * Constructor to make a new kmer with the sequence
     * @param name the sequence
     */
    public Kmer(String name) {
        
        seq = name;
        count++;
        
    }
    
    /**
     * Return the name 
     * @return sequenece 
     */
    public String getName() {
        return seq;
    }
    
    public void increment() {
        count++;
    }
    
    /**
     * Get count
     */
    public int getCount() {
        return count;
    }
}
