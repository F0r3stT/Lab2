#include <iostream>

using namespace std;
int SearchEven(int num){
    int c = 0, last;
    for(int i=0; i<num; num/=10){
        last=num%10;

        if (last%2==0)
            c++;
    }
    return c;
}
int main(){
    cout << "Enter number of numbers: ";
    int n;
    cin >> n; // количество чисел
    for(int i=0;i<n;i++){
        int k;
        cout << "Enter number: ";
        cin >> k; //число
        cout << SearchEven(k) << " " << endl;
    }
    return 0;
}