#include<stdio.h>

int main() {
    printf("Integer an integer: ");
    int integer;
    scanf("%d", integer);
    if (integer == 100) {
        printf("integer is equal to 100!\n");
    } else if (integer > 100) {
        printf("integer is greater than 100!\n");
    }
    return 0;
}
