int Solution::removeDuplicates(vector<int> &A) {
    if(A.size() == 0){
        return 0;
    }
    int i=0;
        for(int j=1;j<A.size();j++){
            if(A[i]!=A[j]){
                i++;
                A[i] = A[j];
            }
        }
    return i+1;
}
