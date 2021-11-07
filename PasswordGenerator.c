#include <stdio.h>
#include <stdlib.h>

int main() {
    printf("Enter password length:\n");
    int len;
    scanf("%d", &len);
    char str;
    int ran = rand() % 126;
    for (int i = 0; i < len; i++) {
        printf("%d", ran);
    }
    return 0;
}