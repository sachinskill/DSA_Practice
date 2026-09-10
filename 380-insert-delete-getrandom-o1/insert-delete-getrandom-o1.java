class RandomizedSet {
    private ArrayList<Integer> list;
    private HashMap<Integer, Integer> map;
    private Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        
        // Put the value in the map with its index (current size of the list)
        map.put(val, list.size());
        // Append the value to the end of the list
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        
        // Get the index of the element to delete
        int indexToRemove = map.get(val);
        int lastElement = list.get(list.size() - 1);
        
        // Swap: Move the last element into the position of the element to delete
        list.set(indexToRemove, lastElement);
        map.put(lastElement, indexToRemove);
        
        // Delete: Remove the last element from both structures
        list.remove(list.size() - 1);
        map.remove(val);
        
        return true;
    }
    
    public int getRandom() {
        // Pick a random index from 0 to list.size() - 1
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex);
    }
}