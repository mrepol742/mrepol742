#include <iostream>

using namespace std;

int main() {
   int x; 
   cout << "Input number of elements of Arrays A1 and A2: ";
   cin >> x;
   int A1[99];
   int A2[99];
   int SUM[99];

   cout << "\nInput elements of A1\n";
   for (int i = 0; i < x; i++) {
        cout << "\tElement " << i + 1 << ": ";
        cin >> A1[i]; 
   }

   cout << "\nInput elements of A2\n";
   for (int i = 0; i < x; i++) {
        cout << "\tElement " << i + 1 << ": ";
        cin >> A2[i]; 
   }

   for (int i = 0; i < x; i++) {
        SUM[i] = A1[i] + A2[i];
   }

   cout << "\nThe contents of Array SUM are: ";
   for (int i = 0; i < x; i++) {
       cout << SUM[i] << "  ";
   }
   return 0;
}
