```groovy
def myMethod(List<String> list) {
  if (list == null) {
    return // Or handle the null case appropriately
  }
  list.each { element ->
    if (element == null) {
      throw new NullPointerException("List element cannot be null")
    }
    // Process the element
  }
}

// This will not throw an exception
myMethod(null)
```