#include <stdio.h>
#include <time.h>

void delay(int ms);
void menu();
void input();
void receipt();

char food[][20] = {"Lemon Pie", "Iced Coffee", "Pork Cutlet Bowl", "Takiyaki", "Yaki Dango", "Ramen", "Onigiri", "Curry", "Pocky"};
int price[10] = {59, 49, 99, 79, 89, 59, 99, 59, 79};
int orders[99];

int main() {
    printf("--- FAnime Restuarant ---\n\n");
    delay(500);
    printf("Welcome to our restuarant!\n");
    delay(500);
    printf("Here's our menu:\n");
    delay(1000);
    menu();
    printf("\nEnter the number you like to order: ");
    delay(500);
    input();
    
    return 0;
}

void receipt() {

}

void input() {
    do {
        scanf("%d", )
    } while () {

    }



    scanf("%d", &orders[0]);
    printf("%d", orders[0]);
    printf("Anything else? ");
    int size = sizeof(orders)/sizeof(int);
    // for debug
    printf("%d", orders[size]);
    if (orders[size] == 0) {
       receipt();
    } else {
       input();
    }
}

void menu() {
    int i;
    for (i = 0; i < 9; i++) {
        printf("%d. %s - %dP\n", i + 1, food + i, price[i]);
        delay(250);
    }
    printf("Enter '0' to finished the order.\n");
}

void delay(int ms) {
    long pe;
    clock_t now, then;
    pe = ms * (CLOCKS_PER_SEC/1000);
    now = then = clock();
    while((now-then) < pe) {
        now = clock();
    }
}