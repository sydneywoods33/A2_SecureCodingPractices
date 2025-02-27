# A2 Secure Coding Practices

I included all of these as comments on each page, here is a summary if helpful -Sydney

### 1. `Computer.java`
- **Marked attributes as `final`**: Ensures that the attributes cannot be changed once they are initialized, making the class immutable.
- **Removed the no-arg constructor**: Ensures that all attributes are initialized when a `Computer` object is created.
- **Removed setters**: Prevents modification of attributes after the object is created, maintaining immutability.
- **Provided a constructor that initializes all attributes**: Allows setting the attributes at the time of object creation.
- **Added getters**: Provides access to the attributes.

### 2. `Desktop.java`
- **Removed `extends Computer`**: The `Desktop` class no longer inherits from `Computer` to use composition instead of inheritance.
- **Added a private `Computer` instance**: Allows `Desktop` to contain a `Computer` instance.
- **Initialized the `Computer` instance in constructors**: Ensures that the `Computer` attributes are properly set.
- **Delegated methods to the `Computer` instance**: The `getCPU`, `getRAM`, and `getDisk` methods now call the corresponding methods on the `Computer` instance.
- **Updated the `toString` method**: Uses the delegated methods to get the `Computer` attributes.

### 3. `Laptop.java`
- **Removed `extends Computer`**: The `Laptop` class no longer inherits from `Computer` to use composition instead of inheritance.
- **Added a private `Computer` instance**: Allows `Laptop` to contain a `Computer` instance.
- **Initialized the `Computer` instance in constructors**: Ensures that the `Computer` attributes are properly set.
- **Delegated methods to the `Computer` instance**: The `getCPU`, `getRAM`, and `getDisk` methods now call the corresponding methods on the `Computer` instance.
- **Updated the `toString` method**: Uses the delegated methods to get the `Computer` attributes.

### 4. `ManageComputers.java`
- **Changed ArrayList type**: The `ArrayList` now stores `Object` instead of `Computer` to accommodate both `Laptop` and `Desktop` objects.
- **Modified `addComputer()`**: Directly creates `Laptop` and `Desktop` objects instead of modifying a `Computer` object.
- **Modified `editComputer()`**: Replaces existing objects with new immutable `Laptop` or `Desktop` objects instead of modifying them.
- **Updated `showComputers()`**: Iterates over `Object` type and calls `toString()` method to display data.

