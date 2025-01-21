#include <iostream>
#include <vector>
#include <algorithm>  // For std::for_each
using namespace std;

// Function Overloading
int multiply(int a, int b) {
    return a * b;
}

double multiply(double a, double b) {
    return a * b;
}

// Function with Pass by Reference
void swapValues(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}

// Lambda Function
auto square = [](int x) { return x * x; };

// Recursive Function (Fibonacci)
int fibonacci(int n) {
    if (n <= 1)
        return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

int main() {
    cout << "Function Overloading: " << multiply(4, 5) << " and " << multiply(4.5, 2.2) << endl;

    // Pass by Reference Example
    int x = 10, y = 20;
    cout << "Before Swap: x = " << x << ", y = " << y << endl;
    swapValues(x, y);
    cout << "After Swap: x = " << x << ", y = " << y << endl;

    // Range-based for loop with vector
    vector<int> numbers = {1, 2, 3, 4, 5};
    cout << "Range-based for loop: ";
    for (int num : numbers) {
        cout << num << " ";
    }
    cout << endl;

    // Nested Loop: Multiplication Table
    cout << "Multiplication Table (2 to 4):" << endl;
    for (int i = 2; i <= 4; i++) {
        for (int j = 1; j <= 5; j++) {
            cout << i * j << "\t";
        }
        cout << endl;
    }

    // Using STL Algorithm with for_each
    cout << "Using for_each with Lambda: ";
    for_each(numbers.begin(), numbers.end(), [](int num) { cout << num * num << " "; });
    cout << endl;

    // Calling Recursive Function
    cout << "Fibonacci(6) = " << fibonacci(6) << endl;

    return 0;
}
