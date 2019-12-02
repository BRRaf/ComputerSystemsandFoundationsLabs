#include <stdio.h>


int adder(int a, int b){
int add = a + b;
return add;
}


int main(int argc, const char * argv[]) {

int x = 5;

printf("The value of x is %d \n",x);

if(x > 3){
printf("The value of x in the if statement is %d \n",x);
}


int count = 0;

while (count != 10){
printf("%d \n",count);
count += 1;
}

for(int i = 0; i < 10; i++){
printf("%d \n", i);
}

int list[] = {1,2,3,4,5};
int sum = 0;
for(int j = 0; j <= 4; j++){

sum += list[j];

}

printf("The sum is %d \n", sum);

int y = adder(5,3);

printf("The sum of adder equals %d \n", y);

}