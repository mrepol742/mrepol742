#include<stdio.h>
#include<conio.h>

int main() {
    double temp;
    printf("Enter the temperature: ");
    scanf("%lf", &temp);
    if (temp <= 20) {
        printf("The temperature is too cold");
    } else if (temp >= 30) {
       printf("The temperature is too hot");
    } else {
       printf("Cool climate");
    }
return 0; 
}