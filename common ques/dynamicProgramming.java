//intro to dynamic programming - this is an example using the fib seq
//fib seq goes like: 1, 1, 2, 3, 5, 8, 13, ...

//we start with a look at simply using recursion
// this is flawed since we repeat certain things. For example, to find the 5th seq in the fibonacci seq we need to compute findNth(4) and findNth(3).
//here findNth(3), findNth(2), findNth(1) are computed more than once. Here the time it takes to find n is exponential. (2^n)
class fibSeq{
  private int result;

  int findNth(int n){ // n is the seq number you want in the seq
    if(n == 1 | n ==2){
      result = 1;
      return result;
    }else{
      result = findNth(n-1)+findNth(n-2);
      return result;
    }
  }
}

// next we have memoization, where instead of computing again, we store the values for later use
//the time complexity here for  findNth is called at least (2n + 1)*O(1) which is O of N time
class fibSeq{
  private int result;

  int findNth(int n, int[] savedValues){ // heere the array savedValues will store the values of the seq at the index determined by n
    if(savedValues[n] != null){ // array is initialized to null and if the value is not null then the value was already computed
      return result = savedValues[n];
    }
    if(n == 1 | n == 2){ // if the n is 1 or 2 then answer is 1 as seen in fib seq
      return result = 1;
    }else{
      result = findNth(n-1)+findNth(n-2);
      savedValues[n] = result;
      return result;
    }
  }
}

//This method is call bottom up and is more or less what we did for memoization but we are filling in the array at once
class fibSeq{
  private int result;

  int findNth(int n){
    if(n == 1 | n == 2){
      return result = 1;
    }
    int[] savedValues =  new int[n+1]; //we need n + 1 since index zero is not used
    savedValues[1] = 1;
    savedValues[2] = 1;
    for(int i=3; i<=n; i++){
      savedValues[i] = savedValues[i-1]+savedValues[i-2]; //calculate all values needed then return the index/value
    }
    return result = savedValues[n];
  }
}
