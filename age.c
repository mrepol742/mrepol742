#include <stdio.h>

int main() {
    int age;
    printf("Input age:\n");
    scanf("%d", &age);
    if (age >= 18) {
        printf("Tertiary Level");
    } else if (age >= 14 && age <= 17) {
        printf("High School Level");
    } else if (age >= 8 && age <= 13) {
        printf("Elementary Level");
    } else if (age >= 4 && age <= 7) {
        printf("Primary Level");
    }
    return 0;
}