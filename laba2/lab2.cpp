#include <iostream>
#include <vector>
#include <string>

using namespace std;

int SearchColor(string r){
    if (r.length() % 2 != 0) { // проверка на четное количество стержней/цветов
        cout << "Incorrect value ";
        return 0;
    }

    int c=0;
    vector<int> VecR(10,0); // вектора на 10 элементов
    vector<int> VecW(10,0); // по числу стержней от 0 до 9
    vector<int> VecB(10,0);

    for(int i=0;i<r.length();i+=2){ 
        char color = r[i]; 
        //i - цвет i+1 - стержень

        int cod = r[i+1] - '0'; //перевод числа в кодовую систему
// 6 - 54(числовой код) 0 (48) -> 54-48=6 (число 6 преобразуется в инт) 

        if (color == 'R') 
            VecR[cod] = 1;
        else if (color == 'W') 
            VecW[cod] = 1;
        else if (color == 'B')
            VecB[cod] =1 ;
    }
    for (int i=0;i<10;i++){
        if (VecR[i]==1 && VecW[i]==1 && VecB[i]==1)
            c++;
    }
    return c;
}
int main(){
    string a;
    cout << "Enter rods: ";
    cin >> a;
    cout << "Number of rods: " << SearchColor(a) << endl;
    return 0;
}