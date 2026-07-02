# DCIT 204 Lab 2 - Find Maximum Value

numbers = []

n = int(input("How many numbers do you want to enter? "))

for i in range(n):
    num = int(input("Enter number: "))
    numbers.append(num)

maximum = numbers[0]

for num in numbers:
    if num > maximum:
        maximum = num

print("The maximum value is:", maximum)
