        try {
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            
            System.out.print("Enter an index to access the string: ");
            int index = Integer.parseInt(scanner.nextLine());
            
            char character = inputString.charAt(index);
            System.out.println("Character at index " + index + ": " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out of Bounds Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: Invalid input. Please enter a valid integer for the index.");
        }
        
        scanner.close();
    }
}
