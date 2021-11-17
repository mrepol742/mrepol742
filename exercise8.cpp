#include <iostream>
using namespace std;

int main() {
    cout << "Enter the length in kilometers: ";
    int kilo, meters;
    cin >> kilo;
    meters = kilo * 1000;
    cout << "The length in meters is: " << meters;
    return 0;
}