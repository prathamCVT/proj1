
public class HashTable {
    private Record[] lister;
    private Record tombstone;
    public HashTable(int size) {
        lister = new Record[size];
    }
    
    public int Hashinsert(Record r) {
        int homeSlot = 0;
        int id = r.getID();
            //((k/M ) mod (M/2)) ∗ 2) + 1
        homeSlot = id % lister.length;
        if(lister[homeSlot] == null || lister[homeSlot] == tombstone) {
        lister[homeSlot] = r;
        }
        else {
            while(lister[homeSlot] != null) {
                int hash2 = (((id / lister.length ) % (lister.length / 2)) * 2) + 1;
                if(lister[(homeSlot + hash2) % lister.length] == null) {
                    lister[(homeSlot + hash2) % lister.length] = r; 
                }
            }
        }
    }
}
