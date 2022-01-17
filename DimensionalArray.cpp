#include<iostream>
#include<cmath>

using namespace std;

int main() {
    int VAL[4][4];
    int i, j, k, l;
    for (i = 0; i < 4;i++) {
         if (j>1) {
                cout << "\n";
            }
         cout << "Input values of row " << i + 1 << ": ";
        for (j=0; j<4; j++) {
            if (j==0) {
                cout << "\n";
            }
           cout << "\tInput values of col " << j + 1  << ": ";
            cin >> VAL[i][j];
           
        }
   
    }
    
    cout << "\n\nThe computed squares of each element are:\n";
    for ( k = 0; k<4; k++) {
         if (k>0) {
                cout << "\n";
            }
        cout << "Row " << k + 1 << ": ";
        for (l = 0; l < 4; l++) {
            cout << sqrt(VAL[k][l]) << "\t";
        }
    }

    return 0;
}