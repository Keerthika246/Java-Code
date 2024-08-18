class Pattern{
public static void main(String[] args){
int rows=5;
for(int i = 1;i<= rows;i++){
for(int j = 1;j<=i; j++){
System.out.print("*");
}
System.out.print("X");
}
for(int k = rows-i; k>=1;k--){
System.out.println();
}
}
}
