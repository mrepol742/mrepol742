#include <stdio.h>

int main() {
    int option;
    float peso, result;
    printf("Choose one of the given options in this menu.");
    printf("\n[1] - Philippines currency (Peso) into Japan Currency (Yen)");
    printf("\n[2] - Philippines currency (Peso) to United States currency (Dollars)");
    printf("\n[3] - Philippines currency (Peso) to South Korea currency (Won)\n\n");
    scanf("%d", &option);
    switch (option) {
        default:
            printf("\n\nInvalid choice of options. Try choosing again from the given options.\n");
            main();
        break;
        case 1:
            printf("Input your peso amount:");
            scanf("%f", &peso);
            result = peso * 2.24;
            printf("Japanese currency (Yen) = %f", result);
        break;
        case 2:
            printf("Input your peso amount:");
            scanf("%f", &peso);
            result = peso * 0.02;
            printf("United State currency (Dollar) = %f", result);
        break;
        case 3:
            printf("Input your peso amount:");
            scanf("%f", &peso);
            result = peso * 23.41;
            printf("South Korea currency (Won) = %f", result);
        break;
    }
    return 0;
}