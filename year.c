#include <stdio.h>

int main() {
    int year;
    printf("Input year:\n");
    scanf("%d", &year);
    if (year == 1) {
        printf("Freshman");
    } else if (year == 2) {
        printf("Sophormore");
    } else if (year == 3) {
        printf("Junior");
    } else if (year == 4) {
        printf("Senior");
    } else {
        printf("Error");
    }
    return 0;
}