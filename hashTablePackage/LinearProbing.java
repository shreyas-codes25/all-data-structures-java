package hashTablePackage;

public class LinearProbing{
    
    private int currSize,maxSize;
    private String keys[];
    private String vals[];

    public LinearProbing(int capacity){
        currSize = 0;
        this.maxSize = capacity;
        keys = new String[maxSize];
        vals = new String[maxSize];
    }

    public void makeEmpty(){
        currSize = 0;
        keys = new String[maxSize];
        vals = new String[maxSize];
    }

    public int getSize(){
        return currSize;
    }

    public boolean isFull(){
        return currSize == maxSize;
    }

    public boolean isEmpty(){
        return getSize() ==0;
    }
    public boolean contains(String k){
        return get(k)!= null;
    }
    public int hash(String k){
        return Integer.parseInt(k)%maxSize;
        //return k.hashCode()%maxSize;
    }
    public String get(String k){
        int i=hash(k);
        while(keys[i]!= null){
            if(keys[i].equals(k)){
                return vals[i];
            }
            i=(i+1)%maxSize;
        }
        return null;
    }

    public void insert(String k, String v){
        int temp = hash(k);
        int i=temp;

        do{
            if(keys[i]==null){
                keys[i] = k;
                vals[i] = v;
                currSize++;
                return;
            }
            if(keys[i]==k){
                vals[i] = v;
                return;
            }
            i=(i+1)%maxSize;
        }while(i != temp);
    }

    public void remove(String k){
        if(!contains(k)){
            return;
        }
        int i=hash(k);
        while(!k.equals(keys[i])){
             i = (i + 1)%maxSize;
        }
        keys[i]=vals[i] = null;

        for(i=(i+1)%maxSize;keys[i]!= null;i=(i+1)%maxSize){
            String temp1 = keys[i],temp2= vals[i];
            keys[i]=vals[i] = null;
            currSize--;
            insert(temp1, temp2);
        }
        currSize--;
    }
    public void printHashTable(){
        clearConsole();
        System.out.println("\n Hash Table");
        System.out.println("KEYS  VALUES");
        for(int i=0;i<maxSize;i++){
            if(keys[i] != null){
                System.out.println(keys[i]+" "+vals[i]);
            }
        }
    
    }
    public void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // For Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // For Unix/Linux/macOS
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}