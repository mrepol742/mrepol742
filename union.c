#include <stdio.h>

int main() {
    union abc {
        int a;
        char cha;
    } var;
    var.cha = 'A';
  printf("%d", var.a);
    return 0;
}