#include<stdio.h>

int main() {
    int year;
    printf("What is your birthyear? ");
    scanf("%d", &year);
    int age = 2021 - year;
    printf("Your age is: %d", age);
    if (age >= 18) {
        printf(" - Adult\n");
    } else if (age >= 12 && age <= 17) {
        printf(" - Teen\n");
    } else if (age >= 5 && age <= 11) {
        printf(" - Kid\n");
    } else {
        printf(" - Toddler\n");
    }
    return 0;
}
