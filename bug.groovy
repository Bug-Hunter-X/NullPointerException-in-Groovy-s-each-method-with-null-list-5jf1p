```groovy
def myMethod(List<String> list) {
  list.each { element ->
    if (element == null) {
      throw new NullPointerException("List element cannot be null")
    }
    // Process the element
  }
}

//This will throw a NullPointerException
myMethod(null)
```