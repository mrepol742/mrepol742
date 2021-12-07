#include <stdio.h>

int main() {
    char name[100];
    printf("Your Full Name: ");
    scanf("%[^\n]%*c", name);
    int first;
    printf("Enter first interger: ");
    scanf("%d", &first);
    int second;
    printf("Enter second integer: ");
    scanf("%d", &second);
   
    printf("\n\nFull Name: %s\n", name);
    int product = first * second;
    int sum = first + second;
    int difference = first - second;
    printf("The product of first and second integer: %d\n", product);
    printf("The sum of first and second integer: %d\n", sum);
    printf("The difference of first and second integer: %d\n", difference);
    return 0;
}