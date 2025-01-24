def main():
    # Initialize a list (Python equivalent of an array)
    array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
    
    print("Array (Original memory reference):", id(array))
    # Print the entire list
    print("Array (list representation):", array)
    
    # Print elements using a for loop with indices
    print("Array elements:", end=" ")
    for index in range(len(array)):
        print(array[index], end=" ")
    print()
    
    # Print elements using a direct for loop
    print("Using direct for-loop:", end=" ")
    for value in array:
        print(value, end=" ")
    print()
    
    # Accessing elements
    print("First element:", array[0])
    print("Last element:", array[-1])
    
    # Modifying elements
    array[0] = 42  # Change the first element
    print("Modified first element:", array[0])
    
    # Calculate the sum of all elements
    total = sum(array)
    print("Sum of array elements:", total)
    
    # Find the maximum element
    max_element = max(array)
    print("Maximum element:", max_element)
    
    # Add and remove elements (list-specific features)
    array.append(99)  # Add a new element to the end
    print("After appending 99:", array)
    array.pop()  # Remove the last element
    print("After popping the last element:", array)

if __name__ == "__main__":
    main()
