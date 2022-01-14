#include<stdio.h> 
 
int main() { 
    int numbers[10];
    int sum = 0; 
 
    printf("Enter 1 to 10: "); 
    for (int i=0; i < 10; i++)
        scanf("%d", &numbers[i]); 
    
    for (int i= 0; i < 10; i++)
        sum += numbers[i];

    printf("The sum of numbers is: %d\n",sum); 
 
    return 0; 
} 