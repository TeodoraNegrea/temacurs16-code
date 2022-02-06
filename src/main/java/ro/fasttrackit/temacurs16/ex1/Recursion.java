package ro.fasttrackit.temacurs16.ex1;

public class Recursion {
    public int sum(int n){
        if( n == 0){
            return (n + sum(n-1));
        }else{
            return n;
        }
    }
    public int sumEvenNumbers(int n){
        if(n % 2 == 0){
            return  sumEvenNumbers(n -1);
        }else{
            return n;
        }
    }
    public String palindrome(String word){
        if(word == null || (word.length() <= 1)){
            return word;
        }else{
            return (word.substring(0,word.length() -1));
        }
    }
    public int digitSum(int number) {
        if (number == 0) {
            return number;
        } else {
            return (number % 10 + digitSum(number / 10));
        }
    }
        public int fib(int i){
            if(i <= 1){
                return i;
            }else{
                return (fib(i-1) + fib(i-2));
            }
        }
    }

