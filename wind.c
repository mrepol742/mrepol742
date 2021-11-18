#include <stdio.h>

int main() {
    int mph;
    printf("Input wind speed (mph):\n");
    scanf("%d", &mph);
    if (mph > 72) {
        printf("Hurricane");
    } else if (mph >= 55 && mph <= 72) {
        printf("Whole Gale");
    } else if (mph >= 39 && mph <= 54) {
        printf("Gale");
    } else if (mph >= 25 && mph <= 38) {
        printf("String Wind");
    } else {
        printf("Wind not strong");
    }
    return 0;
}