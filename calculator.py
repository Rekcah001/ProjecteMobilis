print("This is a simple calculator of addition subtraction multiplication division and modulus operations")
num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))
operator = int(input("Enter the operator( 1(+) 2(-) 3(/) 4(*) 5(%)): "))
if operator == 1:
    sum1 = num1+num2
    print(sum1)

elif operator == 2:
    sum2 = num1-num2
    print(sum2)

elif operator == 3:
    sum3 = num1/num2
    print(sum3)

elif operator == 4:
    sum4 = num1*num2
    print(sum4)

elif operator == 5:
    sum5 = num1 % num2
    print(sum5)

else:
    print("Invalid input!")
