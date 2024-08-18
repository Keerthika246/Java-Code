class Pattern3{
public static void main(String[] args){
int rows = 10;
for(int i = 1;i<=rows;i++){
for(int j = i;j<rows;j++){
System.out.print(" ");
}
for(int k = 1; k<=i;k++){
System.out.print("Tom");
}
System.out.println();
}
}
}