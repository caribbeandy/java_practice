/* Hello World program */

#include<stdio.h>

void isoscelesOneLoop(r) {

    for(int i=1; i<=r; i++) {

        int num = 2*i-1;
        int space = (2*r-1-num)/2;

        for(int j=1; j<=r-i;j++){
            printf(" ");
        }

        for(int j=1; j<=2*i-1;j++){
            int t = j>i ? j-i : i-j;
            printf("%d", i-t);
        }

        printf("\n");
    }
}

void isoscelesCorrect(r) {


    for(int row=1; row<=r; ++row) {

        for(int c=1; c<=r-row; ++c)
            printf(" ");

        for(int c=1; c<=row; ++c)
            printf("%d", c);

        for(int c=row-1; c>=1; --c)
            printf("%d", c);

        printf("\n");
    }
}

void isoscelesStudent(r) {

    for(int row=1; row<=r; ++row) {

        for(int c=1; c<r-row; ++c)
            printf(" ");

        for(int c=1; c<=row; ++c)
            printf("%d", c-row+1);

        for(int c=1; c<row*2/2; ++c)
            printf("%d", row-c);

        printf("\n");
    }
}

int main()
{

    int n = 4;

    isoscelesCorrect(n);
//    isoscelesStudent(n);
    isoscelesOneLoop(n);
    /*
        spaces:
            c=1, c<=r-row

            c=0, c<r-row
            c=r-row, c>0

            int space = (2*r-1-(2*row+1))/2;

            int space = r-1, 1<=space, space--, 



    */
}
