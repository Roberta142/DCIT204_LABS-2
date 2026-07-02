# DCIT 204 Lab 2 - Pair Sum

numbers = []

n = int(input("How many numbers do you want to enter? "))

for i in range(n):
    num = int(input("Enter number: "))
    numbers.append(num)

target = int(input("Enter target sum: "))

found = False

for i in range(len(numbers)):
    for j in range(i + 1, len(numbers)):
        if numbers[i] + numbers[j] == target:
            print("Pair found:", numbers[i], "+", numbers[j], "=", target)
            found = True

if not found:
    print("No pair found")
