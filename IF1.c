#include<stdio.h>

int main() {
    int integer;
    printf("Enter an Integer: ");
    scanf("%d", &integer);
    if (integer >= 50) {
        printf("%d is greater than or equal to 50\n", integer);
    }
    return 0;
}
