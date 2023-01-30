package Assignment_5;

public class Smart_Keypad {
}
//#include <bits/stdc++.h>
//        using namespace std;
//
//        bool ib = ios_base::sync_with_stdio(0);
//        bool it = cin.tie(0);
//
//        void As(char y[], char l[], int e, char _2darr[][5])
//        {
//        if (y[e] == '\0')
//        {
//        l[e] = '\0';
//        cout << l << "\n";
//        return;
//        }
//
//        int k = y[e] - '0';
//        for (size_t g = 0; _2darr[k][g] != '\0'; g++)
//        {
//        l[e] = _2darr[k][g];
//        As(y, l, e + 1, _2darr);
//        }
//        }
//
//        int main()
//        {
//        char _2darr[][5] = {" ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        char y[11], l[11];
//        cin >> y;
//        As(y, l, 0, _2darr);
//        return 0;
//        }