public class Solution {
    public int solve(String A, int B) {
        int day=0;
        switch(A)
        {
        case "Sunday": day=6;
        break;
        case "Tuesday": day=1;
        break;
        case "Wednesday": day=2;
        break;
        case "Thursday": day=3;
        break;
        case "Friday": day=4;
        break;
        case "Saturday": day=5;
        break;
        }
        int count =(B+day)/7;
        return count;
    }
}
