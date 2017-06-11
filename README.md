# Eliminating randomness in tests

This is an example of how we can use a test double to replace a dependency, allowing testing. We:
- create an `interface` representing how the real object is used
- create a test double that implements that interface
- create a constructor so that we can *inject* the double

In this case, that dependency is a random number generator.

It does a few things you may not have seen yet:

- separate source folders for production (`src`) and test (`test`) code
- using constants, values that are
	- `static` (associated with a class rather than an instance of the class)
	- `final` (values may not be reassigned)