#include <iostream>
using namespace std;
int main()
{   
    setlocale(LC_ALL,"RU");
    int digit, c=0, N, P;
    cout << "Enter number: ";
    cin >> N;
    cout << "Enter position: ";
    cin >> P;
    for(int i=N; i>0; i/=10)
    {
        digit = i%10; //последняя цифра
        c++;
        if(c==P){
            cout << "well done: " << digit << endl;
        }
    }
    return 0;
}