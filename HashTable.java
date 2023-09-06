
public class HashTable {
    private Record[] lister;
    private Record tombstone;
    public HashTable(int size) {
        lister = new Record[size];
    }
    
    public int Hashinsert(int id) {
        int homeSlot = 0;
        
        homeSlot = id % lister.length;
        if(lister[homeSlot] == null || lister[homeSlot] == tombstone) {
        lister[homeSlot] = id;
        }
        else {
            
        }
    }
}
