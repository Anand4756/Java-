package com.company;

public class patterns {

    public static void main(String[] args){
        int n=4;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 ||i==n || j==1|| j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }
            System.out.println();
        }
        System.out.println();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(' ');
            }
            for(int j=1;j<=n;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(' ');
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(' ');
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
