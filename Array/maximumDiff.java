public class maximumDiff {
    public int main(int A[], int N)
	{
	    int res = A[1] - A[0] ; 
	    for(int i=0 ; i<N-1 ; i++){
	        for(int j=i+1 ; j<N ; j++){
	            res = Math.max(res , A[j]-A[i]) ; 
	        }
	    }
	    return res ; 
	}
}
