import java.util.Scanner;
public class SeatReservation {
    public static void main(String[] args) {

    int row=0,col=0;
    Scanner input=new Scanner(System.in);
 
     
       String[][] str=new String[10][10];
 
     for(int i=0;i<str.length;i++) {
        for(int j=0;j<str[i].length;j++) {
         str[i][j]="*";
  }
 }
 display(str);
 
 
 while(true) {
  
  System.out.println("\nEnter row and column number to reserve seprated by space (Enter a negative number to exit): ");
  
  
  row=input.nextInt();
  
  
  
  if(row>0 ) {
  
   col=input.nextInt();
   
   
   str[row-1][col-1]="X";
   
   
   display(str);
  }
  else {
   System.out.println("Program exit!");
   break;
  }
 }
 
}



public static void display(String[][] str) {

 System.out.println("\\Col 1\\Col 2\\Col3\\Col4");
 for(int i=0;i<str.length;i++) {

  System.out.print("Row "+(i+1)+"|");
  for(int j=0;j<str[i].length;j++) {

   System.out.print(str[i][j]+"\\");
  }

  System.out.println();
 }
}
}