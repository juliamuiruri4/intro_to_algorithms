// Step 1: Create hashtable class
// Task: Create a table of balls, size 54

class hashtable {
    // constructor
    constructor() {
        this.table = Array(50); // array has a defined size of 54
        this.size = 0; // variable to store the size
    }

    // Step 2: Create a hash function that will convert the key value into an index
    // Task: Sum up the ASCII values of each character
    // Start the method name using _ to show it's a private class
    _hash(key) {
        let hash = 0;
        for(let i = 0; i < key.length; i++) {
            hash += key.charCodeAt(i);
        }
        return hash % this.table.length; // To ensure we get an index between 0 and 50, use the modulo operator
    }

    // Step 3: Write the set method
    // The set method takes in 2 parameters, key and value, uses the _hash method to transform the key to an index,
    // inserts the key-value pair in the calculated index in the array
    // The size of the array is then incremented by 1
    Set(key, value) {
        const index = this._hash(key);
        this.table[index] = [key, value];
        this.size++;
    };

    // Step 4: Write the get method
    // The get method takes in the key, which is converted to an index using the _hash method, and it brings up the key-value pair at the specified index
    Get(key) {
        const index = this._hash(key);
        return this.table[index];
    }

    // Step 5: Write a method to delete a key-value pair
    Remove(key) {
        const index = this._hash(key);

        // check if the array is empty and that the specified index exists in the array
        if(this.table.length && this.table[index]) {
            this.table[index] = undefined; // replace the existing value with undefined
            this.size--;
        }
        return false;
    }
}


    // Test the hashtable
    // Create a new instance of the class/object
    const test_table = new hashtable();
    test_table.Set("key1", 1);
    test_table.Set("key2", 2);
    test_table.Set("key3", 3);

    console.log(test_table.Get("key1"));
    console.log(test_table.Get("key2"));
    console.log(test_table.Get("key3"));

    test_table.Remove("key1")

    console.log(test_table.Get("key1"));
    console.log(test_table.Get("key2"));
    console.log(test_table.Get("key3"));