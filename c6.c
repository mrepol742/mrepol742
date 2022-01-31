#include<stdio.h>

int main() {
    union abc {
        int a;
        char cha;
    } var;
    
    printf("%d", var.a);
    return 0;
}