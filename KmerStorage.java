import java.util.ArrayList;

public class KmerStorage {

    private ArrayList<Kmer> list;

    /**
     * Constructor
     */
    public KmerStorage() {

        list = new ArrayList<Kmer>();

    }


    /**
     * 
     * @param seq
     */
    public void addKmer(String seq) {

        // Loop through the list
        for (int i = 0; i < list.size(); i++) {
            // if the kmer matches the inputted sequence
            if (list.get(i).getName().equals(seq)) {

                // increment i
                list.get(i).increment();

                // if it equals a sequence in the list break out
                break;
            }

        }

        // if the kmer isn't in the list then add it to the list
        Kmer newKmer = new Kmer(seq);
        list.add(newKmer);

    }

}
