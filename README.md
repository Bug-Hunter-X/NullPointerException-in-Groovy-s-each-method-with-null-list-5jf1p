# Groovy NullPointerException in 'each' with Null List

This repository demonstrates a subtle NullPointerException that can occur when using Groovy's `each` method with a null list.  Even with explicit null checks within the `each` loop, a `NullPointerException` will be thrown if the list itself is null.  This is because the `each` method itself doesn't perform a null check on the list before iteration.

## How to Reproduce

1. Clone this repository.
2. Run the `bug.groovy` script.  You will observe a `NullPointerException`.
3. Examine `bugSolution.groovy` for a solution.

## Solution

The solution involves explicitly checking for a null list before calling `each`. This can be accomplished using a simple `if` statement.