public class Solution {
    static class Person implements Comparator<Person>{
        int height;
        int infront;
        public Person(){}
        public Person(int height, int infront){
            this.height = height;
            this.infront = infront;
        }
        public int compare(Person p1, Person p2){
            return p1.height - p2.height;
        }
    }
    
    public ArrayList<Integer> order(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(A == null || B == null || A.size() != B.size())
            return result;
        
        int n = A.size();
        Person[] persons = new Person[n];
        for(int i = 0; i< n; i++)
            persons[i] = new Person(A.get(i), B.get(i));
        
        Arrays.sort(persons, new Person());
        Person[] temp = new Person[n];
        for(Person p : persons){
            int count = 0; 
            for(int i = 0; i < n; i++){
                if(count == p.infront){                    
                    while(temp[i] != null && i < n-1)
                        i++;
                    temp[i] = p;
                    break;
                }
                if(temp[i] == null){
                    count++;
                }
            }            
        }
        for(int i = 0; i < n; i++)
            result.add(temp[i].height);
        return result;
    }
}
