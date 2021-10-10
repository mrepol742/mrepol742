#include<stdio.h>
#include<conio.h>
int main()
{
    float kg, g, h, i;
    printf("Enter weight in Kilogram: ");
    scanf("%f", &kg);
    printf("\n");
    g = kg*1000;
    h = kg/1000;
    i = g*1000;
    printf("Equivalent weight in Gram = %0.3f", g);
    printf("\n");
    printf("Equivalent weight in Milligram = %0.3f", i);
     printf("\n");
    printf("Equivalent weight in Metric Ton = %0.3f", h);
    return 0;
}