class Fact{
static int fact(int n){
if(n==0)
return 1;
else
return n*(fact(n-1));
}

public static void main(String[] args){
int i, f=1;
int number=24;
f = fact(number);
System.out.println("fact of "+number+" is: "+f);
}
}
