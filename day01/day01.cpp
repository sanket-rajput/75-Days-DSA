/*
#include <bits/stdc++.h>  //i/o
using namespace std;

int main() {
    int a;
    char ch;

    cin>>ch;
    cout<<ch;
    
    cin>>a;
    cout<<a;

    return 0;
}


//conditional stats


//1. if Statement Problem: Write a program that takes a user's age as input and prints "Eligible to vote" if the age is 18 or above

#include <iostream>
using namespace std;

int main(){

    int age;
    cin>>age;
    if(age>18){
        cout<<"Eligible to vote"<<endl;
    }
    return 0;
}



//2. if-else Statement Problem: Write a program that takes a number as input and checks whether it is even or odd. Print the respective message.


#include <iostream>
using namespace std;

int main(){

    int no;
    cin>>no;
    if(no%2==0){
        cout<<"Even no."<<endl;
    }
    else{
        cout<<"Odd no."<<endl;
    }
    return 0;
}


//3. if-else-if Ladder
    // Problem: Write a program that takes a student's percentage as input and assigns a grade:

    // 90 and above: A
    // 80 to 89: B
    // 70 to 79: C
    // 60 to 69: D
    // Below 60: Fail

#include <iostream>
using namespace std;

int main(){

    int per;
    cin>>per;
    if (per>90){
        cout<<"Scored A grade!!"<<endl;
    }
    else if(per>80 && per<89){
        cout<<"Scored B grade!!"<<endl;
    }
    else if(per>70 && per<79){
        cout<<"Scored c grade!!"<<endl;
    }
    else if(per>60 && per<69){
        cout<<"Scored D grade!!"<<endl;
    }
    else if(per<60){
        cout<<"Failed";
    }
    return 0;
}





// 4. Nested if Statement
// Problem: Write a program that checks whether a number is positive, negative, or zero. 
//Additionally, if it is positive, check whether it is greater than 100 or not.

#include <iostream>
using namespace std;

int main(){

    int no;
    cin>>no;
    if(no>0){
        if(no>100){
            cout<<"greater than 100 and postive as well"<<endl;
        }
        else{
            
        cout<<"Positive No"<<endl;

        }
    }
    else if(no<0){
        cout<<"Negative no"<<endl;
    }
    else{
        cout<<"No. is zero"<<endl;
    }


    return 0;
}






//5. switch Statement
// Problem: Write a calculator program that takes two numbers and 
// an operator (+, -, *, /) as input and performs the respective operation using a switch statement.


#include <iostream>
using namespace std;

int main(){

    int a,b,c;

    cout<<"Enter a no to perform \n 1. Addition \n 2. Subtraction \n 3. Multiply \n 4. Division "<<endl;
    cin>>c;

    cout<<"Enter val. for A & B : "<<endl;
    cin>>a>>b;

    switch(c){
        case 1:
        cout<<a+b;
        break;

        case 2:
        cout<<a-b;
        break;

        case 3:
        cout<<a*b;
        break;

        case 4:
        cout<<a/b;
        break;

        default:
        cout<<"Enter valid no. ";
    }

    return 0;
}


*/
