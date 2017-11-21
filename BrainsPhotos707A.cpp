#include<iostream>

using namespace std;

int main()
{
    int n, m;
    cin>>n>>m;
    char a[n][m];
    bool color = false;
    for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
             cin>>a[i][j];
             char temp = a[i][j];
             if(temp == 'C' || temp == 'M' ||temp == 'Y' ){
                color = true;
             }
        }
    }

    /*for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
             cout<<a[i][j]<<" ";
        }
    }*/

    if(color){
        cout<<"#Color"<<endl;
    }
    else
    {

        cout<<"#Black&White"<<endl;
    }

    return 0;


}
